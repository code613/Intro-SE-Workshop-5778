package main.primitives;

public class Point3D extends Point2D{

    private  Coordinate _z;

    public Coordinate get_z() {
        return new Coordinate(_z);
    }

    public void set_z(Coordinate _z) {
        this._z .set_coordinate(_z.get_coordinate());
    }

    //constructors

    public Point3D() {
        // super();
        set_z(new Coordinate());
    }

    public Point3D(Coordinate x, Coordinate y, Coordinate z) {
        super(x, y);
        set_z(z);
    }

    public Point3D(double x, double y, double z) {
        this(new Coordinate(x),new Coordinate(y),new Coordinate(z));
    }


    public int compareTo(Point3D point) {
        if (super.compareTo((Point2D)point)==0 && get_z().compareTo(point.get_z())== 0)
        {
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return String.format("(%f , %f ,%f)",
                get_x().get_coordinate(), get_y().get_coordinate(), get_z().get_coordinate());
    }
}
