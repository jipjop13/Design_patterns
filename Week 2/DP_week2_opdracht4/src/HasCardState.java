public class HasCardState implements ATMState {
    @Override
    public void insertCard(ATM atm) {
        System.out.println("Error: Card already inserted");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Card will be ejected");
        atm.setState(new IdleState());
    }

    @Override
    public void insertPin(ATM atm) {
        System.out.println("Pin is correctly inserted");
        atm.setState(new HasCorrectPinState());
    }

    @Override
    public void requestAmount(ATM atm) {
        System.out.println("Error: insert PIN first");
    }
}
