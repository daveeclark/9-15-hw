package friday13.bullshit;

public class Account {

    public String customerName;
    public double accountBalance;

    public Account(String customerName, double accountBalance){
        this.customerName=customerName;
        this.accountBalance=accountBalance;

    }

    public void Deposit(double depositAmnt){
        if(depositAmnt <= 0){
            System.out.println("Error");
        }else{
        System.out.println(depositAmnt+accountBalance);}
    }

    public void Withdraw(double withdrawAmnt){
       if (withdrawAmnt>accountBalance) {
           System.out.println("Insufficient Funds");
       }else {
           System.out.println(accountBalance - withdrawAmnt);
       }
    }

    @Override
    public String toString() {
        return "Account{" +
                "customerName='" + customerName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
