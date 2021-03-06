# Adapter

## 接口转换

为什么叫 `Adapter`？我想大部分原因在于实现多 `interface` 或继承多 `class`。`Adapter` 旨在隐藏 **需要转换的接口**，将其转化 / 暴露为 **目标接口**。

```c++
class Adapter: public Target, private Source1, private Source2 {};
```

同时，`Adapter` 相当于是隐藏了 **需要转换的接口**。

## 专用适配器

因为是要做一个 `interface` / `class` 到另一个的适配，所以肯定是专用的适配器，不存在什么 `Adapter<Target, Source>` 这种吧。

## 还是对象适配器

所以分为 **类适配器** 和 **对象适配器**。

前者的问题在于非 `C++` 不存在多重继承，而如果是接口实现的话，又不能指定 `private` 实现接口（对于一般外部定义接口来说，类内定义接口还是可以）。而类似存在接口继承语法的语言又非得要为了适配多写一个大接口。

后者相比之下更方便，因为可以仅仅 `implements` 一个输出接口，而将已经实现 **需要转换接口** 的类的对象作为适配器的 `private` 成员。

## 可隐式实现接口的语言

如果 **需要适配** 的类仅仅需要 `export` 一部分方法给适配器使用，那么按道理来说，像 `Java` 这种需要显示指定 `implements interface` 的语言来说，就需要新建一个接口，并显示 `implements`，很烦。

但如果是 `go` 的话，那就可以只写 `interface definition`。
