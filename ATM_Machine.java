     import java.util.Scanner;  
     public class ATM_Machine   //create ATMExample class to implement the ATM functionality
    {  
        public static void main(String args[] )  
        {  
            int balance = 100000, withdraw, deposit;  
               
            Scanner sc = new Scanner(System.in);  
             System.out.println("Username");
             String name=sc.next();
             System.out.println("Password");
             sc.next();
            while(true)  
            {
                System.out.println("ATM Machine\n");  
                System.out.println("SELECT 1 for  Cash Withdraw");  
                System.out.println("SELECT 2 for Deposit your cash");  
                System.out.println("SELECT 3 for Check Balance of your Account");  
                System.out.println("SELECT 4 for EXIT\n");  
                System.out.print("SELECT the operation:");  
                  
                int choice = sc.nextInt();  
                switch(choice)  
                {  
                    case 1:  
            System.out.print("Enter money to be  Cash withdrawn:");  
                          
            withdraw = sc.nextInt();  
                          
            //check whether the balance is greater than or equal to the withdrawal amount  
            if(balance >= withdraw)  
            {  
                balance = balance - withdraw;  
                System.out.println("Please collect your Cash");  
            }  
            else  
            {  
                System.out.println("Insufficient Balance");  //show error message  
            }  
            System.out.println("");  
            break;  
       
                    case 2:  
                          
            System.out.print("Enter money to be deposited for your cash:");  
                          
            deposit = sc.nextInt();           
            balance = balance + deposit;  //add the deposit amount to the total balanace
            System.out.println("Your Money has been successfully deposited");  
            System.out.println("");  
            break;  
       
            case 3:  
              
            System.out.println("Balance : "+balance);  //displaying the total balance of the user
            System.out.println("");  
            break;  
       
                    case 4:  
            System.exit(0);  
                }  
            }  
        }  
    }