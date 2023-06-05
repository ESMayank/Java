import java.util.Scanner;
public class If_Else {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a>=0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}
