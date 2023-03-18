package entities;

public class GameObject {
    private int x;
    private int y;
    private int screenSize;

    
    public GameObject() {

    }


    public GameObject(int x, int y, int screenSize) {
        this.x = x;
        this.y = y;
        this.screenSize = screenSize;
    }

    public GameObject(int x, int y ) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(GameObject o){
        this.x = o.x;
        this.y = o.y;
        return true;
    }

    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }


    public void setY(int y) {
        this.y = y;
    }


    public int getScreenSize() {
        return screenSize;
    }


    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    

}
