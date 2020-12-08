public interface IntegerSequence {

  //start over from the start of the sequence
  void reset();

  //returns the total length of the sequence
  int length();

  //does the sequence have more elements?
  boolean hasNext();

  //return the current value in the sequence and advances to the next element
  int next();
}
