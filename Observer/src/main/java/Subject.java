public interface Subject<T> {
    void Notify();
    void Bind(T observer);
    
    String getName();
    double getVal();
}
