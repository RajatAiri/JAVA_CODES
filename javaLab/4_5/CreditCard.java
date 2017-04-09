package college;

import java.util.Scanner;
public class CreditCard {
    public static void main(String[] args) {
        float balance,paid,interest,a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the 0th month Balance:");
        balance=s.nextFloat();
        System.out.println("\n\n\n\nUnpaid Balance in month 0="+balance);
        paid=0;
        a=balance;
        while(balance>0){
            paid+=10;
            balance=a;
            for(int i=1;i<=12;i++){
                balance=balance-paid;
                interest=(float) (balance*(0.18/12));
                balance+=interest;
            }
        } 
        balance=a;
        for(int i=1;i<=12;i++){
            System.out.println("\n\nPaid in month " +i+ "=" +paid);
            balance=balance-paid;
            interest=(float) (balance*(0.18/12));
            balance+=interest;
            System.out.println("\n\nBalance due with interest="+balance);
        }
    }   
}