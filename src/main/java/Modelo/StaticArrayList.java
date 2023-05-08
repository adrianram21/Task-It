package Modelo;

import java.io.Serializable;

public class StaticArrayList<T extends Comparable<T>> implements Serializable {
    private T[] Lista;
    private int Capacidad;
    private int Longitud;
    
        public StaticArrayList(int cap) {
        Capacidad = cap;
        Lista = (T[]) new Comparable[cap];
        Longitud = 0;
    }

    public void Print() {
        for (int i = 0; i < Capacidad; i++){
            System.out.print(Lista[i] + " ");
        System.out.println();}
    }
    public String Converterstring() {
        String str= "";
        for (int i = 0; i < Capacidad; i++){
            str= str + (Lista[i] + " ");}
        return str;
     
    }
    public boolean Full() {
        return Longitud == Capacidad;
    }

    public boolean Empty() {
        return Longitud == 0;
    }
    public void PopFront() {
      if (!Empty()) {
            Longitud--;
            T[] newLista;
            newLista= (T[]) new Comparable[Capacidad];
            for(int i = 0; i < Longitud;i++){
              newLista[i] = Lista[i+1];
            }
            Lista = newLista;
       }
      else{
        System.out.println("Esta vacía");
      }
    }
    public void PopBack() {
        if (!Empty()){
            Longitud--;
            T[] newLista;
            newLista= (T[]) new Comparable[Capacidad];
            for(int i = 0; i < Longitud; i++){
              newLista[i] = Lista[i];
            }
            Lista = newLista;
        }
        else
            System.out.println("Lista vacía");
    }

    public void PushBack(T Valor) {
        if (!Full()){
            Lista[Longitud++] = Valor;
            
        }
        else{
            System.out.println("Sin espacio");
       }
    }
    public void PushFront(T Valor) {
      if (!Full()){
        T[] newLista;
        newLista= (T[]) new Comparable[Capacidad];
        newLista[0] = Valor;
        for(int i = 0; i < Longitud; i++){
            newLista[i+1] = Lista[i];
            }
            Longitud++;
            Lista = newLista;
      }
      else{
        System.out.println("Sin espacio");}
    }    
    
    
    public int Length(){
      return Longitud;
    }
    
    public T Max(){
      T Max = Lista[0];
      T j = null;
      for(int i = 0 ; i < Longitud ; i++){
           if(Lista[i].compareTo(Max) >= 0){
             Max = Lista[i];
           }
    }
      return Max;
    }
    
    public void Delete(T Valor){
      T[] reLista;
      reLista = (T[]) new Comparable[Capacidad];
      int i  = 0;
      while(i < Longitud && Lista[i].compareTo(Valor) != 0){
          reLista[i] = Lista[i];
          i++;
      }
      if(Lista[i].compareTo(Valor) == 0){
          for(int k = i; k < Longitud-1; k++){
            reLista[k] = Lista[k+1];
          }
          Longitud--;
          Lista = reLista;
      }
    }
    
    public T[] getLista(){
        return Lista;
    }
    
    public int getCapacidad(){
        return Capacidad;
    }
    
}

