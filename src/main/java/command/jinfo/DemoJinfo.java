package command.jinfo;

public class DemoJinfo {
    public static void main(String[] args) {
        System.out.println("jinfo 指令");

        try {
            Thread.sleep(2000 * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
