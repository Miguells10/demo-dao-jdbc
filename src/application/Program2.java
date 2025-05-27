package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("====== TEST 1: FindByID DEPARTMENT ========");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println();
        System.out.println("====== TEST 1: FindByID DEPARTMENT ========");
        List<Department> list = departmentDao.findAll();
        for(Department obj : list){
            System.out.println(obj);
        }


//        System.out.println("====== TEST 1: INSERT DEPARTMENT ========");
//        Department newDepartment = new Department(null, "Games");
//        departmentDao.insert(newDepartment);
//        System.out.println("Department inserted");


        System.out.println();
        System.out.println("====== TEST 2: UPDATE DEPARTMENT ========");
        Department department2 = departmentDao.findById(1);
        department2.setName("Music");
        departmentDao.update(department2);
        System.out.println("Updated!");

        System.out.println();
        System.out.println("====== TEST 2: DELETE DEPARTMENT ========");

        System.out.println("Ente id for delete test: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        department = departmentDao.findById(id);
        departmentDao.deleteById(id);
        System.out.println("Deleted completed: " + department);

        sc.close();



    }
}
