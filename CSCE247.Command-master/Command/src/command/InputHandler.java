/*
 * Joshua S Tolbert
 */

package command;
import java.util.Map;
import java.util.HashMap;

public class InputHandler {
    private HashMap<String, Command> commands;
    
    public InputHandler(Document document) {
        commands = new HashMap<>();
    }
}
