//Jacob A Carter &  Joshua  S Tolbert

package command;


public class LoadCommand implements Command{
    
    private Document document;
    
    public LoadCommand(Document doc) {
        this.document = doc;
    }
    
    @Override
    public void execute() {
        this.document.load();
    }
}