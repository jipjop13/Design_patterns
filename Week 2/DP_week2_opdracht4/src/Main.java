import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        // create the context
        ATM atm = new ATM();
        atm.setState(new IdleState());

        System.out.println("Type a number for an event:");
        System.out.println("1. Insert card");
        System.out.println("2. Enter PIN code");
        System.out.println("3. Enter amount");
        System.out.println("4. Eject card");
        System.out.println("5. Get state");
        System.out.println();

        System.out.println("Insert your card");

        while(true){
            int input = in.nextInt();
            switch(input){
                case 1: atm.insertCard();
                        break;
                case 2: atm.insertPin();
                        break;
                case 3: atm.requestAmount();
                        break;
                case 4: atm.ejectCard();
                        break;
                case 5: System.out.println(atm.getState());
                        break;
                default: atm.setState(new OutOfServiceState());
                        break;
            }

        }
    }
}