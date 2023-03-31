package Buoi8;

public class Diem3D extends Diem2D {
    private int z;

    public Diem3D() {
        super();
        z = 0;
    }

    public Diem3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public int giaTriX() {
    	return super.giaTriX();
    }
    public int giaTriY() {
    	return super.giaTriY();
    }
public int giaTriZ() {
	return this.z;
}
    public void doiDiem(int dx, int dy, int dz) {
        super.doiDiem(dx, dy);
        this.z += dz;
    }

    public void hienThi() {
        System.out.println("(" + giaTriX() + "," + giaTriY() + "," + this.z + ")");
    }

    public float khoangCach(Diem3D d) {
    	return (float)Math.sqrt(Math.pow((double)(giaTriX() -
    			d.giaTriX()), 2) + Math.pow((double)(giaTriY() - d.giaTriY()), 2) +
    			Math.pow((double)(this.z - d.giaTriZ()), 2));
    }
}
