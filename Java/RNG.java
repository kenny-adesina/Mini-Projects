import java.util.Scanner;

public class RNG {
    public static void main(String[] args){
       double per;
       int amt;
       double picked;


       Scanner kb = new Scanner(System.in);
       System.out.println("Random Number Generator by Kenny");
       System.out.println("");
       System.out.print("Enter the integer chance (in percent) that you would like something to occur. [90 = 90%, 4.6 = 4.6%] : ");
       per = kb.nextDouble(); 
       System.out.print("How many times would you like to re-roll? : ");
       amt = kb.nextInt();
       System.out.println("");
       kb.close();

System.out.println("Rolling...");
System.out.println("");
for(int i = 0; i < amt; i++){
picked = Math.random();

  if(picked < per/100 ){
        System.out.println("Something occured!");
       } else {
        System.out.println("Something did not occur.");
       }
 }
      
    }
}
