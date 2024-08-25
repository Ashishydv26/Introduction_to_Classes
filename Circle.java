package Introduction_to_classes;

public class Circle {
    public int radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double circumference( )
    {
         return   2 * Math.PI * radius;

    }
    public double perimeter()
    {
        return circumference();
    }
}
class a {
    public static void main(String[] args) {
        Circle c = new Circle();
        Circle c1 = new Circle();

        c.radius = 4;
        double a =  c.area();
        System.out.println("area is          :"+a);
        double b = c.circumference();
        System.out.println("circumference is :"+b);
        System.out.println("perimeter is     :"+c.perimeter());

        System.out.println();
        c1.radius = 4;
        double e =  c1.area();
        System.out.println("area is          :"+a);
        double d = c1.circumference();
        System.out.println("circumference is :"+b);
        System.out.println("perimeter is     :"+c1.perimeter());
    }
}