package application;

import java.util.Date;
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

        System.out.println("\n=== Test 3: seller findAll ===");
        List<Seller> listAll = sellerDao.findAll();

        for (Seller obj : listAll) {
            System.out.println(obj);
        }

        System.out.println("=== Test 4: seller insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("=== Test 5: seller update ===");
        seller = sellerDao.findById(1);
        sellerDao.insert(newSeller);
        seller.setName("Martha Waine");
        sellerDao.updade(seller);
        System.out.println("Update complete");

    }
}
