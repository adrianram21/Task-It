package Modelo;

import Clases.Subdivision;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ColaListaEnlazada<T extends Comparable<T>> implements Serializable{
    ListaEnlazadaConCola<T> Cola;
    
    public ColaListaEnlazada(){
        Cola = new ListaEnlazadaConCola();
    }
    
    public void Enqueue(T Valor){
        Cola.pushBack(Valor);
    }
    
    public T Dequeue(){
        T Valor = Cola.TopFront();
        Cola.popFront();
        return Valor;
    }
    
    public Boolean Empty(){
        return Cola.Empty();
    }
    
    public void GuardarCola(String Doc){
        try{
            FileOutputStream Archivo = new FileOutputStream(Doc);
            ObjectOutputStream O = new ObjectOutputStream(Archivo);            
            O.writeObject(this);
        }
        catch(FileNotFoundException ex){
                
            }
        catch(IOException ex){
                
            }  
    }
}
