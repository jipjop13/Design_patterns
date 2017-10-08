public class IdleState implements ATMState {
    @Override
    public void insertCard(ATM atm) {
        System.out.println("Card inserted");
        atm.setState(new HasCardState());
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Error: no card inserted yet");
    }

    @Override
    public void insertPin(ATM atm) {
        System.out.println("Error: no card inserted yet");
    }

    @Override
    public void requestAmount(ATM atm) {
        System.out.println("Error: no card inserted yet");
    }
}
