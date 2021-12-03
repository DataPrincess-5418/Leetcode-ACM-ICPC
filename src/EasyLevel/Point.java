package EasyLevel;

public class Point {
    String index = "";
    double x0 = 0;
    double y0 = 0;
    double z0 = 0;

    public Point(String index, double x0, double y0, double z0) {
        this.index = index;
        this.x0 = x0;
        this.y0 = y0;
        this.z0 = z0;
    }

    public String getIndex() {
        return this.index;
    }

    public double getX0() {
        return this.x0;
    }

    public double getY0() {
        return this.y0;
    }

    public double getZ0() {
        return this.z0;
    }
}
