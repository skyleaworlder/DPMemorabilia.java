public class APIClient implements Client {
    public void sendMessage(String msg) {
        System.out.print("APIClient: ");
        System.out.println(msg);
    }
}
