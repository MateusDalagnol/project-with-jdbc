package application;

import java.util.List;

import entitites.Department;
import entitites.Seller;
import implementations_dao.DaoFactory;
import interfaces_dao.SellerDao;

public class Main {
    public static void main(String[] args) {
        
        SellerDao sellerDao = DaoFactory.creatSellerDao();

        System.out.println("=== Test 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== Test 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list) {
            System.out.println(obj);
        }

        
    }
}
