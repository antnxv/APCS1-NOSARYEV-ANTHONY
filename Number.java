public abstract class Number{

  public abstract double getValue();


  /*
  *Return true when the values are within 0.001% of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  *Modified to work with RationalNumber types.
  */
  public boolean equals(Number other){
    return (Math.abs(this.getValue() - other.getValue()) <= 0.00001 * this.getValue());
  }
}
