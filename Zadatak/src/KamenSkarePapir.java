import java.util.Scanner;
import java.util.Random;

public class KamenSkarePapir {
    public static void main(String[] args) 
   {
      Integer personScore = 0;
      Integer computerScore = 0;

      String personPlay;
      String computerPlay = "";
      int computerInt;

      Scanner scan = new Scanner(System.in);
      Random generator = new Random(); 

      while(true){ 
         System.out.println("Kamen, skare, papir!\r\n");

         computerInt = generator.nextInt(3)+1; 

         if (computerInt == 1) 
            computerPlay = "kamen"; 
         else if (computerInt == 2) 
            computerPlay = "skare"; 
         else if (computerInt == 3) 
            computerPlay = "papir"; 

         while(true){
            System.out.println("Unesite svoj potez: "); 
            personPlay = scan.next().toLowerCase();
            
            if("kamen".equals(personPlay) || "skare".equals(personPlay) || "papir".equals(personPlay))
               break;
            else
               System.out.println("Pogrešan unos, pokušajte ponovo! Unos treba biti 'kamen', 'skare' ili 'papir'\r\n");
         }

         System.out.println("Računalo je odigralo: " + computerPlay);
         System.out.println("------------------------\n" + "Rezultat:");

         if (personPlay.equals(computerPlay)){
            System.out.println("Nerješeno je!");
            System.out.println("Vi (" + personScore + ") - (" + computerScore + ") Računalo");
         } 
         else if ((personPlay.equals("kamen") && computerPlay.equals("skare")) ||
                  (personPlay.equals("skare") && computerPlay.equals("papir")) ||
                  (personPlay.equals("papir") && computerPlay.equals("kamen"))){
                     System.out.println("Vi (" + ++personScore + ") - (" + computerScore + ") Računalo");
                  }
         else
            System.out.println("Vi (" + personScore + ") - (" + ++computerScore + ") Računalo");

         System.out.println("------------------------\n");
         
         System.out.println("Želite li još jednu rundu? (da/ne)");
         if(!"da".equals(scan.next())){
            break;
         }
      }

      scan.close();
   }
}
