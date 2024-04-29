package Actividades;

public class LinkedList<T extends Comparable<T>> implements TDAList<T>{
    Node<T> first;
    int size;

    public LinkedList(){
        this.first = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public int length(){
        return this.size;

    }

    public void destroyList(){
        while ( first != null)
            this.first = this.first.getNext();

        this.size = 0;
    }

    public int search(T searchItem){
        Node <T> aux = this.first;
        int pos = 0;
        while (aux != null && !aux.getData().equals(searchItem)){
            pos ++;
            aux = aux.getNext();
        }
        if ( aux != null)
            return pos;
        return -1;
    }

    public void insertFirst(T newItem){
        this.first = new Node<T>(newItem, this.first);
        size ++;
    }

    public void insertLast(T newItem){
        if (isEmpty())
            insertFirst(newItem);
        else{
            Node<T> aux = this.first;
            while(aux.getNext() != null)
                aux = aux.getNext();
            aux.setNext(new Node<T>(newItem));
            size ++;
        }
    }

    public void removeNode(T deleteItem) {
        Node<T> prev = null;
        Node<T> curr = first;

        while (curr != null && !curr.getData().equals(deleteItem)) {
            prev = curr;
            curr = curr.getNext();
        }

        if (curr != null) {
            if (prev == null) {
                first = first.getNext();
            } else {
                prev.setNext(curr.getNext());
            }
            size--;
        }
    }

    public String toString(){
        String str = "";
        Node<T> aux = this.first;
        for(; aux != null; aux =  aux.getNext())
            str += aux.getData().toString() + ", ";
        if (str.length() > 0) {
            str = str.substring(0, str.length() - 2); //Elimina la coma al final
        }
        return "{" + str + "}";
    }

    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //EJERCICIO N°1
    
    public void deleteDuplicates(){
        //Node<T> prev = null;
        Node<T> curr = first;
        
        while (curr != null){
            Node<T> prev = curr;
            Node<T> next = curr.getNext();

            while (next != null){
                if (curr.getData().compareTo(next.getData()) == 0){
                    prev.setNext(next.getNext());
                    size --;
                }else{
                    prev = next;
                }
                next = prev.getNext();
            }
            curr = curr.getNext();
        }
    }

    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //EJERCICIO N°2

    public void insertNth(T data, int position) {
        if (position < 0 || position > size) {
            System.out.println(">>>>>>>>>  Posición fuera de rango  <<<<<<<<<<");
            return;
        }
    
        if (position == 0) {
            insertFirst(data);
        } else if (position == size) {
            insertLast(data);
        } else {
            Node<T> aux = first;
            for (int i = 1; i < position; i++) {
                aux = aux.getNext();
            }
            aux.setNext(new Node<T>(data, aux.getNext()));
            size++;
        }
    }
    

    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //EJERCICIO N°3

    public void deleteNth(int position) {
        if (position < 0 || position > size) {
            System.out.println(">>>>>>>>>  Posición fuera de rango  <<<<<<<<<<");
            return;
        }
    
        if (position == 0) {
            first = first.getNext();
        } else {
            Node<T> aux = first;
            for (int i = 1; i < position; i++) {
                aux = aux.getNext();
            }
            aux.setNext(aux.getNext().getNext());
        }
    
        size--;
    }

}
