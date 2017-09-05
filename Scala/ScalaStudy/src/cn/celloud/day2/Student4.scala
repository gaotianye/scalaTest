package cn.celloud.day2
/**
 * 某种优化操作
 * 只有当类使用它时，才开始声明为private[this] val name  private[this] val age
 */
class Student4(name:String,age:Int) {
  println("name:"+name+",age:"+age)
}