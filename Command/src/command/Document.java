//Jacob A Carter &  Joshua  S Tolbert

package command;


public class Document {
    
    private String name;
    
    public Document(String name) {
        this.name = name;
        System.out.printf("Document named '%s' is created.", this.name);
    }
    
    public void load() {
        System.out.printf("Document '%s' is being loaded into view.", this.name);
    }
    
    public void save() {
        System.out.printf("Document '%s' is being saved.", this.name);
    }
    
    public void spellCheck() {
        System.out.printf("Document '%s' is being checked for spelling errors.", 
                this.name);
    }
    
    public void print() {
        System.out.printf("Document '%s' is printing.", this.name);
    }
}