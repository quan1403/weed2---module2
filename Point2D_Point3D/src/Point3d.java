public class Point3d extends Point2D {
    private float z = 0.0f;

    public Point3d() {
    }
    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }


    public void  setXYZ(float x, float y, float z) {
      super.getXY();
        this.z=z;
    }


    public float[] getXYZ () {
        float []xyz = new float[3];
        System.arraycopy(super.getXY(),0,xyz,0,super.getXY().length);
        xyz[2]=this.z;
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "z=" + z +
                '}';
    }
}
