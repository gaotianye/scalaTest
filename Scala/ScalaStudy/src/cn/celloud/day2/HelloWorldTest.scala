package cn.celloud.day2

object HelloWorldTest {
  def main(args: Array[String]): Unit = {
    //1、创建对象可以带着()，也可以不用带着
    var h1 = new HelloWorld()
    var h2 = new HelloWorld
    //2、类中定义方法时，就没有()，此时调用也无需()
    var n1 = h1.getName
    var n2 = h2.getName
    h2.setName_=("tianye")
    var n3 = h2.getName
    println(n1+","+n2+","+n3)
    //3、调用方法
    h1.sayHello()
    //4、var age = 27
    println(h1.age)
    h1.age=33
    println(h1.age)
    //5、测试 private[this] var sex="man"
    var s1 = h2.getSex
    h2.setSex_=("nv")
    var s2 = h2.getSex
    println(s1+","+s2)
    println("===")
    h1.test1()
  }
}