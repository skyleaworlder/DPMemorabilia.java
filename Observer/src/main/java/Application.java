import java.util.ArrayList;
import java.util.HashMap;

public class Application<T extends Subject> implements Observer<T> {
    private String name;
    private HashMap<String, Double> subjectsVals = new HashMap<String, Double>();
    private ArrayList<T> subjects = new ArrayList<T>();

    Application(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Application 注册 Storage,
     * 同时要让 Storage 知道 Application
     * @param s
     */
    public Observer<T> Register(T s) {
        System.out.println("Application(" + this.getName() + ") Register Storage(" + s.getName() + ")");
        this.subjects.add(s);
        s.Bind(this);
        return this;
    }

    /**
     * Update 更新 Storage 中的值。
     * 会更新当前 Application 中对 Storage 的缓存。
     * @param s
     */
    public void Update(T s) {
        if (!this.subjects.contains(s)) {
            return;
        }
        System.out.println("Application(" + this.getName() + ") Update Storage(" + s.getName() + ") with value(" + s.getVal() + ")");
        this.subjectsVals.put(s.getName(), s.getVal());
    }

    public double getStorageVal(String name) {
        return this.subjectsVals.get(name);
    }
}
