# 说明
必须实现Cloneable 接口


## 原型模式的特性
1. 由原型对象自身创建目标对象。(也就是说，对象创建这一动作发自原型对象本身。)
2. 目标对象是原型对象的一个克隆。(也就是说，通过原型模式创建的对象，不仅仅与原型对象具有相同的结构，还与原型对象具有相同的值。)
3. 根据对象克隆深度层次的不同，有浅度克隆与深度克隆。



## 场景
一个对象需要在一个高代价的数据库操作之后被创建。
我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用


