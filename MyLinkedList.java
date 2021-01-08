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
  public boolean add(String value);
  public boolean add(int index, String value);
  public String get(int index);
  public String set(int index, String value);
  public String toString();

}