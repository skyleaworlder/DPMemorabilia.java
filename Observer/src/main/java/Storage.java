import java.util.HashMap;

public class Storage<T extends Observer> implements Subject<T> {
    private String name;
    private HashMap<String, T> hm = new HashMap<String, T>();
    private double val;

    Storage(String name) {
        this.name = name;
    }

    public void setVal(double val) {
        this.val = val;
        System.out.println("Storage(" + this.getName() + ") set value(" + this.getVal() + ")");
        System.out.println("Storage(" + this.getName() + ") Notify Begin:");
        this.Notify();
    }

    public double getVal() {
        return val;
    }

    public String getName() {
        return name;
    }

    public void Bind(T app) {
        this.hm.put(app.getName(), app);
    }

    public void Notify() {
        for (String name : this.hm.keySet()) {
            T app = this.hm.get(name);
            System.out.println("  Notify Application(" + name + ")");
            app.Update(this);
        }
    }
}