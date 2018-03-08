package Week2;
import java.util.Scanner;
import java.util.LinkedList;

public class W2P3 {
    public static void main(String[] arg) {

        LinkedList<Integer> link = new LinkedList<>();
        Scanner scan = new Scanner(System.in);

        int nume = scan.nextInt();

        while (nume > 0) {
            link.push(nume % 10);
            nume /= 10;

        }

        while (!link.isEmpty()) {
            System.out.printf("%d%s", link.pop(), " ");


        }
    }
}
