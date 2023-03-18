package entities;

public class Booster extends ClassItem {

    public double temp;

    public Booster() {
        super();
    }

    public Booster(int x, int y) {
        super(x, y);
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
