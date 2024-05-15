public class TestCircles {
    public static void main (String [] args){

    Circle izzy = new Circle (3.0);

    double circum = izzy.getC();
    System.out.println("Circumference: " + circum);

    double area = izzy.getArea();
    System.out.println("Area: " + area);

    izzy.changeR(1.0);

    double area2 = izzy.getArea();
    System.out.println("New area: " + area2);
}
}
