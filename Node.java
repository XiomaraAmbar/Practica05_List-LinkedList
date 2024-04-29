package Actividades;

public class Node<T extends Comparable<T>> {
    private  T data;
    private Node<T> next;

    public Node (T data){
        this(data,null);
    }
    public Node(T data, Node<T> next){
        this.data = data; //valor del nodo
        this.next = next; //posicion del nodo
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    public String toString(){
        return this.data.toString();
    }

    //numero negativo si es menor, 0 si son iguales y numero positivo si es mayor
    public int compareTo(Node<T> otroDato){
        return this.data.compareTo(otroDato.data);
    }


}
