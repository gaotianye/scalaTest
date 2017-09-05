package cn.celloud.day2
/**
 * 测试 private[this] var age2=27  只能在当前实例中有效
 */
class Stu {
  private var name = "gaotianye"
  def getName=name
  def setName_=(value:String){
    name = value
  }
  private var age=27
	private[this] var age2=27
  def getAge=age
  def setAge_=(value:Integer){
    age=value
  }
  def older(s:Stu){
    age>s.age
  }
  def older2(s:Stu){
    //private[this] var age2=27  只能在当前实例中有效
//	  age2>s.age2
  }
}