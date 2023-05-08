package Modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ListaDoblementeEnlazadaConCola<T extends Comparable<T>> implements Serializable{
    private NodoDobleEnlace<T> Head;
    private NodoDobleEnlace<T> Tail;
   
    public void pushFront(T Valor){
        NodoDobleEnlace Ingreso = new NodoDobleEnlace(Valor);
        Ingreso.setPrev(null);
        if(Head == null){            
            Head = Ingreso;
            Tail = Ingreso;
            Ingreso.setNext(null);
        }
        else{
            Ingreso.setNext(Head);
            Head.setPrev(Ingreso);
            Head = Ingreso;
        }  
    }
    
    public void pushBack(T Valor){
        NodoDobleEnlace Ingreso = new NodoDobleEnlace(Valor);
        Ingreso.setNext(null);
        if(Head == null){
            Head = Ingreso;
            Tail = Ingreso;
            Ingreso.setPrev(null);
        }
        else{            
            Tail.setNext(Ingreso);
            Ingreso.setPrev(Tail);
            Tail = Ingreso;
        }
    }
    
    public void popFront(){
        if(Head == null){
            System.out.println("Error");
        }
        else{
            Head = Head.getNext();            
            if(Head == null){
                Tail = null;
            }
            else{
                Head.setPrev(null);
            }
        }
    }
    
    public void popBack(){
        if (Head == null){
            System.out.println("Error");
        }
        if(Head == Tail){
        Head = null;
        Tail = null;
        }
        else{
        Tail = Tail.getPrev();
        Tail.setNext(null);
    }
    }
    
    public T TopFront(){
        if(Head == null){
            return null;
        }
        else{
            return Head.getData();
        }
    }
    
    public T TopBack(){
        if(Tail == null){
            return null;
        }
        else{           
        return Tail.getData();
        }
    }
    
      public void Imprimir(){
    NodoDobleEnlace Lectura = Head ;
    while(Lectura != null){
        if(Lectura.getNext() == null){
            System.out.print(Lectura.getData());           
        }
        else{
            System.out.print(Lectura.getData()+ " ");
            
        }  
        Lectura = Lectura.getNext();         
      }
    }
      
      public Boolean Find(T Valor){
    
        NodoDobleEnlace<T> Lector = Head;
        while(Lector != null && Lector.getData() != Valor){
        Lector = Lector.getNext();
        }
        if(Lector == null){
            return false;
        }
        else{
            return Lector.getData() == Valor;
        }
        }
      
      public void Erase(T Valor){
    if(Head == null){
        System.out.println("No hay elementos para borrar");
    }
    else{
        NodoDobleEnlace Lector = Head;
        NodoDobleEnlace Auxiliar = null;
        while(Lector != null && Lector.getData() != Valor){
            Auxiliar = Lector;
            Lector = Lector.getNext();
        }       
        if(Lector == null){
            System.out.println("El elemento no existe dentro de la lista");
        }
        else if(Lector == Head){
            Head = Head.getNext();
        }
        else{
            Auxiliar.setNext(Lector.getNext());
        }
    }
    
}
      public Boolean Empty(){
    return ((Head == null) && (Tail == null));
}
      
      public NodoDobleEnlace getHead(){
          return Head;
      }
      
      public NodoDobleEnlace getTail(){
        return Tail;
      }
      
      public void AddBefore(int Indice, T Valor){
        if(this.Empty() == true){
            System.out.println("La posicion especificada no existe en la lista");
        }   
        else if(this.Empty() == false && Indice == 0){
            this.pushFront(Valor);
        }
        else{
            NodoDobleEnlace Ingreso = new NodoDobleEnlace(Valor);
            NodoDobleEnlace Lector = Head;
            int Contador = 0;
            while(Contador != Indice && Lector.getNext() != null){
              Lector = Lector.getNext();
              Contador += 1;  
            }  
            if(Contador == Indice){
                Ingreso.setNext(Lector);
                Ingreso.setPrev(Lector.getPrev());
                Lector.setPrev(Ingreso);
                Ingreso.getPrev().setNext(Ingreso);
            } 
            else{
                System.out.println("La posicion especificada no existe en la lista");
            }
        }
      }
      
      public void AddAfter(int Indice, T Valor){
          if(this.Empty() == true){
       System.out.println("La posicion especificada no existe en la lista"); 
    }
    else{
        NodoDobleEnlace Ingreso = new NodoDobleEnlace(Valor);
        NodoDobleEnlace Lector = Head;
        int Contador = 0;
        while(Contador != Indice && Lector.getNext() != null){
            Lector = Lector.getNext();
            Contador += 1;             
        }
        if(Contador == Indice){
            Ingreso.setNext(Lector.getNext());
            Ingreso.setPrev(Lector);
            Lector.setNext(Ingreso);
            if(Ingreso.getNext() != null){
                Ingreso.getNext().setPrev(Ingreso);
            }
            if(Tail == Lector){
                Tail = Ingreso;
            }
        }
        else{
            System.out.println("La posicion especificada no existe en la lista");
        }
        }
      }
      
    public ListaDoblementeEnlazadaConCola<T> CargarListaDobleConCola(String Doc){
        ListaDoblementeEnlazadaConCola<T> ListaDobleConCola = null;
            try{
                FileInputStream Archivo = new FileInputStream(Doc);                
                ObjectInputStream O = new ObjectInputStream(Archivo);            
                Object Lista = O.readObject();          
                ListaDobleConCola = (ListaDoblementeEnlazadaConCola<T>) Lista;   
            }
            catch(FileNotFoundException ex){               
            }
            catch(IOException ex){               
            }  
            catch(ClassNotFoundException ex){                
            }
        return ListaDobleConCola;
    }
    
    public void GuardarListaDobleConCola(String Doc){
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
