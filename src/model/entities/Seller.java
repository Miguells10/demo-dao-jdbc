package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {
    private Integer id;
    private String name;
    private String email;
    private Date Birthdate;

    private Double baseSalary;

    private Department department;

    public Seller(){};

    public Seller(Integer id, String name, String email, Date birthdate, Double baseSalary, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        Birthdate = birthdate;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(Date birthdate) {
        Birthdate = birthdate;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id) && Objects.equals(name, seller.name) && Objects.equals(email, seller.email) && Objects.equals(Birthdate, seller.Birthdate) && Objects.equals(baseSalary, seller.baseSalary) && Objects.equals(department, seller.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, Birthdate, baseSalary, department);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", Birthdate=" + Birthdate +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                '}';
    }

}
