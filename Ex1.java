import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Enter Your Numbers:");
        Scanner s = new Scanner(System.in);

        float maths,science,sst,english,hindi;
        maths = s.nextFloat();
        science = s.nextFloat();
        sst = s.nextFloat();
        english = s.nextFloat();
        hindi = s.nextFloat();
        float Total = maths+science+sst+english+hindi;
        float percentage = Total/5 ;
        System.out.printf("Your CBSE Percentage is %f ",percentage);
    }
}
