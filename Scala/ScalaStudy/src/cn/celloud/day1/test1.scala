package cn.celloud.day1
import scala.util.control.Breaks._
object test1 {
  def main(args: Array[String]): Unit = {
    //1、标准输出println
    var c = 1 + 3
    println("c=" + c)
    //2、取交集：lo
    println("Hello".intersect("Wolrd"))
    //3、去重：Helo Wrd
    println("Hello   World".distinct)
    //4、类()等价于类.apply()  
    //等价于"Hello World".apply(7)  结果：o
    println("Hello World"(7))
    var x = if (c < 2) {
      1
    } else {
      2
    }
    println("if ... " + x)
    //5、等价于下面
    var p = if (c < 2) 1 else 2
    println("if ... " + p)
    //6、if-else返回值类型可以不一样
    var o = if (c < 2) 1 else "good"
    println("if ... " + o)
    //7、最后一行就是返回值,如上面if语句。
    //如果最后一行没有返回值，那么默认是()，如下面输出  t is ()
    var cc = 1
    var t = if (c < 2) {
      1
    } else {
      cc += 1
    }
    println("t is " + t)
    //8、printf 占位符
    printf("Hi, my name is %s, I'm %d years old.\n", "gaotianye", 27)
    //9、类似于java中的System.in和Scanner的作用
    /*var r1 = readLine()
    println(r1)*/
    //10、指定readInt、readDouble时，如果输入的不是指定的类型，会报错
    //例如:Exception in thread "main" java.lang.NumberFormatException: For input string: "ew"
    /*var r2 = readDouble()
    println(r2)*/
    //11、for 1 to 10 [1,10] 
    var n = 10
    for (i <- 1 to n) {
      print(i)
    }
    println()
    //12、for 1 to until [1,10) 
    for (i <- 1 until n) {
      print(i)
    }
    println()
    //13、类似java中的foreach
    for (x <- "Helloworld")
      println(x)
    //14、for中带有判断  获取[1,10]间的偶数
    for (i <- 1 to n if i % 2 == 0) print(i)
    println()
    //15、[1,10]间隔2个输出  默认1 to 10 等价于 1 to (10,1)
    for (i <- 1 to (n, 3)) print(i)
    println()
    //16、双重for循环
    for (i <- 1 to (10, 4); j <- 1 to 5 if j % 2 == 0) {
      println(i + "--" + j)
    }
    //17、for推导式--yield---Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var t1 = for (i <- 1 to 10) yield i
    println(t1)
    //18、使用break 需要import scala.util.control.Breaks._
    //报错：Exception in thread "main" scala.util.control.BreakControl
    var x2 = 5
    /*    for(i <- "hello world"){
      if(x2==3){
        break;
      }
      print(i)
      x2-=1
    }*/
    //解决
    breakable {
      for (i <- "hello world") {
        if (x2 == 3) {
          break;
        }
        print(i)
        x2 -= 1
      }
    }
  }
}