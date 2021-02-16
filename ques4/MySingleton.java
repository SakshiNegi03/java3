package ques4;
public class MySingleton {
	 
    private static MySingleton a;
     
    static{
        a = new MySingleton();
    }
     
    private MySingleton(){
     
    }
     
    public static MySingleton getInstance(){
        return a;
    }
     
    public void test(){
        System.out.println("Hey");
    }
     
    public static void main(String a[]){
        MySingleton ms = getInstance();
        ms.test();
    }
}