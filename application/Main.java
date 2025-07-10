package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entitites.Department;
import entitites.Seller;
import implementations_dao.DaoFactory;
import interfaces_dao.DepartmentDao;
import interfaces_dao.SellerDao;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.creatSellerDao();
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

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
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(),
                4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("=== Test 5: seller update ===");
        seller = sellerDao.findById(1);
        sellerDao.insert(newSeller);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update complete");

        System.out.println("=== Test 6: Delete seller ===");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete complete!");

        System.out.println("\n\n\n\n\n\n\n");

        System.out.println("\n=== Teste 1: Department insert ===");
        Department newDepartment = new Department(null, "Marcenaria");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id =" + newDepartment.getId());

        System.out.println("\n=== Test 2: department findById ===");
        department = departmentDao.findById(7);
        System.out.println(department);

        System.out.println("\n=== Test 3: department update ===");
        department = departmentDao.findById(1);
        department.setName("Martha Waine");
        departmentDao.update(department);
        System.out.println("Update complete");

        System.out.println("\n=== Test 4: Delete department ===");
        System.out.println("Enter id for delete test: ");
        int idDartment = sc.nextInt();
        departmentDao.deleteById(idDartment);
        System.out.println("Delete complete!");

        System.out.println("\n=== Test 5: department findAll ===");
        List<Department> listAllDepartments = departmentDao.findAll();

        for (Department obj : listAllDepartments) {
            System.out.println(obj);
        }

        sc.close();
    }
}
