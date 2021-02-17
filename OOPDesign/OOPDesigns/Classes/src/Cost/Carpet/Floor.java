package Cost.Carpet;

public class Floor {

    private double length;
    private double width;

    public Floor(double length, double width) {
        this.length = length;
        this.width = width;
        if(this.width <0){
            this.width = 0;
        }
        if(this.length < 0){
            this.length = 0;
        }

    }

    public double getArea(){
        return (this.length*this.width);
    }


}
