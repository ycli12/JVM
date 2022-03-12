package command.jconsole;

import java.util.LinkedList;

/**
 *  -Xms100m -Xmx100m -XX:+UseSerialGC
 */
public class DemoJconsole {
    static class OOMClass {
        public byte[] placeholder = new byte[8 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        LinkedList<OOMClass> list = new LinkedList<OOMClass>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(200);
            list.add(new OOMClass());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000000);
        System.gc();
    }
}
