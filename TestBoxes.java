public class TestBoxes {
   public static void main (String [] args){
       Box Emma = new Box (2.0, 6.0);
        double area = Emma.getArea();
System.out.println("The area is " + area);
        Emma.bigger (2.0);
        double perimeter = Emma.getPerimeter();
       System.out.println ("The perimeter is " + perimeter);
}
}
