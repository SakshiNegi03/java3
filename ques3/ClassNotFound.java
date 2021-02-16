package ques3;

public class ClassNotFound {
    public static void main(String[] args) {
        try
        {
            Class.forName("abc.txt");
        }catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
