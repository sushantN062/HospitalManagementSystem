package model;

public class Ward extends Department{
    Boolean Generalward;
    Boolean Standardward;

    public Ward(String departmentname, String doctor) {
        super(departmentname, doctor);
    }

    public Ward(String departmentname, String doctor, Boolean generalward, Boolean standardward) {
        super(departmentname, doctor);
        Generalward = generalward;
        Standardward = standardward;
    }

    public Boolean getGeneralward() {
        return Generalward;
    }

    public void setGeneralward(Boolean generalward) {
        Generalward = generalward;
    }

    public Boolean getStandardward() {
        return Standardward;
    }

    public void setStandardward(Boolean standardward) {
        Standardward = standardward;
    }
}