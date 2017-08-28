package cn.celloud.day1

import scala.collection.mutable.ArrayBuffer

/**
 * 数组
 */
object test3 {
  def main(args: Array[String]): Unit = {
    //1、长度固定，内容可以改变
    val a1 = new Array[Int](10);
    a1(0) = 1
    a1(1) = 2
    a1(2) = 3
    for (a <- a1) {
      println(a)
    }
    //2、可以直接使用Array()，不用指定类型和长度
    //此时长度为3,值可以改变，且可以改变类型
    val a2 = Array("hello", "world", 23);
    a2(2) = "string"
    for (a <- a2) {
      println(a)
    }
    //3、ArrayBuffer，可变长度，如果想使用它，必须使用全类名
    val b1 = ArrayBuffer[Int]()
    b1 += 1
    b1 += 1
    b1 += 1
    b1 += 1
    for (b <- b1) {
      println(b)
    }
    println("====")
    b1 += (2, 3, 4, 5)
    for (b <- b1) {
      println(b)
    }
    println("====")
    //4、可以添加其他集合中的所有元素
    b1 ++= Array(6, 7, 8, 9)
    for (b <- b1) {
      println(b)
    }
    //5、Array和ArrayBuffer可以互换
    a1.toBuffer
    b1.toArray
    //6、yield
    val y1 = for (i <- 1 to 10) yield i
    //输出：Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(y1)
    val a3 = Array(1, 2, 3, 4, 5, 6)
    println("a3的类型：" + a3)
    val y2 = for (i <- a3) yield i * i
    for (i <- y2) {
      println(i)
    }
    println("====")
    //7、函数式编程转换Array数组
    val h1 = a3.filter(_ % 2 == 0).map(2 * _)
    for (i <- h1) {
      println(i * i)
    }
    println("====")
    //TODO 如何求_*_
    val h2 = a3.filter(_ % 2 == 0)
    for (i <- h1) {
      println(i * i)
    }
  }
}