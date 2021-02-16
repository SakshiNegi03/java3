package ques5;

public class clone implements Cloneable{
    int rollno;
    String name;

    clone(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }
    public static void main(String args[]) throws CloneNotSupportedException{
        
            clone obj1=new clone(200,"SAM");
            clone obj2=(clone)obj1.clone(); 
            System.out.println("1 object: "+obj1.rollno+" "+obj1.name);
            System.out.println("2 object: "+obj2.rollno+" "+obj2.name);
    }
}