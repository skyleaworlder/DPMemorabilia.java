public interface Observer<T extends Subject> {
    Observer Register(T subject);
    void Update(T subject);

    String getName();
    double getStorageVal(String name);
}
