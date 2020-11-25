public class RealNumber extends Number{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  //Return a new RealNumber equal to this plus the other
  public RealNumber add(RealNumber other){
     RealNumber sum = new RealNumber(this.getValue() + other.getValue());
     return sum;
  }

  //Return a new RealNumber equal to the this times the other
  public RealNumber multiply(RealNumber other){
    RealNumber product = new RealNumber(this.getValue() * other.getValue());
    return product;
  }

  //Return a new RealNumber equal to this divided by the other
  public RealNumber divide(RealNumber other){
    RealNumber quotient = new RealNumber(this.getValue() / other.getValue());
    return quotient;
  }

  //Return a new RealNumber equal to this minus the other
  public RealNumber subtract(RealNumber other){
    RealNumber difference = new RealNumber(this.getValue() - other.getValue());
    return difference;
  }
}
