package command.jps;

public class DemoJps {
    public static void main(String[] args) {
        System.out.println("jps 指令");

        try {
            Thread.sleep(2000 * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
