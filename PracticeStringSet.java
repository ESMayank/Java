import java.util.Scanner;
public class PracticeStringSet {
    public static void main(String[] args) {
        String Letter = "Dear name I invite you in my Party";
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println(Letter.replace("name",name));
    }
}
