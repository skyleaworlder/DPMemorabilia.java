# Template

是之前经常不小心就用到的设计模式。

## 相同过程

我觉得如果一份代码又 “差不多” 地写了一遍，那大概是可以用 `Template` 模式的。

设计模式是从面向对象 / 接口编程角度切入的，但为了人类理解起来更加便捷，会不可避免添加 “过程代码”。比如，`SICP` 中抽象过程代码，这就是在应用模板模式。

## 多态

在我看来，模板模式是 “多态” 优势的最通俗表现：

```java
public class A {
    private String name = "BASE";
    public final void Hello() {
        System.out.println("This is " + name + ".");
    }
}

public class B extends A {
    private String name = "API";
}

public class C extends A {
    private String name = "EVENT";
}
```

由于多态的存在，哪怕是 `A` 类型的对象也可能输出 `"This is EVENT."`。其实 `Hello` 方法就是一个模板方法。

## abstract 的表现力

模板模式我觉得还挺自然的，`abstract` 方法其实已经有很强的表现力了——参数、返回类型都定义好了。那么就应该 ”具体“ 实现 **已有表现力** 可以 `handle` 的方法。

在 ”抽象过程等同于具体过程“ 的时候，不一定非要等到所有方法都 `concrete` 了再去实现过程。

## 延迟

模板的含义在于预定义过程。无论是设计模式中的模板，还是某某 `app` 中的模板。

而这意味着 ”我将延迟操作“——虽然提前定义了过程，但具体的实现 ”延迟“ 到派生类中定义了。
