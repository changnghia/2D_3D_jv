package Buoi8;
import java.util.Scanner;

public class Diem3D_Main {

    public static void main(String[] args) {
        // Tạo điểm A với tọa độ (9, 12, 10)
        Diem3D A = new Diem3D(9, 12, 10);
        System.out.print("Tọa độ điểm A: ");
        A.hienThi();
        
        // Tạo điểm B đối xứng với điểm A qua gốc tọa độ
        Diem3D B = new Diem3D(-A.giaTriX(), -A.giaTriY(), -A.giaTriZ());
        System.out.print("Tọa độ điểm B: ");
        B.hienThi();
        
        // Hiển thị khoảng cách từ điểm B đến gốc tọa độ
        System.out.println("Khoảng cách từ điểm B đến gốc tọa độ: " + B.khoangCach(new Diem3D()));
    }

}
