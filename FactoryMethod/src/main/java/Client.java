enum ClientType {
    API_CLIENT("api_client"),
    EVENT_CLIENT("event_client");

    private String type;
    ClientType(String client_type) {
        this.type = client_type;
    }

    public String getClientType() {
        return type;
    }
}


public interface Client {
    void sendMessage(String msg);
}