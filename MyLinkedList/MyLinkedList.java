public class MyLinkedList{
  private int size;
  private Node start,end;

  public MyLinkedList(){
    size = 0;
  }

  public int size(){
    return size;
  }

  public String get(int index){
    return getNode(index).getData();
  }

  public String set(int index, String value){
    String oldnde = getNode(index).getData();
    getNode(index).setData(value);
    return oldnde;
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
    if (index > size) throw new IndexOutOfBoundsException("index must be less or equal to current size; size == "+size);
    if (index < 0) throw new IndexOutOfBoundsException("index must be greater than 0");
    if (index == size){
      add(value);
    }else{
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
  }

  public void extend(MyLinkedList other){
    if (this.size > 0 && other.size > 0){
      this.end.setNext(other.start);
      other.start.setPrev(this.end);
      this.end = other.end;
    }
    else if(other.size > 0){
      this.start.setData(other.start.getData());
      this.end.setData(other.end.getData());
    }
    this.size += other.size;
    other.start = null;
    other.end = null;
    other.size = 0;

  }

  public String remove(int index){
    if (index >= size) throw new IndexOutOfBoundsException("index must be less than current size; size == "+size);
    if (index < 0) throw new IndexOutOfBoundsException("index must be greater than 0");
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
    size --;
    return nde.getData();
  }

  public String toString(){
    if (size == 0) return "[]";
    Node currnde = start;
    String str = "["+currnde.getData()+", ";
    for (int i = 0; i < size-1; i ++){
      currnde = currnde.getNext();
      str += currnde.getData() + ", ";
    }
    return str.substring(0, str.length()-2) + "]";
  }

  public String toStringReversed(){
    if (size == 0) return "[]";
    Node currnde = end;
    String str = "["+currnde.getData()+", ";
    for (int i = size-2; i > -1; i --){
      currnde = currnde.getPrev();
      str += currnde.getData() + ", ";
    }
    return str.substring(0, str.length()-2) + "]";
  }

  // --- Helpers ------------------------------------------------------
  private Node getNode(int index){
    if (index >= size) throw new IndexOutOfBoundsException("index must be less than size; size == "+size);
    if (index < 0) throw new IndexOutOfBoundsException("index must be greater than 0");
    Node currnde = start;
    for (int i = 0; i < index; i ++){
      currnde = currnde.getNext();
    }
    return currnde;
  }
}
