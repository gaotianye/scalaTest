package cn.celloud.day2
/**
 * val：不可变
 * var：可变
 * 
 * map：可变的（mutable）与不可变的（immutable）  
 * HashMap  SortedMap  LinkedHashMap
 * 
 * tuple
 */
object test4 {
  def main(args: Array[String]): Unit = {
    //1、不可变map（平常创建的都是不可变的map）
    val m1 = Map("gaotianye" -> 27, "yuwei" -> 25, "zhangshuang" -> 25)
    println(m1("gaotianye"))
    //2、创建可变map
    val m2 = scala.collection.mutable.Map("gaotianye" -> 30, "yuwei" -> 25, "zhangshuang" -> 23)
    m2("gaotianye") = 10
    println(m2("gaotianye"))
    //3、Map是trait，不能通过new方式来创建。只能new它的实现类 ，如HashMap
    val hm1 = new scala.collection.mutable.HashMap[String, Int]
    //下面编译错误，因为只能创建空的HashMap
    //    val hm2 = new scala.collection.mutable.HashMap("gaotianye" -> 27, "yuwei" -> 25, "zhangshuang" -> 25)\
    //对HashMap进行赋值
    hm1("test1") = 22
    hm1 += ("test2" -> 23, "test3" -> 25)
    //4、如果map中不含有key，而直接get值的话，会报错
//    val res1 = hm1("test4")
//    println(res1)
    //解决：使用
    val res2 = if (hm1.contains("test4")) {
      hm1("test4")
    } else {
      0
    }
    println(res2)
    //简单的方式
    val res3 = hm1.getOrElse("test3", 0)
    println(res3)
    //5、遍历map
    for((key,value)<-hm1){
      println("key="+key+",value="+value)
    }
    println("=====")
    for(key<-hm1.keySet){
      println("key:"+key)
    }
    println("=====")
    for(value<-hm1.values){
      println("value:"+value)
    }
    println("=====")
    //key和value反转，形成一个新的map
    var res4 = for((key,value)<-hm1) yield(value,key)
    for((key,value)<-res4){
      println("key="+key+",value="+value)
    }
    println("=====")
    //6、自动排序的map（不可变）
    val ages = scala.collection.immutable.SortedMap("leo" -> 30, "alice" -> 45, "jen" -> 55)
    for((key,value)<-ages) println("key:"+key+",value:"+value)
    println("======")
    //7、按照插入的顺序
    val ages2 = new scala.collection.mutable.LinkedHashMap[String, Int]
    ages2("leo") = 30
    ages2("alice") = 15
    ages2("jen") = 25
    for((key,value)<-ages2) println("key:"+key+",value:"+value)
    println("======")
    //8、tuple
    val tuple1 = ("gaotianye",27)
    val t1 = tuple1._1
    val t2 = tuple1._2
    println(t1+","+t2)
    //9、zip操作  必须两边同时相等，才能zip上那部分，即只有一段有字段，那么这个字段也不会zip上
    // 如：z1: "a1","a2","a3","a4"   z2:1,2,3  结果："a1:1","a2:2","a3:3" 没有a4
    val z1 = Array("leo", "jack", "mike","tom")
    val z2 = Array(30, 24, 26,123)
    val z = z1.zip(z2)
    println(z.toString())
    for((key,value)<-z) println("key="+key+",value="+value)
  }
}