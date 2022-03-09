package classloader;

public class ClassLoaderTest {
    public static void main(String[] args) {
        MyClassLoader classLoader = new MyClassLoader("C:/java/JVM/target/classes/classloader/");
        try {
            Class<?> clazz = classLoader.loadClass("ClassLoaderTest");
            System.out.println("我是由" + clazz.getClassLoader().getClass().getName() + "类加载器加载的");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
