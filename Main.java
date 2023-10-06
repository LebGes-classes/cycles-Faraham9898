import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        String res = "";
        for (int i = 0; i < string.length(); i++) {
            res = string.charAt(i) + res;
        }
        System.out.println(res);
    }
}