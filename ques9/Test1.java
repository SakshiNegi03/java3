package ques9;

public class Test1 {
    public static void main(String[] args) {

        Woods woods1=new Woods("Table",9000,true, false);
        Woods woods2=new Woods("Chair",6000,true, true);
        woods1.getDetails();
        woods1.FireTest();
        woods1.StressTest();
        woods2.getDetails();
        woods2.FireTest();
        woods2.StressTest();
    }
}