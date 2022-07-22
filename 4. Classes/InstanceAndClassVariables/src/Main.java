//Antonio Yamir Ledesma Briones
public class Main {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);
        
        //instance class methods
        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);
        
        double trianguleBArea = triangleB.findArea();
        System.out.println(trianguleBArea);
        
        //  Instance class variables
        System.out.println(triangleA.sideLenThree);
        System.out.println(triangleB.base);
        
        System.out.println(Triangle.numOfsides);
    }
    
}
