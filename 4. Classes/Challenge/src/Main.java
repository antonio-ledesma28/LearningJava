//Antonio Yamir Ledesma Briones
public class Main {

    public static void main(String[] args) {
        StudentProfile profileOne = new StudentProfile("Antonio", "Ledesma", "Computer Engineering", 3.75, 2022);
        StudentProfile profileTwo = new StudentProfile("Diana", "Marmolejo", "Architecture", 3.45, 2021);
        
        profileTwo.incrementExpectedGraduationYear();
        System.out.println(profileTwo.expectedYearToGraduate);
    }
    
}
