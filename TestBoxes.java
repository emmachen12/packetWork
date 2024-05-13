public class TestBoxes {
    public static void main (String [] args){
    
    public TestBox (double a, double b ){
        len = 6;
        width = 2;
    }

    public double getArea(){
        return len * width;
    }

    public double getPerimeter (){
        double p = 2.0 * (len + width);
        return p;
    }

    public void bigger (double f){
        len = f * len;
        width = f * width;
    }
}
}
