package cn.celloud.day2
/**
 * 主构造函数
 */
//创建对象时，必须带着参数
class Student2(val name:String,val age:Int) {
  /**
   * 没有定义在任何方法或者代码块中的，都属于主构造函数中的
   * 当var s2 = new Student2("gaotianye",27)
   * 自定会执行println("name:"+name+",age:"+age)
   */
  println("name:"+name+",age:"+age)
}