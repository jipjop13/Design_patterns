public class HasCorrectPinState implements ATMState {
    @Override
    public void insertCard(ATM atm) {
        System.out.println("Card already inserted");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Card will be ejected");
        atm.setState(new IdleState());
    }

    @Override
    public void insertPin(ATM atm) {
        System.out.println("Error: correct PIN already inserted");
    }

    @Override
    public void requestAmount(ATM atm) {

        if (atm.getAmount() == 0){
            System.out.println("Machine is out of money!");
            atm.setState(new OutOfServiceState());
        }else{
            System.out.println("There is " + atm.getAmount() + " euro left in the machine");
            atm.setState(new HasAmountState());
            atm.requestAmount();
        }

    }
}
