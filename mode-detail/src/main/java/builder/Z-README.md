# 说明

## 建造者模式的特性
一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的



## 场景
- 一个典型的套餐可以是一个汉堡（Burger）和一杯冷饮（Cold drink）。
- 汉堡（Burger）可以是素食汉堡（Veg Burger）或鸡肉汉堡（Chicken Burger），它们是包在纸盒中。
- 冷饮（Cold drink）可以是可口可乐（coke）或百事可乐（pepsi），它们是装在瓶子中。

我们将创建一个表示食物条目（比如汉堡和冷饮）的 Item 接口和实现 Item 接口的实体类，以及一个表示食物包装的 Packing 接口和实现 Packing 接口的实体类，汉堡是包在纸盒中，冷饮是装在瓶子中
