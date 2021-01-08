public class MyLinkedList{
  private int size;
  private Node start,end;

  public MyLinkedList(){
    size = 0;
  }

  public int size(){
    return size;
  }

  public String get(int index){ // Speeeeed
    return getNode(index).getData();
  }

  public String set(int index, String value){
    String oldvalue = get(index);
    getNode(index).setData(value);
    return oldvalue;
  }

  public boolean add(String value){
    Node nde = new Node(value);
    if (size != 0){
      end.setNext(nde);
      nde.setPrev(end);
    }
    else start = nde;
    end = nde;
    size ++;
    if (end.equals(nde)) return true;
    else return false;
  }

  public void add(int index, String value){
    if (index == size) add(value);
    Node nde = new Node(value);
    nde.setNext(getNode(index));
    getNode(index).setPrev(nde);
    if (index != 0){
      nde.setPrev(getNode(index-1));
      getNode(index-1).setNext(nde);
    }
    size ++;
    if (index == 0) start = nde;
  }

  public void extend(MyLinkedList other){
    if (this.size > 0 && other.size > 0){
      this.end.setNext(other.start);
      other.start.setPrev(this.end);
    }
    else if(other.size > 0){
      this.start.setData(other.start.getData());
      this.end.setData(other.end.getData());
    }
    other.start = null;
    other.end = null;
    other.size = 0;

  }

  public String remove(int index){
    Node nde = getNode(index);
    if (index == 0 && index == size-1){
      start = null;
      end = null;
    }
    else if (index == 0){
      start = nde.getNext();
      nde.getNext().setPrev(null);
    }
    else if (index == size-1){
      end = nde.getPrev();
      nde.getPrev().setNext(null);
    }
    else{
      nde.getNext().setPrev(nde.getPrev());
      nde.getPrev().setNext(nde.getNext());
    }
    nde.setPrev(null); nde.setNext(null);
    return nde.getData();
  }

  public String toString(){
    if (size == 0) return "{}";
    String str = "{";
    for (int i = 0; i < size; i ++){
      str += get(i) + ", ";
    }
    return str.substring(0, str.length()-2) + "}";
  }

  // --- Helpers ------------------------------------------------------
  private Node getNode(int index){
    Node currnde = start;
    for (int i = 0; i < index; i ++){
      currnde = currnde.getNext();
    }
    return currnde;
  }
}
