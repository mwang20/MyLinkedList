public class Node{
  
  public Node(String value){
    this.data = value;
    this.next = null;
    this.prev = null;
  }
  private String data;
  private Node next,prev;

  public String getData(){
    return data;
  }
  
  public Node getNext(){
    return next;
  }
  
  public Node getPrev(){
    return prev;
  }
  
  public void setData(String data){
    this.data = data;
  }
  
  public void setNext(Node next){
    this.next = next;
  }
  
  public void setPrev(Node prev){
    this.prev = prev;
  }
  
}