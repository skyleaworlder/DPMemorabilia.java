public class FactoryCreator {
    /**
     * CreateClient
     * 创造一个 Client
     * @param type
     * @return 实现了 Client 接口的 class 的 object
     */
    public static Client CreateClient(ClientType type) {
        switch (type) {
            case API_CLIENT:
                return new APIClient();
            case EVENT_CLIENT:
                return new EventClient();
            default:
                return null;
        }
    }
}
