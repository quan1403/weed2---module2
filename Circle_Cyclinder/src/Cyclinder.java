public class Cyclinder extends Circle {
    private double hight;

    public Cyclinder(double radius, String color, double hight) {
        super(radius, color);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
    public double getVolume(){
        return super.getArea()*getHight();
    }

    @Override
    public String toString() {
        return "Cyclinder{" +
                "hight=" + hight +
                '}';
    }
}

