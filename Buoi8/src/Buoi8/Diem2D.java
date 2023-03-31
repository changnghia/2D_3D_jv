package Buoi8;

import java.util.Scanner;

public class Diem2D {
    private int x;
    private int y;

    public Diem2D() {
        x = 0;
        y = 0;
    }

    public Diem2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhap toa do x: ");
            x = Integer.parseInt(sc.nextLine());

            System.out.print("Nhap toa do y: ");
            y = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhap sai dinh dang so nguyen!");
        }
    }

    public void hienThi() {
        System.out.println("(" + x + "," + y + ")");
    }

    public void doiDiem(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int giaTriX() {
        return x;
    }

    public int giaTriY() {
        return y;
    }

    public float khoangCach() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public float khoangCach(Diem2D d) {
        int dx = x - d.giaTriX();
        int dy = y - d.giaTriY();
        return (float) Math.sqrt(dx * dx + dy * dy);
    }
}

