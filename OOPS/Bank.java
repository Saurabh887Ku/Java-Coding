/* Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.
 */
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        account.setAccountNumber("199330134462");
        account.setDetails("Saurabh Kumar");
        System.out.println("Do you want to deposit money or withdraw money");
        System.out.println("d means deposit");
        System.out.println("w means withdraw");
        char ch = sc.next().charAt(0);
        if(ch == 'd'){
            account.depositMoney(10000);
            System.out.println(account.getMoney());
        }
        else if (ch == 'w'){
            account.withdrawMoney(10000);
            System.out.println(account.getMoney());
        }
        account.getDetails();
    }
}

class Account{
    private String accountNumber;
    private String name;
    private double money = 100000;
    
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setDetails(String name){
        this.name = name;
    }
    public void depositMoney(double money){
        this.money = this.money + money;
    }
    public void withdrawMoney(double money){
        this.money = this.money - money;
    }
    public double getMoney(){
        return this.money;
    }
    public void getDetails(){
        System.out.println("Account number is =>"+accountNumber);
        System.out.println("Name of customer is => "+name);
    }
}