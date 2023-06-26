package FuncionesHash;

import java.io.Serializable;

public class HashString implements Serializable{

    private int P;
    private int X;

    public HashString(int P, int X) {
        this.P = P;
        this.X = X;
    }

    public int Calcular(String Cadena) {
        int Hash = 0;
        for (int i = Cadena.length() - 1; i >= 0; i--) {
            Hash = (Hash * P + Cadena.charAt(i)) % P;
        }
        return Hash;
    }

    public boolean CompareHashes(String Cadena1, String Cadena2) {
        int hash1 = Calcular(Cadena1);
        int hash2 = Calcular(Cadena2);
        return hash1 == hash2;
    }

    public int getX() {
        return this.X;
    }

    public int getP() {
        return this.P;
    }

    public void setX(int X) {
        this.X = X;
    }

    public void setP(int P) {
        this.P = P;
    }
}
