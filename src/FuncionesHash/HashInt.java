package FuncionesHash;

import java.io.Serializable;

public class HashInt implements Serializable{
    private int A;
    private int B;
    private int P;
    
    public HashInt(int A, int B, int P){
        this.A = A;
        this.B = B;
        this.P = P;
    }
    
    public int Calcular(int X, int Cardinalidad){
        return (((A*X)+B)%P)%Cardinalidad;
    }
    
    public int getA(){
        return this.A;
    }
    
    public int getB(){
        return this.B;
    }
    
    public int getP(){
        return this.P;
    }
    
    public void setA(int A){
        this.A = A;
    }
    
    public void setB(int B){
        this.B = B;
    }
    
    public void setP(int P){
        this.P = P;
    }
}
