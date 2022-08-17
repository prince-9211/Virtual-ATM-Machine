import java.util.HashMap;
import java.util.Map;

public class AtmoperationImp implements AtmoperationInterface{
    Map<Double,String>statement=new HashMap<>();
    atm ATM=new atm();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is :"+ATM.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%500==0){
        if (withdrawAmount <= ATM.getBalance()) {
            statement.put(withdrawAmount,"Amount withdraw");
            System.out.println("collect the Cash"+withdrawAmount);
            ATM.setBalance(ATM.getBalance()-withdrawAmount);
            viewBalance();
        }
        else {
            System.out.println("Insufficient Balance !! ");
        }
        }
        else {
            System.out.println("Enter Amount is multiple of 500!! ");
        }
    }
    @Override
    public void depositAmount(double depositAmount) {
        statement.put(depositAmount,"Amount dosostited !!");
        System.out.println(depositAmount+"Deposited Successfully !!");
        ATM.setBalance((ATM.getBalance()+depositAmount));
        viewBalance();
    }

    @Override
    public void viewMinistatement() {
      for(Map.Entry<Double,String>m:statement.entrySet()){
          System.out.println(m.getKey()+""+m.getValue());
      }
    }
}
