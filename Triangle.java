public class Triangle{
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c){
    v1 = new Point(a);
    v2 = new Point(b);
    v3 = new Point(c);
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter(){
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public double getArea(){
    double s = getPerimeter() / 2;
    return Math.sqrt(s * (s - v1.distanceTo(v2)) *
    (s - v2.distanceTo(v3)) * (s - v3.distanceTo(v1)));
  }

  public String classify(){
    if (v1.distanceTo(v2) == v2.distanceTo(v3)
    && v1.distanceTo(v2) == v3.distanceTo(v1)) return "Equilateral";
    else if (v1.distanceTo(v2) != v2.distanceTo(v3)
    && v1.distanceTo(v2) != v3.distanceTo(v1)
    && v3.distanceTo(v2) != v1.distanceTo(v1)) return "Scalene";
    else return "Isosceles";
  }
}
