package Modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ListaEnlazada<T extends Comparable<T>> implements Serializable{
    private Nodo<T> Head;

  public void pushFront(T Valor){
    Nodo<T> Ingreso = new Nodo(Valor);
    Ingreso.setNext(Head);
    Head = Ingreso;
  }
  
  public void pushBack(T Valor){
    Nodo<T> Ingreso = new Nodo(Valor);
    Ingreso.setNext(null);
    if (this.Empty() == true) {
      Head = Ingreso;
    }
    else{
        Nodo<T> Aux = Head;
    while (Aux.getNext() != null) {
      Aux = Aux.getNext();
    }
    Aux.setNext(Ingreso);
    }  
  }
  
    public void popFront(){
    if(this.Empty() == true){
        System.out.println("Error");
    }
    else {
        Head = Head.getNext();
    }
  }
    
      public void popBack(){
    if(this.Empty() == true){
        System.out.println("Error");
    }
    else if(Head.getNext() == null){
        Head = null;
    }
    else{
        Nodo<T> Aux = Head;
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
        Nodo<T> Lector = Head;
    while(Lector.getNext() != null){
        Lector = Lector.getNext();       
}
  return Lector.getData();
    }
    
}
  
  public void Imprimir(){
    Nodo<T> Lectura = Head ;
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
    
        Nodo<T> Lector = Head;
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
        Nodo<T> Lector = Head;
        Nodo<T> Auxiliar = null;
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

public Nodo<T> getHead(){
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
        Nodo<T> Ingreso = new Nodo(Valor);
        Nodo<T> Lector = Head;
        Nodo<T> Aux = null;
        int Contador = 0;
        while(Contador != Indice && Lector.getNext() != null){
              Aux = Lector;
              Lector = Lector.getNext();
              Contador += 1;  
            }  
        if(Contador == Indice){
            Aux.setNext(Ingreso);
            Ingreso.setNext(Lector);
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
        Nodo<T> Ingreso = new Nodo(Valor);
        Nodo<T> Lector = Head;
        int Contador = 0;
        while(Contador != Indice && Lector.getNext() != null){
            Lector = Lector.getNext();
            Contador += 1;             
        }
        if(Contador == Indice){
            Ingreso.setNext(Lector.getNext());
            Lector.setNext(Ingreso);
        }
        else{
            System.out.println("La posicion especificada no existe en la lista");
        }
        }
    }

public ListaEnlazada<T> CargarListaSimplementeEnlazada(String Doc){
        ListaEnlazada<T> ListaSimple = null;
            try{
                FileInputStream Archivo = new FileInputStream(Doc);                
                ObjectInputStream O = new ObjectInputStream(Archivo);            
                Object Lista = O.readObject();          
                ListaSimple = (ListaEnlazada<T>) Lista;   
            }
            catch(FileNotFoundException ex){               
            }
            catch(IOException ex){               
            }  
            catch(ClassNotFoundException ex){                
            }
        return ListaSimple;
    }
    
    public void GuardarListaSimplementeEnlazada(String Doc){
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

