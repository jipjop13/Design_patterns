import java.util.Scanner;

public class HasAmountState implements ATMState {
    @Override
    public void insertCard(ATM atm) {
        System.out.println("Card is already inserted");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Card is ejected");
        atm.setState(new IdleState());
    }

    @Override
    public void insertPin(ATM atm) {
        System.out.println("Already inserted a correct PIN");
    }

    @Override
    public void requestAmount(ATM atm) {
        //do shit als er geld wordt aangevraagd.
        System.out.println("Enter amount: ");
        Scanner scanner = new Scanner(System.in);
        int doekoe = scanner.nextInt();

        if (atm.getAmount() >= doekoe){
            System.out.println("Here is your money: " + doekoe + " euro");
            atm.setAmount(atm.getAmount() - doekoe);
            System.out.println("Your card will be returned");
            atm.ejectCard();

        }else{
            System.out.println("Machine has not enough money!");
            System.out.println("Your card will be returned");
            atm.ejectCard();
        }
    }
}
