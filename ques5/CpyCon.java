package ques5;

class Test {
    int s;

    Test(int s){
        this.s = s;
    }

    Test(Test i){
        System.out.println("Copy Constructor");
        s = i.s;
    }

}
public class CpyCon{
    public static void main(String[] args) {
        Test obj = new Test(10);
        Test obj2 = new Test(obj);
        System.out.println("Value: " + obj2.s);
    }
}
