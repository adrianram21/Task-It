package Modelo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ListaEnlazadaConCola<T extends Comparable<T>> implements Serializable {

    private Nodo<T> Head;
    private Nodo<T> Tail;

    public void pushFront(T Valor) {
        Nodo Ingreso = new Nodo(Valor);

        if (Head == null) {
            Head = Ingreso;
            Tail = Ingreso;
            Ingreso.setNext(null);
        } else {
            Ingreso.setNext(Head);

            Head = Ingreso;
        }
    }

    public void pushBack(T Valor) {
        Nodo Ingreso = new Nodo(Valor);
        Ingreso.setNext(null);
        if (Head == null) {
            Head = Ingreso;
            Tail = Ingreso;

        } else {
            Tail.setNext(Ingreso);

            Tail = Ingreso;
        }
    }

    public void popFront() {
        if (Head == null) {
            System.out.println("Error");
        } else {
            Head = Head.getNext();
            if (Head == null) {
                Tail = null;
            }
        }
    }

    public void popBack() {
        if (Head == null) {
            System.out.println("Error");
        }
        if (Head == Tail) {
            Head = null;
            Tail = null;
        } else {
            Nodo Aux = Head;
            while (Aux.getNext().getNext() != null) {
                Aux = Aux.getNext();
            }
            Aux.setNext(null);
            Tail = Aux;
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
    Nodo Lectura = Head ;
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
    
        Nodo Lector = Head;
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
        Nodo Lector = Head;
        Nodo Auxiliar = null;
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
      
      public Nodo getHead(){
          return Head;
      }
      
      public Nodo getTail(){
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
            Nodo Ingreso = new Nodo(Valor);
            Nodo Lector = Head;
            Nodo Aux = null;
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
      
          public void GuardarListaEnlazadaConCola(String Doc) {
        try {
            FileOutputStream Archivo = new FileOutputStream(Doc);
            ObjectOutputStream O = new ObjectOutputStream(Archivo);
            O.writeObject(this);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }
      
      public void AddAfter(int Indice, T Valor){
          if(this.Empty() == true){
       System.out.println("La posicion especificada no existe en la lista"); 
    }
    else{
        Nodo Ingreso = new Nodo(Valor);
        Nodo Lector = Head;
        int Contador = 0;
        
        while(Contador != Indice && Lector.getNext() != null){
            Lector = Lector.getNext();
            Contador += 1;             
        }
        if(Contador == Indice){
            Ingreso.setNext(Lector.getNext());
            Lector.setNext(Ingreso);
            if(Tail == Lector){
                Tail = Ingreso;
            }
        }
        else{
            System.out.println("La posicion especificada no existe en la lista");
        }
        }
      }
}
