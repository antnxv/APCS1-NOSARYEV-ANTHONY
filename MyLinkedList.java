public class MyLinkedList{
  private int size;
  private Node start,end;

  public MyLinkedList(){
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String value){
    Node nde = new Node(value);
    if (size != 0) end.setNext(nde);
    else start = nde;
    end = nde;
    if (end.equals(nde)) return true;
    else return false;
  }

  public void add(int index, String value){

  }

  public String get(int index){
    return "placeholder, tired of seeing errors";
  }

  public String set(int index, String value){
    return "placeholder, tired of seeing errors";
  }

  public String toString(){
    return "placeholder, tired of seeing errors";
  }
  //Any helper method that returns a Node object MUST BE PRIVATE!
}
