package cn.celloud.day3
/**
 * 不用在object中写main方法，而是使用App Trait（类似java的接口，但是还是有区别的）
 * 这样，就可以将以前写在main中的方法，直接写出来
 * 
 * App Trait的工作原理为：
 * 	App Trait继承自DelayedInit Trait，scalac命令进行编译时，
 * 	会把继承App Trait的object的constructor代码
 * （object的原  main方法中运行的代码直接作为object的constructor代码）
 * 	都放到DelayedInit Trait的delayedInit方法中执行。
 * 	App Traint有个main方法，它调用DelayedInit Trait的delayedInit方法。
 */
object HelloWorld extends App{
  if(args.length>0) println(args(0))
  else println("hello world")
}