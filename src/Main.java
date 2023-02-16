import model.Department;
import model.Patients;
import model.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Patients> p1 = new ArrayList<>();

        Patients patients1 = new Patients("Anshu","Anshu@gmail.com",17);
        Patients patients2 = new Patients("Sushant", "Sushant.@.gmail.com",19);
        Patients patients3 = new Patients("Ishan", "Ishan.@.gmail.com",18);
        Patients patients4 = new Patients("Aayush",  "Ayush.@.gmail.com",18);
        Patients patients5 = new Patients("Avarna",  "Avarna.@.gmail.com",19);
        p1.add(patients1);
        p1.add(patients2);
        p1.add(patients3);
        p1.add(patients4);
        p1.add(patients5);

        ArrayList<Test> t1 = new ArrayList<>();
        Test test1 = new Test("ecg", 2000);
        Test test2 = new Test("echo", 2500);
        Test test3 = new Test("x-ray", 1000);
        Test test4 = new Test("bloodtest", 500);
        t1.add(test1);
        t1.add(test2);
        t1.add(test3);
        t1.add(test4);

        ArrayList<Department> d1 = new ArrayList<>();
        Department Department1 = new Department("ENT", "RAM");
        Department Department2 = new Department("Cardio", "Sita");
        Department Department3 = new Department("Bone", "Hari");
        Department Department4 = new Department("OPD", "Sam");
        d1.add(Department1);
        d1.add(Department2);
        d1.add(Department3);
        d1.add(Department4);

        System.out.println("Test Name         Test cost");
        test1.printFormat();
        test2.printFormat();
        test3.printFormat();
        test4.printFormat();
        System.out.println("Enter the test number");
        int input = scanner.nextInt();

        if(input == 1){
            System.out.println("your cost will be ");
            test1.cost();

        }
        if(input == 2){
            System.out.println("your cost will be ");
            test2.cost();

        }
        if(input == 3){
            System.out.println("your cost will be ");
            test3.cost();

        }
        if(input == 4){
            System.out.println("your cost will be ");
            test4.cost();

        }



    }
}