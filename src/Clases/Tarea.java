package Clases;

import java.io.Serializable;

public class Tarea implements Comparable<Tarea>, Serializable{
    private String InfoTarea;
    private int ID;
    private int Prioridad;
    
    public Tarea(String InfoTarea, int ID, int Prioridad){
        this.InfoTarea = InfoTarea;
        this.ID = ID;
        this.Prioridad = Prioridad;
    }
    
    public String getInfoTarea(){
        return this.InfoTarea;
    }
    public int getID(){
        return this.ID;
    }
    public int getPrioridad(){
        return this.Prioridad;
    }
    public void setInfoTarea(String InfoTarea){
        this.InfoTarea = InfoTarea;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public void setPrioridad(int Prioridad){
        this.Prioridad = Prioridad;
    }
    
    public int compareTo(Tarea Tarea){
        if(this.ID == Tarea.getID()){
            return 0;
        }
        else if(this.ID > Tarea.getID()){
            return 1;
        }
        else{
            return -1;
        }    
    }
}
