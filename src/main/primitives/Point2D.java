package main.primitives;

public class Point2D {
    private Coordinate _x;
    private Coordinate _y;

    public Coordinate get_x() {
        return new Coordinate(_x.get_coordinate());
    }

    public void set_x(Coordinate x) {
        this._x = new Coordinate(x.get_coordinate());
    }

    public Coordinate get_y() {
        return new Coordinate(_y.get_coordinate());
    }

    public void set_y(Coordinate y) {
        this._y = new Coordinate(y.get_coordinate());
    }

    @Override
    public String toString() {
        return String.format("(%f , %f)",get_x(),get_y());
    }
}
