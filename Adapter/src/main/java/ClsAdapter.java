public class ClsAdapter implements APIV3, APIV2 {
    /**
     * 按道理说这里应该是 private，但 java 不许外部定义 private interface，
     * 不允许 interface 中加可见性限制，不允许 private 继承 interface，
     * 不允许继承接口后具体实现的可见性弱于接口可见性。
     */
    public void helloWorld() {
        System.out.println("Hello World!");
    }

    public void sayGoodBye() {
        System.out.println("Good Bye!");
    }

    public void helloGloryWorld() {
        this.helloWorld();
        System.out.println("The World is Glory!");
    }

    public void sayGoodByeBye() {
        this.sayGoodBye();
        System.out.println("ByeBye!");
    }
}
