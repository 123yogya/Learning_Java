public class GarbageCollector {

    public static void main(String[] args) {
        String str =  new String("Hello");
        str = null; // Object is no longer referenced
        System.gc(); // Request the jvm to run Garbage Collection
    }
}