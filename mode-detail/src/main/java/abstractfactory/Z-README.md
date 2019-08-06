# 说明

## 工厂模式的特性
接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象



## 说明

1. 抽象出 AbstractFactory 工厂类
2. 继承AbstractFactory 构建ColorFactory 与 AnimalFactory两个工厂
3. 由 FactoryProducer 来选择使用(ColorFactory 与 AnimalFactory)中的哪一个

