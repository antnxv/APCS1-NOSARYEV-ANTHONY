public class RationalNumber extends Number{
  private int numerator, denominator;

  /**Initialise the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1
  *  If the denominator is negative, negate both numerator and denominator
  **/
  public RationalNumber(int nume, int deno){
    if (deno == 0){
      numerator = 0;
      denominator = 1;
    }
    else if (deno < 0){
      numerator = -1 * nume;
      denominator = -1 * deno;
    }
    else {
      numerator = nume;
      denominator = deno;
    }
    reduce();
  }

  public double getValue(){
    return (double) numerator / denominator;
  }

  //Return the numerator
  public int getNumerator(){
    return numerator;
  }

  //Return the denominator
  public int getDenominator(){
    return denominator;
  }

  //Return the reciprocal
  public RationalNumber reciprocal(){
    RationalNumber recip = new RationalNumber(this.denominator, this.numerator);
    return recip;
  }

  //Return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  public boolean equals(RationalNumber other){
    return (this.toString().equals(other.toString()));
  }

  //Return the value expressed as "3/4" or "8/3"
  public String toString(){
    if (numerator == 0 || denominator == 1) return "" + numerator;
    else return numerator + "/" + denominator;
  }

  //Calculate the GCD of two integers.
  private static int gcd(int a, int b){
    if (a == 0) return b;
    if (a < b){
      int temp = a;
      a = b;
      b = temp;
    }
    int r = a - (a/b) * b;
    while (r != 0){
      a = b; b = r;
      r = a - (a/b) * b;
    }
    return Math.abs(b);
  }

  //Divide the numerator and denominator by the GCD upon construction
  private void reduce(){
    int gcd = gcd(numerator, denominator);
    numerator /= gcd;
    denominator /= gcd;
  }

  //Return a new RationalNumber equal to this times the other
  public RationalNumber multiply(RationalNumber other){
    RationalNumber product = new RationalNumber(
      this.numerator * other.numerator, this.denominator * other.denominator);
    return product;
  }

  //Return a new RationalNumber equal to this divided by the other
  public RationalNumber divide(RationalNumber other){
    RationalNumber quotient = new RationalNumber(
      this.numerator * other.denominator, this.denominator * other.numerator);
    return quotient;
  }

  //Return a new RationalNumber equal to this plus the other
  public RationalNumber add(RationalNumber other){
    RationalNumber sum = new RationalNumber(
      this.numerator * other.denominator + other.numerator * this.denominator,
      this.denominator * other.denominator);
    return sum;
  }

  //Return a new RationalNumber equal to this minus the other
  public RationalNumber subtract(RationalNumber other){
    RationalNumber difference = new RationalNumber(
      this.numerator * other.denominator - other.numerator * this.denominator,
      this.denominator * other.denominator);
    return difference;
  }
}
