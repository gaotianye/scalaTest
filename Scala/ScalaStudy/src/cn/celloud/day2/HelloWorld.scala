package cn.celloud.day2

class HelloWorld {
  private var name="gao"
  def sayHello(){print("Hello,"+name)}
  def getName=name
  
  //自定义的main方法，不是主函数
  def main(args: Array[String]): Unit = {
    println("===")
  }
}