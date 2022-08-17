import java.util.*;
public class Main {
    public static void main(String[] args) {
        AtmoperationInterface op=new AtmoperationImp();
        int atmnumber = 123456;
        int atmpin = 1234;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Atm Number :");
        int atmNumber = sc.nextInt();
        System.out.print("Enter Pin :");
        int pin = sc.nextInt();
        if ((atmnumber == atmNumber) && (atmpin == pin)) {
            while (true) {
                System.out.println("1.Check Available Balance :");
                System.out.println("2.Withdraw Amount :");
                System.out.println("3.Deposit Amount : ");
                System.out.println("4.Mini Statement :");
                System.out.println("5.Exit");
                System.out.println("Enter the choice :");
                int ch = sc.nextInt();
                if (ch == 1) {
                  op.viewBalance();
                } else if (ch == 2) {
                    System.out.println("Enter withdrawAmount ");
                    double withdrawAmount=sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if (ch == 3) {
                    System.out.println("Enter Deposit Amount");
                    double depositAmount=sc.nextDouble();
                    op.depositAmount(depositAmount);
                } else if (ch == 4) {
                    op.viewMinistatement();
                } else if (ch == 5) {
                    System.out.println("Please Collect your card");
                    System.out.println("Thank you for using Atm machine");
                    System.exit(0);
                } else {
                    System.out.println("Please Enter correct Choice");
                }
            }
        }
                  else{
            System.out.println("Incorrect Atm Number and Atm Pin");
            System.exit(0);
                }
            }
        }
