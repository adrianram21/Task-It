package Clases;

import Modelo.*;
import java.io.Serializable;

public class Subdivision implements Comparable<Subdivision>, Serializable{
    String Nombre;
    ColaListaEnlazada<Tarea> Tareas;
    ListaDoblementeEnlazadaConCola<Tarea> TareasEnProgreso;
    PilaListaEnlazada<Tarea> TareasFinalizadas;
    
    public Subdivision(String Nombre, ColaListaEnlazada<Tarea> Tareas, ListaDoblementeEnlazadaConCola<Tarea> TareasEnProgreso, PilaListaEnlazada<Tarea> TareasFinalizadas){
        this.Nombre = Nombre;
        this.Tareas = Tareas;
        this.TareasEnProgreso = TareasEnProgreso;
        this.TareasFinalizadas = TareasFinalizadas;
    }
    
    public String getNombre(){
        return this.Nombre;
    }
    public ColaListaEnlazada<Tarea> getTareas(){
        return this.Tareas;
    }
    public ListaDoblementeEnlazadaConCola<Tarea> getTareasEnProgreso(){
        return this.TareasEnProgreso;
    }
    public PilaListaEnlazada<Tarea> getTareasFinalizadas(){
        return this.TareasFinalizadas;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public void setTareas(ColaListaEnlazada<Tarea> Tareas){
        this.Tareas = Tareas;
    }
    public void setTareasEnProgreso(ListaDoblementeEnlazadaConCola<Tarea> TareasEnProgreso){
        this.TareasEnProgreso = TareasEnProgreso;
    }
    public void setTareasFinalizadas(PilaListaEnlazada<Tarea> TareasFinalizadas){
        this.TareasFinalizadas = TareasFinalizadas;
    }

    public int compareTo(Subdivision x) {
        return 0;
    }
    }

