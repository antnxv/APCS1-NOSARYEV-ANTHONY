import java.util.NoSuchElementException;

public class Range implements IntegerSequence{
  private int start,end,current;

  //start and end both inclusive
  public Range(int start, int end){
    if (end < start) throw new IllegalArgumentException();
    this.start = start;
    current = start;
    this.end = end;
  }

  public void reset(){
    current = start;
  }

  public int length(){
    return end - start + 1;
  }

  //return false when current is no longer valid
  public boolean hasNext(){
    return (current <= end);
  }

  //@throws NoSuchElementException when hasNext() is false.
  //This will return the current value, it will also increase current value by 1.
  public int next(){
    if (!hasNext()){
      throw new NoSuchElementException();
    }
    current ++;
    return current-1;
  }
}
