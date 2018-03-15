package main.primitives;

public class Point2D {
    private Coordinate _x;
    private Coordinate _y;

    public Coordinate get_X() {
        return new Coordinate(_x.get_coordinate());
    }

    public void set_X(Coordinate x) {
        this._x = new Coordinate(x.get_coordinate());
    }

    public Coordinate get_Y() {
        return new Coordinate(_y.get_coordinate());
    }

    public void set_Y(Coordinate y) {
        this._y = new Coordinate(y.get_coordinate());
    }

}
