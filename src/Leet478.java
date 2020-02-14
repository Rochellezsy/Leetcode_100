import java.util.Random;

public class Leet478 {
    double radius;
    double x_center;
    double y_center;

    public Leet478(double radius, double x_center, double y_center) {
        this.radius=radius;
        this.x_center=x_center;
        this.y_center=y_center;
    }

    public double[] randPoint() {
        double[]res=new double[2];
        double x0=x_center-radius;
        double y0=y_center-radius;

        while(true){
            double x=x0+Math.random()*radius*2;
            double y=y0+Math.random()*radius*2;

            if(Math.sqrt(Math.pow(x-x_center,2)+Math.pow(y-y_center,2))<=radius){
                res[0]=x;
                res[1]=y;
                return res;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Math.random());
    }
}
