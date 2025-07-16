public class OverridingDemo extends  Object{
    @Override
    public String toString() {
       return ("OverridingDemo");
    }   /* Overriding the toString function in OverridingDemo Class */
    int x,y,z;

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

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
