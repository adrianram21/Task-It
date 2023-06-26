package Modelo;
import Clases.Tarea;
import java.io.Serializable;

public class BinaryMaxHeap implements Serializable {

    private Tarea[] list;
    private int capacity;
    private int size;

    public BinaryMaxHeap(int cap) {
        capacity = cap;
        list = new Tarea[cap];
        size = 0;

    }

    public int Parent(int i) {
        return (i - 1) / 2;
    }

    public int LeftChild(int i) {
        return (2 * i) + 1;
    }

    public int RightChild(int i) {
        return 2 * (i + 1);
    }

    public void SiftUp(int i) {
        while (i > 0 && list[Parent(i)].getPrioridad() < list[i].getPrioridad()) {
            Tarea temp = list[Parent(i)];
            list[Parent(i)] = list[i];
            list[i] = temp;
            i = Parent(i);
        }
    }

    public void SiftDown(int i) {
        int MaxIndice = i;
        int l = LeftChild(i);
        if (l <= size - 1 && list[l].getPrioridad() > list[MaxIndice].getPrioridad()) {
            MaxIndice = l;
        }
        int r = RightChild(i);
        if (r <= size - 1 && list[r].getPrioridad() > list[MaxIndice].getPrioridad()) {
            MaxIndice = r;
        }

        if (i != MaxIndice) {
            Tarea temp = list[i];
            list[i] = list[MaxIndice];
            list[MaxIndice] = temp;
            SiftDown(MaxIndice);
        }
    }

    public void Insert(Tarea p) {
        if (size == capacity) {
            capacity = 2 * capacity;
            Tarea[] Lista;
            Lista = new Tarea[capacity];
            for (int i = 0; i < size; i++) {
                Lista[i] = list[i];
            }
            list = Lista;
            size = size + 1;
            list[size - 1] = p;
            SiftUp(size - 1);
            
        } else {
            size = size + 1;
            list[size - 1] = p;
            SiftUp(size - 1);

        }
    }

    public Tarea ExtractMax() {
        if(size == 0){
            return null;
        }
        else{
            Tarea Resultado = list[0];
            list[0] = list[size - 1];
            size--;
            SiftDown(0);
            return Resultado;
        }
        
    }

    public void Remove(int i) {
        list[i].setPrioridad(list[0].getPrioridad() + 1);
        SiftUp(i);
        ExtractMax();
    }

    public void ChangePriority(int i, int p) {
        int oldp = list[i].getPrioridad();
        list[i].setPrioridad(p);
        if (p > oldp) {
            SiftUp(i);
        } else {
            SiftDown(i);
        }
    }

    public void Imprimir() {
        for (int i = 0; i < size; i++) {
            System.out.println(list[i].getPrioridad());
        }
    }

    public Tarea GetMax() {
        return list[0];
    }
    
    public Tarea[] getTarea(){
        return this.list;
    }
    
    public int getCapacidad(){
        return this.capacity;
    }
    
    public int getLongitud(){
        return this.size;
    }
    
    public void setTarea(Tarea[] Lista){
        this.list = Lista;
    }
    
    public void setCapacidad(int Capacidad){
        this.capacity = Capacidad;
    }
    
    public void setLongitud(int Longitud){
        this.size = Longitud;
    }

}
