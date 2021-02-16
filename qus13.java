package java1;

public class qus13{
    public static void main(String[] args) {
        try {
            throw new Aexception("Threw Custom Exception");
        }
        catch (Aexception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Caught Custom Exception");
        }
    }
}
class Aexception extends Exception{
    public Aexception(String s) {
        super(s);
    }
}