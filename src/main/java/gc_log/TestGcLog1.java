package gc_log;

import java.util.ArrayList;

/**
 * -Xms50M -Xmx50M -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintHeapAtGC
 */
public class TestGcLog1 {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<byte[]>();
        for (int i = 0; i < 200; i++) {
            list.add(new byte[1024 * 100]);
        }
    }
}
