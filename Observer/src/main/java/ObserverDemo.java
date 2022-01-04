public class ObserverDemo {
    public static void main(String[] args) {
        Storage s1 = new Storage("s1");
        Storage s2 = new Storage("s2");
        Observer app1 = new Application<Storage>("app1")
                .Register(s1)
                .Register(s2);
        Observer app2 = new Application<Storage>("app2")
                .Register(s1)
                .Register(s2);

        s1.setVal(2);
        System.out.println(app1.getStorageVal("s1"));
        System.out.println(app2.getStorageVal("s1"));
        s2.setVal(3);
        System.out.println(app1.getStorageVal("s2"));
        System.out.println(app2.getStorageVal("s2"));
    }
}
