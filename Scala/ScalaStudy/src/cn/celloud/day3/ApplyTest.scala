package cn.celloud.day3

object ApplyTest {
  def main(args: Array[String]): Unit = {
    var p1 = new Apply("gaotianye")  //普通方式构造，这个Apply指的是class
    p1.test()
    p1.test
    var p2 = Apply("yuwei") //这个Apply指的是object  底层就是Apply.apply("yuwei")
    p2.test
    var p3 = Apply.apply("wangyanzhong")
    p3.test
  }
}