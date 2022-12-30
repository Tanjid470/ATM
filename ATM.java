
package atm;

import java.util.Scanner;

public class ATM {
    static int total=0;
    
   public int view(){
       return total;
   }
    
   
   public int add(int deposit)
   {
       Scanner input = new Scanner(System.in);
       return total+=deposit;
   }
   public int sub(int withdraw)
   {
       Scanner input = new Scanner(System.in);
       return total-=withdraw;
   }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ATM atm=new ATM();

     
        System.exit(0);        
    }
}
