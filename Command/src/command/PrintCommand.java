//Jacob A Carter &  Joshua  S Tolbert

package command;


public class PrintCommand implements Command {
    
    private Document document;
    
    public PrintCommand(Document doc) {
        this.document = doc;
    }
    
    @Override
    public void execute() {
        this.document.print();
    }
}