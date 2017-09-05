package cn.celloud.day2

class HelloWorld {
  //默认提供public类型的setter和getter
  var age = 27
  //默认提供public类型的getter，由于是不可变类型，则没有setter方法
  val address = "松原"
  //默认提供private类型的setter和getter，外部无法直接使用
  private var name="gao"
  //如果外部想要使用，则自定义getter方法
  def getName=name
  //自定义setter方法(必须带着_,名称随意)
  //方法调用：h2.getName_=("tianye")
  /**
   * 等价：
   * public void setName(String value){
   * 		value = name;
   * }
   */
  def setName_=(value:String){name=value}
  def sayHello(){println("Hello,"+name)}
  //TODO 只能在当前类中使用,不提供setter和getter???
  private[this] var sex="man"
  def test1(){
    println(sex)
    sex="nv"
    println(sex)
  }
  def getSex=sex
  def setSex_=(value:String){sex=value}
  //自定义的main方法，不是主函数
  def main(args: Array[String]): Unit = {
    println("===")
  }
}