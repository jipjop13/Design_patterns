public class OutOfServiceState implements ATMState {
    @Override
    public void insertCard(ATM atm) {
        System.out.println("Error: ATM currently unavailable");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Error: ATM currently unavailable");
    }

    @Override
    public void insertPin(ATM atm) {
        System.out.println("Error: ATM currently unavailable");
    }

    @Override
    public void requestAmount(ATM atm) {
        System.out.println("Error: ATM currently unavailable");
    }
}
