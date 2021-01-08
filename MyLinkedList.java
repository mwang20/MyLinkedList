import java.util.math;
public class MyLinkedList extends Node{
  private int size;
  private Node start,end;  

  public MyLinkedList(){
    size = 0;
    start = null;
    end = null;
  }
  public int size()(
    return size;
  )
  public boolean add(String value){
    Node node = new Node(value);
    if (size == 0){
      start = end = node;
      start.setPrev(null);
      start.setNext(null);
      size ++;
    }
    else {
      end.setNext(node);
      end = node;
      size++;
    }
  };
  public void add(int index, String value){
    if (index > size){
      throw IllegalArgumentException();
    }
    Node node = new Node(value);
    int move = index - 1;
    Node current = start;
    while (move != 0){
      current = current.getNext();
      move--;
    }
    current.setNext(value);
    size++  
  }
  public String get(int index);
  public String set(int index, String value);
  public String toString();

}