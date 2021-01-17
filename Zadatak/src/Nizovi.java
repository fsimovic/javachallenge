import java.util.Scanner;
import java.util.Arrays;

public class Nizovi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Unesite niz N: ");
        String[] arrayNAsString = scan.nextLine().replaceAll("\\s", "").split(",");
        
        int[] arrayN = new int[arrayNAsString.length];
        for (int i = 0; i < arrayN.length; i++) {
            try {
                arrayN[i] = Integer.parseInt(arrayNAsString[i]);
            } catch (Exception e) {
                System.out.println("Pogrešno zadan niz!");
            }
        }
        Arrays.sort(arrayN);

        System.out.println("Unesite broj B: ");
        Integer numberB = scan.nextInt();

        int min = 0;
        for (int j = 0; j < arrayN.length; j++) {
            for (int i = 0; i < arrayN.length; i++) {
                if (numberB >= arrayN[arrayN.length - (i + 1)]) {
                    numberB -= arrayN[arrayN.length - (i + 1)];
                    ++min;
                    break;
                }
            }
            if (numberB == 0) {
                System.out.println("Output:" + min);
                break;
            }
        }
        if (numberB != 0) {
            System.out.println("Output: -1");
        }

        scan.close();
    }
}
