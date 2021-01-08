public class MyLinkedList extends Node{
  private int size;
  private Node start,end;  

  public MyLinkedList(){
    size = 0;
    start = end = null;
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
      size += 1;
    }
    else {
      end.setNext(node);
      end = node
      size++;
    }
  };
  public boolean add(int index, String value);
  public String get(int index);
  public String set(int index, String value);
  public String toString();

}