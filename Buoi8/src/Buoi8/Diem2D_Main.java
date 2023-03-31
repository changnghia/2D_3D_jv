package Buoi8;

public class Diem2D_Main {
    public static void main(String[] args) {
        Diem2D A = new Diem2D(9, 12);
        System.out.print("Toa do diem A: ");
        A.hienThi();

        Diem2D B = new Diem2D();
        System.out.print("Nhap toa do diem B:\n");
        B.nhapDiem();
        System.out.print("Toa do diem B: ");
        B.hienThi();

        Diem2D C = new Diem2D(-B.giaTriX(), -B.giaTriY());
        System.out.print("Toa do diem C: ");
        C.hienThi();

        System.out.println("Khoang cach tu diem B den goc toa do: " + B.khoangCach());

        System.out.println("Khoang cach tu diem A den diem B: " + A.khoangCach(B));
    }
}
