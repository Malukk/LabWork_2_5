package labWork_2_5_5;

import java.util.Random;

/**
 * Created by Bulik on 19.07.2016.
 */
public class InitTest {
    private static  int nextId;
    private  int id;

    static {
        Random random = new Random();
        nextId = 1 + random.nextInt(1000);
        System.out.println("nextId-> "+nextId);
    }

    {
        id=nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }
}
