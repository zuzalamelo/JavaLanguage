import java.util.Scanner;

public class CharCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String input = sc.next();
        int x = (char) input.charAt(0);
        System.out.println(x);
    }
}
