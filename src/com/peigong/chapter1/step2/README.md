- 在选择优化的方是时，可以把fly和quack写成接口，会飞的鸭子集成Flyable，会叫的继承Quackable，虽然在Java8中接口可以有默认实现，但是叫声与飞行方式可能会有不同，同样需要在各子类中重写方法，代码无法很好地复用，所以这种方式也不好


```$xslt
找出应用中可能需要变化之处，把他们独立出来，
不要和那些不需要变化的代码混在一起
```

- 所以更好的实现是将鸭子的行为单独提出来，如FlyBehavior和QuackBehavior

```$xslt
针对接口编程真正的意思是针对超类型(supertype)编程
```
- 这里所谓的接口有多个含义，可以是一个概念，也是一种Java的interface构造
- 针对超类型编程，这句话可以更明确地说成"变量的声明类型应该是超类型，通常是一个抽象类或者是一个接口，如此，只要视具体实现此超类型的类所产生的对象，都可以指定给这个变量，这也意味着，声明类时不用理会以后执行时的真正对象类型

```
Dog d = new Dog();
d.bark();

Animal a = new Dog();
a.makeSound();
```

- 最后，还可以动态的改变对象的行为
```
Duck duck = new ModelDuck();
duck.performFly();
duck.setFlyBehavior(new FlyRocketPowered());
duck.performFly();
```