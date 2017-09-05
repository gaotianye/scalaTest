package cn.celloud.day2
/**
 * 辅助构造函数
 * 创建对象时，可以有多种选择
 */
class Student {
  private var name=""
  private var age=0
  def this(name:String){
    //第一行必须调用主构造函数
    this()
    this.name=name
  }
  def this(name:String,age:Integer){
	  //第一行必须调用主构造函数
    this(name)
    this.age=age
  }
}