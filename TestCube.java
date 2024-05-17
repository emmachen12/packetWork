public class TestCube {
    public static void main (String [] args) {

        Cube cube = new Cube (3.0);

        double volume = cube.volume();
        System.out.println( "The volume is " + volume + " cu.units");

        double surfaceArea = cube.surfaceArea();
        System.out.println( "The surface is " + surfaceArea + " cu.units");

        cube.setSideForVolume(125.0);

        double surfaceArea1 = cube.surfaceArea();
        System.out.println( "The surface is " + surfaceArea1 + " cu.units");

        double getSide = cube.getSide();
        System.out.println( "The side is " + getSide + " cu.units");

    }
}
