package model;

public class Department {
    String Departmentname;
    String Doctor;

    public Department(String departmentname, String doctor) {
        Departmentname = departmentname;
        Doctor = doctor;
    }

    public String getDepartmentname() {
        return Departmentname;
    }

    public void setDepartmentname(String departmentname) {
        Departmentname = departmentname;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String doctor) {
        Doctor = doctor;
    }
}