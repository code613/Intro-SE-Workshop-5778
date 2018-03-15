package main.primitives;

public class Coordinate implements Comparable<Coordinate> {
    private double _coordinate;

    // getters & setters

    public double get_coordinate() {
        return _coordinate;
    }

    public void set_coordinate(double _coordinate) {
        this._coordinate = _coordinate;
    }

    // constructors

    public Coordinate() {
        set_coordinate(0.0);
    }

    public Coordinate(double coordinate) {
        set_coordinate(coordinate);
    }

    public Coordinate(Coordinate  coordinate) {
        set_coordinate(coordinate.get_coordinate());
    }


    // utilities and methods

    @Override
    public int compareTo(Coordinate o) {
        return Double.compare(get_coordinate(),o.get_coordinate());
    }
}
