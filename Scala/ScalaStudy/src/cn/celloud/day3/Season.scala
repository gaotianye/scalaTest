package cn.celloud.day3
/**
 * scala中的枚举需要继承Enumeration类，并通过调用Value方法来初始化枚举值
 */
object Season extends Enumeration{
  //这种方式无法通过for循环遍历
  val SPING = "春天"
  var SUMMER = "夏天"
  var AUTUMN = "秋天"
  var WINTER = "冬天"
  //这种方式的才能能够使用for循环遍历
  var S = Value(0,"chuntian")
  var A = Value(1,"qiuitian")
  
  def main(args: Array[String]): Unit = {
    println(Season.AUTUMN) //秋天
    println(Season.S) //chuntian
    println(Season.S.toString) //chuntian
    println(Season.S.id) //0
    println(Season(1)) //qiuitian
    
    println(Season.withName("chuntian"))  //chuntian
//    println(Season.withName("dongtian"))  //报错：No value found for 'dongtian'
    println("========")
    //遍历枚举
    for(s <- Season.values) println(s)
  }
}