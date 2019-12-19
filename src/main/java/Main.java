import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Hello");
        System.out.println("Process ID " + ProcessHandle.current().pid());
        String version = System.getProperty("java.version");
        System.out.println("Java version" + version);
        InlineDog dog = new InlineDog();
        System.out.println(dog.getAge());
        System.out.println(dog.getAge());
        System.out.println(dog.getClass());
        List list = new ArrayList();
        for (int i = 0; i < 1000; i++) {
            list.add(new InlineDog());
            System.out.println(i);
        }
        Thread.sleep(1000_000);
    }

}
