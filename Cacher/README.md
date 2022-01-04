# Cacher

在 `class` 中设置一个 `private` 成员来存储某个方法的计算结果。

并在获取这个成员的时候：

```java
public class Cacher<T> {
    private T calcuValRes;

    private boolean nullValue() {
        return this.calcuValRes == null;
    }   

    private boolean outOfDate() {
        return false;
    }

    public T getVal() {
        if (this.nullValue() || this.outOfDate()) {
            this.calcuValRes = this.calcuVal();
        }
        return this.calcuValRes;
    }
}
```

大概这样。
