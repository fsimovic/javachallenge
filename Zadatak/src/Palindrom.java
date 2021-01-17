import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite tekst za provjeru: ");
            
        String text = scan.nextLine();
        text = text.toLowerCase().replaceAll("\\s+", "").replaceAll("[,.!?]", "");

        for (int i = 0; i < text.length(); i++) {
            if (!(text.charAt(i) == text.charAt(text.length() - (i + 1)))) {
                System.out.println("Nije palindrom!");
                break;
            }
            else if (i >= text.length() - (i + 1)){
                System.out.println("Polindrom!");
                break;
            }
        }
        scan.close();
    }
}
