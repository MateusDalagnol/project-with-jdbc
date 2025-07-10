package application;

import entitites.Seller;
import implementations_dao.DaoFactory;
import interfaces_dao.SellerDao;

public class Main {
    public static void main(String[] args) {
        
        SellerDao sellerDao = DaoFactory.creatSellerDao();

        System.out.println("=== Test 1: seller findById ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
