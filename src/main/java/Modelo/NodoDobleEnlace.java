package Modelo;

import java.io.Serializable;

public class NodoDobleEnlace<T> implements Serializable{
    private T Data;
    private NodoDobleEnlace<T> Next;
    private NodoDobleEnlace<T> Prev;

  public NodoDobleEnlace(T x){
    Data = x;
    Next = null;
    Prev = null;
    }

  public T getData(){
    return Data;
    }
  public NodoDobleEnlace getNext(){
    return Next;
    }
  public NodoDobleEnlace getPrev(){
      return Prev;
  }
  public void setData(T x){
    Data = x;
    }
  public void setNext(NodoDobleEnlace x){
    Next = x;
    }
  public void setPrev(NodoDobleEnlace x){
      Prev = x;
  }
}
