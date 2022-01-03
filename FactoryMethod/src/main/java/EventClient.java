public class EventClient implements Client {
    public void sendMessage(String msg) {
        System.out.print("EventClient: ");
        System.out.println(msg);
    }
}
