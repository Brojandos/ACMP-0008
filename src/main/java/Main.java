import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 21.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.nextByte() * in.nextByte() == in.nextInt())
            System.out.println("YES");
        else System.out.println("NO");
    }
}
