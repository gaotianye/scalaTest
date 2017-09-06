package cn.celloud.day3
/**
 * object 和 class的唯一区别：object不能定义接受参数的constructor
 * 
 * object可以继承抽象类，并实现里面的方法
 */
abstract class Hello(var message:String) {
  def sayHello(name:String):Unit //没有=  表示没有实现
}

object HelloImpl extends Hello("hello"){
  def sayHello(name:String)={
    println(message+","+name)  
  }
}