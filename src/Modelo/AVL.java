package Modelo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class AVL<T extends Comparable<T>> implements Serializable {

    private NodoAVL root;

    public AVL() {
        root = null;
    }
    
    public int Balance(NodoAVL Nodo){
        if(Nodo == null){
            return 0;
        }
        else{
            return verHeight(Nodo.getIzquierdo()) - verHeight(Nodo.getDerecho());
        }
    }
    
    public int verHeight(NodoAVL Nodo){
        if(Nodo == null){
            return 0;
        }
        else{
            return Nodo.getHeight();
        }
    }

    public NodoAVL getRoot() {
        return root;
    }

    public void AdjustHeight(NodoAVL Nodo) {
        Nodo.setHeight(1 + Integer.max(verHeight(Nodo.getIzquierdo()), verHeight(Nodo.getDerecho())));
    }

    public int Height(NodoAVL Nodo) {
        if (Nodo == null) {
            return 0;
        } else {
            return 1 + Integer.max(Height(Nodo.getIzquierdo()), Height(Nodo.getDerecho()));
        }
    }

    public int Size(NodoAVL Nodo) {
        if (Nodo == null) {
            return 0;
        } else {
            return 1 + Size(Nodo.getIzquierdo()) + Size(Nodo.getDerecho());
        }
    }

    public NodoAVL Find(T Valor, NodoAVL Nodo) {
        
        if (Nodo.getData().compareTo(Valor) == 0) {
            return Nodo;
        } else if (Nodo.getData().compareTo(Valor) > 0) {
            if (Nodo.getIzquierdo() != null) {
                return Find(Valor, Nodo.getIzquierdo());
            } else {
                return null;
            }
        } else {
            if (Nodo.getDerecho() != null) {
                return Find(Valor, Nodo.getDerecho());
            } else {
                return null;
            }
        }
    }

    public void InOrderTraversal(NodoAVL Nodo) {
        if (Nodo == null) {
            
        } else {
            InOrderTraversal(Nodo.getIzquierdo());
            System.out.println(Nodo.getData());
            InOrderTraversal(Nodo.getDerecho());
        }
    }

    public void PreOrderTraversal(NodoAVL Nodo) {
        if (Nodo == null) {

        } else {
            System.out.println(Nodo.getData());
            PreOrderTraversal(Nodo.getIzquierdo());
            PreOrderTraversal(Nodo.getDerecho());
        }
    }

    public void PostOrderTraversal(NodoAVL Nodo) {
        if (Nodo == null) {

        } else {
            PostOrderTraversal(Nodo.getIzquierdo());
            PostOrderTraversal(Nodo.getDerecho());
            System.out.println(Nodo.getData());
        }
    }

    public void Insert(T Valor) {
        root = Insert(Valor, root);
    }

    private NodoAVL Insert(T Valor, NodoAVL Nodo) {
        if (Nodo == null) {
            return new NodoAVL(Valor);
        } else {
            if (Nodo.getData().compareTo(Valor) > 0) {
                Nodo.setIzquierdo(Insert(Valor, Nodo.getIzquierdo()));
                AdjustHeight(Nodo.getIzquierdo());
            } else {
                if (Nodo.getData().compareTo(Valor) < 0) {
                    Nodo.setDerecho(Insert(Valor, Nodo.getDerecho()));
                    AdjustHeight(Nodo.getDerecho());
                } else {
                    System.out.println("No se pudo realizar la inserción");
                }
            }
        }
        return Rebalance(Nodo);
    }

    public NodoAVL FindMin(NodoAVL Nodo) {
        if (Nodo != null) {
            while (Nodo.getIzquierdo() != null) {
                Nodo = Nodo.getIzquierdo();
            }
        }
        return Nodo;
    }

    public NodoAVL FindMax(NodoAVL Nodo) {
        if (Nodo != null) {
            while (Nodo.getDerecho() != null) {
                Nodo = Nodo.getDerecho();
            }
        }
        return Nodo;
    }

    public void Remove(T Valor) {
        root = Remove(Valor, root);
    }

    private NodoAVL Remove(T Valor, NodoAVL Nodo) {
        if (Nodo != null) {
            if (Nodo.getData().compareTo(Valor) > 0) {
                Nodo.setIzquierdo(Remove(Valor, Nodo.getIzquierdo()));
            } else {
                if (Nodo.getData().compareTo(Valor) < 0) {
                    Nodo.setDerecho(Remove(Valor, Nodo.getDerecho()));
                } else {
                    if (Nodo.getIzquierdo() == null && Nodo.getDerecho() == null) {
                        Nodo = null;
                    } else {
                        if (Nodo.getIzquierdo() == null) {
                            Nodo = Nodo.getDerecho();
                        } else {
                            if (Nodo.getDerecho() == null) {
                                Nodo = Nodo.getIzquierdo();
                            } else {
                                NodoAVL Minimo = FindMin(Nodo.getDerecho());
                                Nodo.setData(Minimo.getData());
                                Nodo.setDerecho(Remove((T) Nodo.getData(), Nodo.getDerecho()));
                            }
                        }
                    }                   
                }
            }           
        } else {
            System.out.println("No se eliminó el elemento");
        }
        if(Nodo != null){
            Nodo = Rebalance(Nodo);
        }
        return Nodo;
    }

    public NodoAVL Next(NodoAVL Nodo) {
        if (Nodo.getDerecho() != null) {
            return FindMin(Nodo.getDerecho());
        } else {
            return RightAncestor(Nodo);
        }
    }

    public NodoAVL RightAncestor(NodoAVL Nodo) {
        NodoAVL Siguiente = null;
        NodoAVL Lector = root;

        while (Lector != null) {
            if (Nodo.getData().compareTo(Lector.getData()) < 0) {
                Siguiente = Lector;
                Lector = Lector.getIzquierdo();
            } else if (Nodo.getData().compareTo(Lector.getData()) > 0) {
                Lector = Lector.getDerecho();
            } else {
                break;
            }
        }
        return Siguiente;
    }
    
        public ListaEnlazada RangeSearch(T x, T y, NodoAVL Raiz) {
        ListaEnlazada Lista = new ListaEnlazada();
        NodoAVL Nodo = Find(x, Raiz);
        while (Nodo.getData().compareTo(y) <= 0) {  
            if (Nodo.getData().compareTo(x) >= 0) {
                Lista.pushBack(Nodo.getData());
            }
            Nodo = Next(Nodo);
        }
        return Lista;
    }
    
    public NodoAVL Rebalance(NodoAVL Nodo) {
        AdjustHeight(Nodo);
        int Balance = Balance(Nodo);
        if (Balance > 1) {
            Nodo = RebalanceRight(Nodo);
        }
        else if (Balance < -1) {
            Nodo = RebalanceLeft(Nodo);
        }

        return Nodo;
    }

    public NodoAVL RebalanceRight(NodoAVL Nodo) {
        NodoAVL Aux = Nodo.getIzquierdo();
        if (verHeight(Aux.getDerecho()) > verHeight(Aux.getIzquierdo())) {
            Nodo.setIzquierdo(RotateLeft(Nodo.getIzquierdo()));
        }
        Nodo = RotateRight(Nodo);
        return Nodo;
    }

    public NodoAVL RebalanceLeft(NodoAVL Nodo) {
        NodoAVL Aux = Nodo.getDerecho();
        if (verHeight(Aux.getIzquierdo()) > verHeight(Aux.getDerecho())) {
            Nodo.setDerecho(RotateRight(Nodo.getDerecho()));
        }
        Nodo = RotateLeft(Nodo);
        return Nodo;
    }

    public NodoAVL RotateRight(NodoAVL Nodo) {
        NodoAVL Aux = Nodo.getIzquierdo();
        Nodo.setIzquierdo(Aux.getDerecho());
        Aux.setDerecho(Nodo);
        AdjustHeight(Nodo);
        AdjustHeight(Aux);
        return Aux;
    }

    public NodoAVL RotateLeft(NodoAVL Nodo) {
        NodoAVL Aux = Nodo.getDerecho();
        Nodo.setDerecho(Aux.getIzquierdo());
        Aux.setIzquierdo(Nodo);
        AdjustHeight(Nodo);
        AdjustHeight(Aux);
        return Aux;
    }
    
        public void GuardarAVL(String Doc){
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
