package entities;

import java.util.Random;

public class Ghost extends Player{
    
    public Ghost(){
        super();
    }

    public Ghost(int x, int y, int screenSize) {
        super(x, y, screenSize);
    }

    @Override
    public final boolean canMove(){

        Random random = new Random();

        int d = random.nextInt(100);

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
            switch(getDirection()){
                case 0 : super.setY(getY() - 10);
                case 90 : super.setX(getX() + 10);
                case 180 : super.setY(getY() + 10);
                case 270 : super.setX(getX() + 10);
            }
        }
    }
    
    
}
