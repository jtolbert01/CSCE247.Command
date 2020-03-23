package command;


public class SpellCommand implements Command {
    
    private Document document;
    
    public SpellCommand(Document doc) {
        this.document = doc;
    }
    
    @Override
    public void execute(){
        this.document.spellCheck();
    }
}