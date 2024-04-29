package Actividades;

public interface TDAList<T> {
    public boolean isEmpty();
    int length();
    void destroyList();
    int search(T x);
    //int searchK(int k);
    void insertFirst(T x);
    void insertLast(T x);
    void insertNth (T x, int k);
    void removeNode(T x);

}
