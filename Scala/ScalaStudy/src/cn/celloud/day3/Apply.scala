package cn.celloud.day3
/**
 * 在伴生对象中使用apply方法，来创建伴生类
 */
object Apply {
  def apply(name:String)=new Apply(name)
}
//如果什么实现都没有，连{}都不用写 ,直接class Apply(var name:String)
class Apply(var name:String){
  def test(){
    println("name is "+name)
  }
}