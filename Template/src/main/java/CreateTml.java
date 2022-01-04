public abstract class CreateTml<T, C> {
    public abstract T CollectData();
    public abstract C CreateConn();
    public abstract void CreateData(C conn, T data);

    public final void CreateProcess() {
        T data = this.CollectData();
        C conn = this.CreateConn();
        this.CreateData(conn, data);
    }
}
