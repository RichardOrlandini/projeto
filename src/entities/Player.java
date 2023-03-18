package entities;

public class Player extends GameObject{
    
    private int direction;
    private int quantityOfLife;
    private boolean invincible;

    public Player(){
        super();
    }

    public Player(int x, int y, int screenSize) {
        super(x, y, screenSize);

    }
    
    public boolean canMove(){
       int d = this.direction;
       int x = getX();
       int y = getY();


        if(d == 0){
            int newPosition = y - 10;
        }
        if(d == 180){
            int newPosition = y + 10;
        }
        if(d == 90){
            int newPosition = x - 10;
        }
        if(d == 270){
            int newPosition = x + 10;
        }

        if ( (x < 0 || x > getScreenSize() )){
            return false;
        } else if ((y < 0|| y > getScreenSize() )) {
            return false;
        } else {
            return true;
        }
    }

    public void playerMove(){
        if (this.canMove()){
            switch(this.direction){
                case 0 : super.setY(getY() - 10);
                case 90 : super.setX(getX() + 10);
                case 180 : super.setY(getY() + 10);
                case 270 : super.setX(getX() + 10);
            }
        }
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getQuantityOfLife() {
        return quantityOfLife;
    }

    public void setQuantityOfLife(int quantityOfLife) {
        this.quantityOfLife = quantityOfLife;
    }

    public boolean isInvincible() {
        return invincible;
    }

    public void setInvincible(boolean invincible) {
        this.invincible = invincible;
    }

    

    

}
