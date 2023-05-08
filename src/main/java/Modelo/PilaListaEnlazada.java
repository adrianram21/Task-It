package Modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PilaListaEnlazada<T extends Comparable<T>> implements Serializable{
    ListaEnlazada<T> Pila;
    
    public PilaListaEnlazada(){
        Pila = new ListaEnlazada();
    }
    
    public void Push(T Valor){
        Pila.pushFront(Valor);
    }
    
    public T Top(){
        return Pila.TopFront();
    }
    
    public T Pop(){
        T Valor = Pila.TopFront();
        Pila.popFront();
        return Valor;
    }
    
    public Boolean Empty(){
        return Pila.Empty();
    }
    
    public PilaListaEnlazada<T> CargarPila(String Doc){
        PilaListaEnlazada<T> Pila = null;
            try{
                FileInputStream Archivo = new FileInputStream(Doc);                
                ObjectInputStream O = new ObjectInputStream(Archivo);            
                Object Lista = O.readObject();          
                Pila = (PilaListaEnlazada<T>) Lista;   
            }
            catch(FileNotFoundException ex){               
            }
            catch(IOException ex){               
            }  
            catch(ClassNotFoundException ex){                
            }
        return Pila;
    }
    
    public void GuardarPila(String Doc){
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
