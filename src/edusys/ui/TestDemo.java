/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edusys.ui;

import edusys.dao.NhanVienDAO;
import edusys.entity.NhanVien;
import java.util.List;

/**
 *
 * @author Pham Thu
 */
public class TestDemo {
    public static void main(String[] args) {
        NhanVienDAO dao = new NhanVienDAO();
        dao.insert(new NhanVien("NV02", "123", "Pham Thu", true));
//        List<NhanVien> ls = dao.selectAll();
//        for (NhanVien nv : ls) {
//            System.out.println("->"+nv.toString());
//        }
    }
}
