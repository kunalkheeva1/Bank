class Account{
    int balance;
    int prevTransBalance;
    String customerName;
    String custormerId;

    //creating a method to check the balance of the account
    void checkBalance(int amount){                      //amount in the parameter
        if (amount != 0) {                              //if it is not zero
            balance+=amount;                            //then increment the balance
            prevTransBalance=amount;                   //and store amount in the previous value
        }
    }

    //creating a method to withdraw the money
    void withdrawMoney(int amount){
        if(amount!=0){
            amount=balance-amount;                  //so the amount left will be total balance minus the amount demanded
            prevTransBalance = -amount;            // so that i can see my previous transaction as withdrawn
        }
    }

    //creating a method to check the previous transcation
    void preBalance(){
        if(prevTransBalance<0){
            System.out.println("Amount Debited: "+ Math.abs(prevTransBalance));
        }else if(prevTransBalance>0){
            System.out.println("Amount credited: "+ prevTransBalance);
        }else{
            System.out.println("No transaction so far in the records");
        }
    }
}


public class Bank {
    public static void main(String[] args) {

    }
}
