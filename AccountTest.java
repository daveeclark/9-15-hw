package friday13.bullshit;

public class AccountTest {

    public static void main(String[] args) {
        Account account1 = new Account ("Bob", 155);
        account1.Deposit(160);

        Account account2 = new Account("Dude",850);
        account2.Withdraw(700);

        System.out.println(account1);
        System.out.println(account2);
    }

}
