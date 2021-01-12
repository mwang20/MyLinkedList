import java.lang.IllegalArgumentException;

public class MyLinkedList{
  private int size;
  private Node start,end;  

  public MyLinkedList(){
    size = 0;
    start = null;
    end = null;
  }
  
  public int size(){
    return size;
  }
  
  public boolean add(String value){
    Node node = new Node(value);
    if (size == 0){
      start = end = node;
      start.setPrev(null);
      start.setNext(node);
      size ++;
    }
    else {
      end.setNext(node);
      end = node;
      size++;
    }
    return true;
  }
  
  public void add(int index, String value){
    if (index > size){
      throw new IndexOutOfBoundsException();
    }
    Node node = new Node(value);
    int move = index;
    Node current = start;
    while (move != 0){
      current = current.getNext();
      move--;
    }
    current.setData(value);
    size++;
  }
  
  public String get(int index){
    if (index > size){
      throw new IndexOutOfBoundsException();
    }
    int move = index;
    Node current = start;
    while (move != 0){
      current = current.getNext();
      move--;
    }
    return current.getData();
  }
  
  public String set(int index, String value){
    if (index > size){
      throw new IndexOutOfBoundsException();
    }
    Node node = new Node(value);
    int move = index;
    Node current = start;
    while (move != 0){
      current = current.getNext();
      move--;
    }
    current.setData(value);
    size++;
    return current.getData();
  }
  
  public String toString(){
    String listString = "[";
    Node current = start;
    for (int i = 0; i < size; i++){
      if (i == size - 1){
        listString += current.getData();
      }
      else {
        listString += current.getData() + ", ";
      }
      current = current.getNext();
    }
    return listString + "]";
  }

  public String toStringReversed(){
    String listString = "[";
    Node current = end;
    for (int i = size - 1; i >= 0; i++){
      if (i == 0){
        listString += current.getData();
      }
      else {
        listString += current.getData() + ", ";
      }
      current = current.getPrev();
    }
    return listString + "]";
  }
  
  public String remove(int index){
    if (index > size){
      throw new IndexOutOfBoundsException();
    }
    int move = index;
    Node current = start;
    while (move != 0){
      current = current.getNext();
      move--;
    }
    String removed = current.getData();
    current.setData(null);
    size--;
    return removed;  
  }
}