package interfaces_dao;

import java.util.List;

import entitites.Department;

public interface DepartmentDao {
    
    void insert(Department obj);
    void updade(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
