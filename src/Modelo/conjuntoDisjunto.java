package Modelo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class conjuntoDisjunto<T> implements Serializable, Comparable<conjuntoDisjunto<T>>{
    private List<Integer> parentIndices;
    private List<T> objects;
    private List<Integer> rank;

    public conjuntoDisjunto() {
        parentIndices = new ArrayList<>();
        objects = new ArrayList<>();
        rank = new ArrayList<>();
    }

    public void makeSet(T x) {
        parentIndices.add(parentIndices.size());
        objects.add(x);
        rank.add(0);
    }

    private int findRootIndex(int index) {
        if (index != parentIndices.get(index)) {
            parentIndices.set(index, findRootIndex(parentIndices.get(index)));
        }
        return parentIndices.get(index);
    }

    public int find(T x) {
    int index = objects.indexOf(x);
    if (index != -1) {
        int rootIndex = findRootIndex(index);
        return rootIndex;
    }
    return -1;
}

    public List<T> getObjects(){
        return this.objects;
    }

    public void union(T x, T y) {
        int rootX = findRootIndex(objects.indexOf(x));
        int rootY = findRootIndex(objects.indexOf(y));
        if (rootX != -1 && rootY != -1 && rootX != rootY) {
            if (rank.get(rootX) < rank.get(rootY)) {
                parentIndices.set(rootX, rootY);
            } else if (rank.get(rootX) > rank.get(rootY)) {
                parentIndices.set(rootY, rootX);
            } else {
                parentIndices.set(rootY, rootX);
                rank.set(rootX, rank.get(rootX) + 1);
            }
        }
    }

        public int compareTo(conjuntoDisjunto<T> other) {
        int thisSize = getSize();
        int otherSize = other.getSize();
        return Integer.compare(thisSize, otherSize);
    }

    private int getSize() {
        int count = 0;
        for (int i = 0; i < objects.size(); i++) {
            if (objects.get(i).equals(i)) {
                count++;
            }
        }
        return count;
    }
    
    public void GuardarConjunto(String Doc){
        try {
            FileOutputStream Archivo = new FileOutputStream(Doc);
            ObjectOutputStream O = new ObjectOutputStream(Archivo);            
            O.writeObject(this);
        } catch (FileNotFoundException ex) {
            // Manejo de excepción para archivo no encontrado
        } catch (IOException ex) {
            // Manejo de excepción para error de entrada/salida
        }  
    }
}
