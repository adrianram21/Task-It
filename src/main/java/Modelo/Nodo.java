package Modelo;

import java.io.Serializable;

public class Nodo<T extends Comparable<T>> implements Serializable{
    private T Data;
    private Nodo<T> Next;

  public Nodo(T x){
    Data = x;
    Next = null;
    }

  public T getData(){
    return Data;
    }
  public Nodo getNext(){
    return Next;
    }
  public void setData(T x){
    Data = x;
    }
  public void setNext(Nodo x){
    Next = x;
    }
}
