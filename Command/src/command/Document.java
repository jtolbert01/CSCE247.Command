/*
 * Joshua S Tolbert
 */

package command;


public class Document {
    
    private String name;
    
    public void Document(String name) {
        this.name = name;
        System.out.printf("Document named '%d' is created.", this.name);
    }
    
    public void load() {
        System.out.printf("Document '%d' is being loaded into view.", this.name);
    }
    
    public void save() {
        System.out.printf("Document '%d' is being saved.", this.name);
    }
    
    public void spellCheck() {
        System.out.printf("Document '%d' is being checked for spelling errors.", 
                this.name);
    }
    
    public void print() {
        System.out.printf("Document '%d' is printing.", this.name);
    }
}
