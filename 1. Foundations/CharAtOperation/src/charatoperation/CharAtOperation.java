//Antonio Yamir Ledesma Briones
package charatoperation;

public class CharAtOperation {

    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        String studentFirstName = "Antonio";
        String studentLastName = "Ledesma";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        boolean hasPerfectAttendance = true;
        
        
        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);
    }
    
}
