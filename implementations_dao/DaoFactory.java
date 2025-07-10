package implementations_dao;

import interfaces_dao.SellerDao;

public class DaoFactory {
    
    public static SellerDao creatSellerDao(){
        return new SellerDaoJDBC();
    }
}
