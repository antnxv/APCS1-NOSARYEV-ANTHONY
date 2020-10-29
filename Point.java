public class Point{
  private double x,y;

  //construct a point given coordinates
  public Point(double X, double Y){
    x = X;
    y = Y;
  }

  //construct a point given a point  (redundant , just provides flexibility)
  public Point(Point p){
    x = p.x;  //private access in the same file is allowed!
    y = p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other){
    x = getX() - other.getX();
    y = getY() - other.getY();
    return Math.sqrt(y * y + x * x);
  }

  public boolean equals(Point other){
    if (distanceTo(other) == 0.0) return true;
    else return false;
  }
}
