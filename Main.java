import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String A = sc.nextLine();
        String[] paths = A.split(" ");
        for(int i = 0; i < paths.length; i++){
            if(paths[i].charAt(0) == 'A' | paths[i].charAt(0) == 'a'){
                n += 1;
            }
        }
        System.out.print(n);
    }
}
