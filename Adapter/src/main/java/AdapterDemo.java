public class AdapterDemo {
    public static void main(String[] args) {
        System.out.println("Class Adapter:");
        APIV3 cls_adapter = new ClsAdapter();
        cls_adapter.helloGloryWorld();
        cls_adapter.sayGoodByeBye();

        System.out.println("Object Adapter:");
        APIV3 obj_adapter = new ObjAdapter();
        obj_adapter.helloGloryWorld();
        obj_adapter.sayGoodByeBye();
    }
}
