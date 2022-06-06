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
            prevTransBalance = Math.abs(amount);    // and my previous value will store only the absolute value.
        }
    }
}


public class Bank {
    public static void main(String[] args) {

    }
}
