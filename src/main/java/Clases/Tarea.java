package Clases;

import java.io.Serializable;

public class Tarea implements Comparable<Tarea>, Serializable{
    private String InfoTarea;
    private int ID;
    
    public Tarea(String InfoTarea, int ID){
        this.InfoTarea = InfoTarea;
        this.ID = ID;
    }
    
    public String getInfoTarea(){
        return this.InfoTarea;
    }
    public int getID(){
        return this.ID;
    }
    public void setInfoTarea(String InfoTarea){
        this.InfoTarea = InfoTarea;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    
    public int compareTo(Tarea Tarea){
        if(this.ID == Tarea.getID()){
            return 1;
        }
        else{
            return 0;
        }
        
    }
}
