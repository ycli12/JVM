package command.jstat;

import java.io.IOException;

// -Xms20M -Xmx20M -Xmn10M -XX:+UseSerialGC -XX:+PrintGCDetails -verbose:gc
public class DemoJstat {
    private static final int _1M = 1024 * 1024;

    public static void main(String[] args) throws IOException {
        System.out.println("jstat 指令");

        byte[] b1 = new byte[2 * _1M];
        System.out.println("创建b1...");
        System.in.read();

        byte[] b2 = new byte[2 * _1M];
        System.out.println("创建b2...");
        System.in.read();

        byte[] b3 = new byte[2 * _1M];
        System.out.println("创建b3...");
        System.in.read();

    }
}
