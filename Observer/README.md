# Observer

大概我会用在数据同步上。

## 观察和被观察

在书中的 196 页有一个 `UML` 图，讲的就是观察者模式下 `Observer` 向 `Subject` 发送更新消息，导致 `Subject` 变化带动 `Object` 变化的过程。

但其实也不一定是 `Obeserver` 发送消息，可以是其他类调用 `Subject` 的 `set` 这一类方法。

## 面向接口编程

既然 `Application` 作为观察者，那就应该 `implements Observer`，既然 `Storage` 作为被观察者，那就应该 `implements Subject`。

```java
public class Application<T extends Subject> implements Observer<T> {
}

public class Storage<T extends Observer> implements Subject<T> {
}
```
