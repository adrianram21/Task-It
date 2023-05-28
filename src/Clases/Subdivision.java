package Clases;

import Modelo.*;
import java.io.Serializable;

public class Subdivision implements Comparable<Subdivision>, Serializable{
    String Nombre;
    BinaryMaxHeap Tareas;
    AVL<Tarea> TareasEnProgreso;
    PilaListaEnlazada<Tarea> TareasFinalizadas;
    
    public Subdivision(String Nombre, BinaryMaxHeap Tareas, AVL<Tarea> TareasEnProgreso, PilaListaEnlazada<Tarea> TareasFinalizadas){
        this.Nombre = Nombre;
        this.Tareas = Tareas;
        this.TareasEnProgreso = TareasEnProgreso;
        this.TareasFinalizadas = TareasFinalizadas;
    }
    
    public String getNombre(){
        return this.Nombre;
    }
    public BinaryMaxHeap getTareas(){
        return this.Tareas;
    }
    public AVL<Tarea> getTareasEnProgreso(){
        return this.TareasEnProgreso;
    }
    public PilaListaEnlazada<Tarea> getTareasFinalizadas(){
        return this.TareasFinalizadas;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public void setTareas(BinaryMaxHeap Tareas){
        this.Tareas = Tareas;
    }
    public void setTareasEnProgreso(AVL<Tarea> TareasEnProgreso){
        this.TareasEnProgreso = TareasEnProgreso;
    }
    public void setTareasFinalizadas(PilaListaEnlazada<Tarea> TareasFinalizadas){
        this.TareasFinalizadas = TareasFinalizadas;
    }

    public int compareTo(Subdivision x) {
        if(this.Nombre.compareTo(x.getNombre()) < 0){
            return -1;
        }
        else if(this.Nombre.equals(x.getNombre()) == true){
            return 0;
        }
        else{
            return 1;
        }
    }
    }
