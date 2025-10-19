package static_vs_instance;

import java.awt.*;

public class ExerciseTwo {
    private int x;
    private int y;

    public ExerciseTwo() {
    }

    public ExerciseTwo(int x,int y) {
        this.x = x;
        this.y = y;
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

    public double distance() {
        //distance between this Point and Point (0, 0)

//        return Math.sqrt(x*x-y*y);
        ExerciseTwo point = new ExerciseTwo(0,0);
        return distance(point);

    }


    public double distance(ExerciseTwo point){
        return Math.sqrt((this.x - point.x )* (this.x - point.x ) +(this.y - point.y)* (this.y - point.y));
    }

    public double distance(int x,int y){
//        return Math.sqrt((this.x - x )^2 -(this.y - y)^2);
        ExerciseTwo point = new ExerciseTwo(x,y);
        return distance(point);
    }


    public static void main(String[] args) {
        ExerciseTwo pointOne = new ExerciseTwo(2,3);
        ExerciseTwo pointTwo = new ExerciseTwo(4,5);
        System.out.println(pointOne.distance(pointTwo));
        System.out.println(pointOne.distance());
    }

}
