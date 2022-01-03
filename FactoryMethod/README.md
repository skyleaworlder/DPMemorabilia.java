# FactoryMethod

## 延迟构造

忘了在哪里看到的那句话了：“工厂方法的精髓在于延迟构造”。

一个专门的工厂类 `Factory` 被创建出来，其中的 `Create` 方法被调用，根据传入参数的不同（参数化工厂方法），就会返回不同的对象。

## 不知子类

还记得一句也忘记了出处的话：“使用工厂类的人不知道返回了什么子类”。

```java
class Demo {
    public static void main(String[] args) {
        FactoryCreator factory = new FactoryCreator();
        Client cli;
        cli = factory.CreateClient(ClientType.API_CLIENT);
        cli.sendMessage("API");
        cli = factory.CreateClient(ClientType.EVENT_CLIENT);
        cli.sendMessage("Event");
    }
}
```

使用工厂类的人只是知道要调用 `CreateClient` 这个方法，也只是知道传入的参数是什么。但是他万万不知道 `CreateClient` 这个工厂方法返回的对象的具体类型是什么。

他只是知道这个返回值实现了 `Client` 接口，或者是已知基类的子类，但他不清楚到底是什么。

所以我觉得 “多态” 是工厂方法不可缺少的一部分（废话
