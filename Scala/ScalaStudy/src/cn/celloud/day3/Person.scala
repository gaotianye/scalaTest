package cn.celloud.day3
/**
 * object是scala独有的，用来存储静态成员，如工具方法，或者作为单例使用
 */
object Person {
  private var num=2 //主构造函数
  println("this is main constructor")//主构造函数
  def getNum=num
  
  def main(args: Array[String]): Unit = {
    var num = Person.getNum
    var num2 = Person.getNum
    println(num)
    println(num2)
  }
}
/**
 * 伴生类和伴生对象可以互相使用对方的private 字段
 */
class Person(var name:String,var age:Int){
  def sayHello=println("Hi,"+name+",I am "+age+"years old...."+
      "you must have "+Person.num+" eyes...")
}