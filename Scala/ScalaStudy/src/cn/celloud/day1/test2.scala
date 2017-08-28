package cn.celloud.day1
/**
 * 函数:scala既面向对象，又面向过程。
 * scala中函数是自成体系的，可以不用依赖对象、类
 */
object test2 {
  //1、定义函数:def、函数名、 参数、 函数体、 函数返回类型
  //如果方法体中不包含递归的语句，cala就可以自己根据右侧的表达式推断出返回类型
  def fun1(age: Int, name: String) = {
    if (age > 18) {
      printf("hi %s, you are a big boy\n", name)
    } else {
      printf("hi %s, you are a little boy\n", name)
    }
  }
  //2、简单函数
  def fun2(age: Int, name: String) = println("my name is " + name + ",my age is " + age)
  //3、如果方法体中包含递归的语句，必须指出返回值类型
  //n的阶乘
  def factorial(a: Int): Int = {
    if (a <= 1) 1
    else a * factorial(a - 1)
  }
  //4、提供默认参数，这个值是可以被覆盖掉
  def sayHello(firstName: String, middleName: String, lastName: String) = firstName + middleName + lastName;
  def sayHello2(firstName: String, middleName: String = "li", lastName: String = "wu") = firstName + middleName + lastName;
  //5、变长参数 （***冒号后面要有空格***）
  def sum(nums: Int*) = {
    var res = 0
    for (r <- nums) {
      res += r
    }
    res
  }
  //6、等价(递归方式)
  def sum2(nums: Int*): Int = {
    if (nums.length == 0) 0
    else nums.head + sum2(nums.tail: _*)
  }
  //主函数
  def main(args: Array[String]): Unit = {
    fun1(12, "xiaoming")
    fun1(22, "gaotianye")
    fun2(22, "gaotianye")
    var r1 = factorial(5)
    println(r1)
    //输出 gaotianye
    var r2 = sayHello("gao", "tian", "ye");
    println(r2)
    //输出 gaoyewu
    var r3 = sayHello2("gao", "ye");
    println(r3)
    var r4 = sum(1, 2, 3, 4)
    println(r4)
    //编译会失败的，因为定义的是Int，但是传入的是Range类型
    //    var r5 = sum(1 to 5)
    //将序列中的一个个元素提取出来（相当于遍历序列，将值取出来）。
    var r6 = sum(1 to 5: _*)
    println(r6)
    var r7 = sum2(1,2,3,4,5)
    println(r7)
    /*
     * 过程：没有返回值。
     * （1）没有=
     * （2）有=号，但是明确指出返回值类型为Unit 
     */
  }
}