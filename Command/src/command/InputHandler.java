//Jacob A Carter &  Joshua  S Tolbert


package command;
import java.util.Map;
import java.util.HashMap;

public class InputHandler {
    private HashMap<String, Command> commands;
    
    public InputHandler(Document document) {
        commands = new HashMap<>();
        commands.put("load", new LoadCommand(document));
        commands.put("save", new SaveCommand(document));
        commands.put("spell", new SpellCommand(document));
        commands.put("print", new PrintCommand(document));
    }
    
    public void inputEntered(String data) {
        if (!commands.containsKey(data)) {
            System.out.println("Sorry, we don't recognize that command.");
            return;
        }
        commands.get(data).execute();
    }
}
