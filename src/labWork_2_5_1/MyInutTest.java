package labWork_2_5_1;

/**
 * Created by Bulik on 19.07.2016.
 */
public class MyInutTest {
    static {
        System.out.println("static initialization block 1");
    }
    public MyInutTest(int i){
        System.out.println("Constructor 2");
    }
    {
        System.out.println("non-static initialization block 1");
    }
    public MyInutTest(){
        this(100);
        System.out.println("Constructor 1");
    }
    {
        System.out.println("non-static initialization block 2");
    }
    static {
        System.out.println("static initialization block 2");
    }
}
