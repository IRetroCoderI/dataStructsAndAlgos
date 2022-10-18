package arrays_and_memory.DynamicArrays;

public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;


    public DynamicArray(){
        this.array = new Object[capacity];
    }
    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public void add(Object data){
        if(size >= capacity){
            grow();
        }

    }
    public void insert(int index, Object data){

    }
    public void delete(Object data){

    }
    public int search(Object data){
        return -1;
    }
    private void grow(){

    }
    private void shrink(){

    }
    public boolean isEmpty(){
        return size == 0;
    }
    public String toString(){
        return null;
    }
}
