import java.util.Stack;

// invoker
public class DeviceButton {

    private Stack<Command> stacky;

    public DeviceButton(){
        stacky = new Stack<>();
    }
    
    public void execute(Command cmd){
        System.out.println("Device button is pressed !");
        stacky.push(cmd);
        cmd.execute();
    }

    public void undo(){
        Command cmd = stacky.pop();
        System.out.print("UNDO : ");
        cmd.undo();

        /*System.out.println("Undo last command !");
        cmd.undo();
        stacky.pop*/
    }
}