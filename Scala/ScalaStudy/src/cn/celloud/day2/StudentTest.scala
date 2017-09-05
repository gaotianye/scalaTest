package cn.celloud.day2

object StudentTest {
  def main(args: Array[String]): Unit = {
    //可以有多种选择
    var s1 = new Student()
    /**
     * class Student2(val name:String,val age:Int) 
     * 只有1种选择
     */
    var s2 = new Student2("gaotianye",27)
    /**
     * class Student3(val name:String="gaotianye",val age:Int=28) 
     * 可以有多种选择
     */
    var s3 = new Student3("yuwei",21)
    var s4 = new Student3()
    var s5 = new Student3("zhangshaung")
    //编译失败：
//    var s6 = new Student3(25)
  }
}