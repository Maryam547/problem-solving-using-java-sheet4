import java.util.Scanner;
public class CreateANewString {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String S = myObj.nextLine();
        String T = myObj.nextLine();
        System.out.println(S.length()+" "+T.length());
        System.out.println(S+" "+T);
    }
}
