//Jacob A Carter &  Joshua  S Tolbert

package command;


public class SaveCommand implements Command {
    
    private Document document;
    
    public SaveCommand(Document doc) {
        this.document = doc;
    }
    
    @Override
    public void execute() {
        this.document.save();
    }
}

