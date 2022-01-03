public class ObjAdapter implements APIV3 {
    private APIV2 api_v2 = new APIV2Impl();

    @Override
    public void helloGloryWorld() {
        api_v2.helloWorld();
        System.out.println("The World is GLory!");
    }

    @Override
    public void sayGoodByeBye() {
        api_v2.sayGoodBye();
        System.out.println("ByeBye!");
    }
}

class APIV2Impl implements APIV2 {
    @Override
    public void helloWorld() {
        System.out.println("Hello World!");
    }

    @Override
    public void sayGoodBye() {
        System.out.println("Good Bye!");
    }
}