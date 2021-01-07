public class Node{
  private String data;
  private Node next,prev;

  public Node(String value){
    data = value;
    next = null;
    prev = null;
  }

  public String getData(){
    return data;
  }

  public Node getNext(){
    return next;
  }

  public Node getPrev(){
    return prev;
  }

  public void setData(String str){
    data = str;
  }

  public void setNext(Node nde){
    next = nde;
  }

  public void setPrev(Node nde){
    prev = nde;
  }
}
