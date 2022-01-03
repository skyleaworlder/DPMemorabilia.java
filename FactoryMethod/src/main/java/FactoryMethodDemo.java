public class FactoryMethodDemo {
    public static void main(String[] args) {
        FactoryCreator factory = new FactoryCreator();

        Client cli = factory.CreateClient(ClientType.EVENT_CLIENT);
        cli.sendMessage("This is EventClient.");
        cli = factory.CreateClient(ClientType.API_CLIENT);
        cli.sendMessage("This is APICLient.");
    }
}
