package entities;

public class ClassItem extends GameObject{
    
    private boolean visivel; // visivel

    public ClassItem(){
        super();
    }

    public ClassItem(int x, int y) {
        super(x, y);
    }

    public boolean isItem() {
        return visivel;
    }

    public void setItem(boolean visivel) {
        this.visivel = visivel;
    }

}
