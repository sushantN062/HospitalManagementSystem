package model;
public class Test {
    String test_name;
    int test_cost;


    public Test(String test_name, int test_cost) {

        this.test_name = test_name;
        this.test_cost = test_cost;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    public int getTest_cost() {
        return test_cost;
    }

    public void setTest_cost(int test_cost) {
        this.test_cost = test_cost;
    }

    public void printFormat() {


        System.out.println(test_name + "           "+ test_cost);



    }
    public void cost(){
        System.out.println(this.test_cost);
    }

}