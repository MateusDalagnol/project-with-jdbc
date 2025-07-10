package implementations_dao;

import db.DB;
import interfaces_dao.DepartmentDao;
import interfaces_dao.SellerDao;

public class DaoFactory {
    
    public static SellerDao creatSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao(){
        return new DepartamentDaoJDBC(DB.getConnection());
    }
}
