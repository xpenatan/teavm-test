public final class TestClass {
    private static Object provider;

    public static synchronized void register(Object value) {
        provider = value != null ? value : new Object();
    }

    public static void main(String[] args) {
        register(new Object());
        System.out.println("REGISTERED");
    }
}
