package application;

import entitites.Seller;
import implementations_dao.DaoFactory;
import interfaces_dao.SellerDao;

public class Main {
    public static void main(String[] args) {
        
        SellerDao sellerDao = DaoFactory.creatSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
