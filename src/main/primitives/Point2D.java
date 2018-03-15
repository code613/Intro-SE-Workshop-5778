package main.primitives;

public class Point2D  implements Comparable<Point2D>{
    private Coordinate _x;
    private Coordinate _y;

    // setters & getters

    public Coordinate get_x() {
        return new Coordinate(_x.get_coordinate());
    }

    public void set_x(Coordinate x) {
        this._x.set_coordinate(x.get_coordinate());
        //this._x = new Coordinate(x.get_coordinate());
    }

    public Coordinate get_y() {
        return new Coordinate(_y.get_coordinate());
    }


    public void set_y(Coordinate y) {
        this._y.set_coordinate(y.get_coordinate());
        //this._y = new Coordinate(y.get_coordinate());
    }

    // constructors

    public Point2D(){
        this (new Coordinate(),new Coordinate());
    }

    public Point2D(double _x,double _y) {
        this(new Coordinate(_x),new Coordinate(_y));
     // set_x(new Coordinate(_x));
     // set_y(new Coordinate(_y));
    }

    public Point2D(Coordinate _x,Coordinate _y) {
        set_x(_x);
        set_y(_y);
    }

    @Override
    public String toString() {
        return String.format("(%f , %f)",get_x(),get_y());
    }

    @Override
    public int compareTo(Point2D point) {
        if (this.get_x().compareTo(point.get_x()) == 0 && this.get_y().compareTo(point.get_y()) == 0)
        {
            return 0;
        }
        return 1;
    }
}
