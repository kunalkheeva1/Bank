import java.util.Scanner;

class Account{
    int balance;
    int prevTransBalance;
    String customerName;
    String custormerId;

    Account(String customerName, String custormerId){
        this.customerName = customerName;
        this.custormerId = custormerId;
    }

    //creating a method to deposit the balance of the account
    void deposit(int amount){                      //amount in the parameter
        if (amount != 0) {                              //if it is not zero
            balance=balance +amount;                            //then increment the balance
            prevTransBalance=amount;                   //and store amount in the previous value

        }
    }

    //creating a method to withdraw the money
    void withdrawMoney(int amount){
        if(amount!=0){
            balance-=amount;                  //so the amount left will be total balance minus the amount demanded
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
    //creating a single method now to run my bank
    void mainMenu(){
        char option= '\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Bank: "+ customerName+ "\n Your customer id is: "+custormerId);
        System.out.println("=========================================");
        System.out.println("Choose one of the option below: ");
        System.out.println("A- Deposit");
        System.out.println("B- Balance Enquiry");
        System.out.println("C- Withdraw");
        System.out.println("D- Previous transaction");
        System.out.println("E- Exit the Bank.");
        System.out.println("=========================================");

        //running a loop to travelling through my options
        do {
            option = sc.next().charAt(0);
            option = Character.toUpperCase(option);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("Enter your amount to be deposited: ");
                    int amount = sc.nextInt();
                    deposit(amount);
                    break;
                case 'B':
                    System.out.println("-----------------------------");
                    System.out.println("Your Balance is: " + balance);
                    System.out.println("-----------------------------");
                    break;

                case 'C':
                    System.out.println("-----------------------");
                    System.out.println("Enter the amount to be withdrawn: ");
                    System.out.println("-----------------------");
                    int withdrawl = sc.nextInt();
                    withdrawMoney(withdrawl);
                    break;
                case 'D':
                    System.out.println("------------------------");
                    System.out.println("Your previous balance was: \n");
                    preBalance();
                    System.out.println("-------------------------");
                    break;
                case 'E':
                    System.out.println("You chose to exit the Bank");
                    break;
                default:
                    System.out.println("Invalid option please try again!!");
                    break;
            }

            }while (option != 'E'); {
            System.out.println("Thank you for using our Bank!");
        }
    }
}


public class Bank {
    public static void main(String[] args) {
Account acc = new Account("Kunal", "123");
acc.mainMenu();

    }
}
