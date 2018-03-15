package main.geometries;

import main.primitives.Point3D;

public class Triangle {
    private Point3D p1;
    private Point3D p2;
    private Point3D p3;

    public Triangle(Point3D p1, Point3D p2, Point3D p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point3D getP1() {
        return new Point3D(p1);
    }

    public void setP1(Point3D p1) {
        this.p1 = new Point3D(p1);
    }

    public Point3D getP2() {
        return new Point3D(p2);
    }

    public void setP2(Point3D p2) {
        this.p2 = new Point3D(p2);
    }

    public Point3D getP3() {
        return new Point3D(p3);
    }

    public void setP3(Point3D p3) {
        this.p3 = new Point3D(p3);
    }

}
