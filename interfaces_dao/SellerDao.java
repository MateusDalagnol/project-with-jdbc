package interfaces_dao;

import java.util.List;

import entitites.Department;
import entitites.Seller;

public interface SellerDao {
    
    void insert(Seller obj);
    void updade(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
