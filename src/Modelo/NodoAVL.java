package Modelo;

import java.io.Serializable;

public class NodoAVL<T extends Comparable<T>> implements Serializable {
  private T Data;
  private int Height;
  private NodoAVL Derecho;
  private NodoAVL Izquierdo;

  public NodoAVL(T x){
    this.Data = x;
    this.Height = 0;
    this.Derecho = null;
    this.Izquierdo = null;
    
    }

  public T getData(){
    return this.Data;
    }
  
  public NodoAVL getDerecho(){
    return this.Derecho;
    }
  
  public NodoAVL getIzquierdo(){
    return this.Izquierdo;
    }
  
  public int getHeight(){
      return this.Height;
  }
  
  public void setData(T x){
    this.Data = x;
    }
  
  public void setDerecho(NodoAVL x){
    this.Derecho = x;
    }
  
  public void setIzquierdo(NodoAVL x){
    this.Izquierdo = x;
    }   
  
  public void setHeight(int x){
    this.Height = x;
    }  
}
