import java.util.Scanner;
import java.util.Random;

public class cointossfinal {
    public static void main(String[] args) {
    String Round[] = new String[5];
    int head = 0;
    int tail = 0;
    Scanner scanner = new Scanner(System.in);

    
    for(int i=0; i < 5;i++){
    Random rand = new Random();
    int num = rand.nextInt(2);

    if(num == 0){
    Round[i] = "Heads";
    }
    
    if(num == 1){
    Round[i] = "Tails"; 
    }

    }

   System.out.println("Who are you?");
   String input = scanner.nextLine();
   System.out.println("Tossing a coin...");
   for(int i = 0; i < 3; i++){
   System.out.println("Round "+ (i+1) + ":" +Round[i]);
   if(Round[i] == "Heads") head++;
   else if(Round[i] == "Tails") tail++;
   }

   System.out.println("Heads: "+ head + ", Tails:" + tail);
   
   if(head > tail){
   System.out.println(input + " won!");
   }
   else {
   System.out.println(input + " lost!");
   }
   }
     
 
}