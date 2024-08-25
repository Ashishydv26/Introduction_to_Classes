package Introduction_to_classes;

public class rectangleClass {
    public int length;
    public int breadth;
    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*area();
    }
}
class rec
{
    public static void main(String[] args) {
        rectangleClass r = new rectangleClass();
        r.length=4;
        r.breadth = 5;
        System.out.println("area is :"+r.area());
        System.out.println("peri is :"+r.perimeter());


    }
}
