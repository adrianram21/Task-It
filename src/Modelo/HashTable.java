package Modelo;

import FuncionesHash.*;
import Clases.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class HashTable implements Serializable {

    private int CantidadDeValores;
    private ListaEnlazadaConCola[] Lista;
    private int Capacidad;
    private int P1;
    private int P2;
    private HashInt HashInt;
    private HashString HashString;

    public HashTable(int Capacidad, int P1, int P2) {
        this.Lista = new ListaEnlazadaConCola[Capacidad];
        this.Capacidad = Capacidad;
        this.CantidadDeValores = 0;
        this.HashInt = new HashInt(P1 - 2, P1 - 5, P1);
        this.HashString = new HashString(P2, P2 - 5);
        for (int i = 0; i < Capacidad; i++) {
            Lista[i] = new ListaEnlazadaConCola<Subdivision>();
        }
    }

    public int Hash(String Cadena) {
        int Hash1 = HashString.Calcular(Cadena);
        int Hash2 = HashInt.Calcular(Hash1, Capacidad);
        return Hash2;
    }

    public void Insert(Subdivision Subdivision) {
        int Indice = Hash(Subdivision.getNombre());
        Lista[Indice].pushBack(Subdivision);
        CantidadDeValores++;
        Rehash();
    }

    public void Remove(Subdivision Subdivision) {
        int Indice = Hash(Subdivision.getNombre());
        Lista[Indice].Erase(Subdivision);
        CantidadDeValores--;
    }

    public Subdivision Find(Subdivision Subdivision) {
        int Indice = Hash(Subdivision.getNombre());
        Nodo<Subdivision> Lector = Lista[Indice].getHead();
        while (Lector != null && Lector.getData().compareTo(Subdivision) != 0) {
            Lector = Lector.getNext();
        }
        if (Lector == null) {
            return null;
        } else {
            return Lector.getData();
        }
    }

    public void GuardarHashTable(String Doc) {
        try {
            FileOutputStream Archivo = new FileOutputStream(Doc);
            ObjectOutputStream O = new ObjectOutputStream(Archivo);
            O.writeObject(this);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    public void Rehash() {

        float FactorDeCarga = CantidadDeValores / Capacidad;
        if (FactorDeCarga > 0.75) {
            int CapacidadPrev = Capacidad;
            int CantidadDeValoresPrev = CantidadDeValores;
            ListaEnlazadaConCola[] Temp = Lista;

            Capacidad = 2 * Capacidad;
            Lista = new ListaEnlazadaConCola[Capacidad];

            for (int i = 0; i < Capacidad; i++) {
                Lista[i] = new ListaEnlazadaConCola<Subdivision>();
            }
            int Valores = 0;
            for (int i = 0; i < CapacidadPrev; i++) {
                Nodo<Subdivision> Lectura = Temp[i].getHead();
                if (Valores == CantidadDeValoresPrev) {
                    break;
                }
                while (Lectura != null && Valores != CantidadDeValoresPrev) {
                    Insert(Lectura.getData());
                    Valores++;
                    Lectura = Lectura.getNext();
                }
            }
            CantidadDeValores = Valores;
        }
    }


    public int getCantidadDeValores() {
        return this.CantidadDeValores;
    }

    public ListaEnlazadaConCola[] getLista() {
        return this.Lista;
    }

    public int getCapacidad() {
        return this.Capacidad;
    }

    public void setCantidadDeValores(int CantidadDeValores) {
        this.CantidadDeValores = CantidadDeValores;
    }

    public void setLista(ListaEnlazadaConCola[] Lista) {
        this.Lista = Lista;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

}
