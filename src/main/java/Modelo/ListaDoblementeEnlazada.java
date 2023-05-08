
package Modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ListaDoblementeEnlazada<T extends Comparable<T>> implements Serializable{
    private NodoDobleEnlace<T> Head;
   
    public void pushFront(T Valor){
        NodoDobleEnlace Ingreso = new NodoDobleEnlace(Valor);
        Ingreso.setPrev(null);
        if(this.Empty() == true){            
            Head = Ingreso;
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
        if(this.Empty() == true){
            Head = Ingreso;
            Ingreso.setPrev(null);
        }
        else{            
            NodoDobleEnlace<T> Aux = Head;
            while (Aux.getNext() != null) {
            Aux = Aux.getNext();
            }
            Ingreso.setPrev(Aux);
            Aux.setNext(Ingreso);
        }
    }
    
    public void popFront(){
        if(this.Empty() == true){
            System.out.println("Error");
        }
        else{
            Head = Head.getNext();
            if(Head != null){
                Head.setPrev(null);
            }          
        }
    }
    
    public void popBack(){
        if (this.Empty() == true){
            System.out.println("Error");
        }
        else if(Head.getNext() == null){
        Head = null;
        }
        else{
        NodoDobleEnlace<T> Aux = Head;
        while(Aux.getNext().getNext() != null){
        Aux = Aux.getNext();
    }
        Aux.setNext(null);
    }
    }
    
    public T TopFront(){
        if(this.Empty() == true){
            return null;
        }
        else{
            return Head.getData();
        }
    }
    
    public T TopBack(){
        if(this.Empty() == true){
            return null;
        }
        else{
            NodoDobleEnlace<T> Lector = Head;
            while(Lector.getNext() != null){
            Lector = Lector.getNext();       
        }
        return Lector.getData();
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
    if(this.Empty() == true){
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
    return Head == null;
}
      
      public NodoDobleEnlace getHead(){
          return Head;
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
      
      public void AddAfter(int Indice, int Valor){
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
        }
        else{
            System.out.println("La posicion especificada no existe en la lista");
        }
        }
      }
     
      public ListaDoblementeEnlazada<T> CargarListaDoble(String Doc){
        ListaDoblementeEnlazada<T> ListaDoble = null;
            try{
                FileInputStream Archivo = new FileInputStream(Doc);                
                ObjectInputStream O = new ObjectInputStream(Archivo);            
                Object Lista = O.readObject();          
                ListaDoble = (ListaDoblementeEnlazada<T>) Lista;   
            }
            catch(FileNotFoundException ex){               
            }
            catch(IOException ex){               
            }  
            catch(ClassNotFoundException ex){                
            }
        return ListaDoble;
    }
    
    public void GuardarListaDoble(String Doc){
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
