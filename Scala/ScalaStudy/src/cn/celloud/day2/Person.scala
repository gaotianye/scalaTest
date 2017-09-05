package cn.celloud.day2

import scala.beans.BeanProperty

/**
 * java风格的setter和getter
 */
//TODO 好像就不能使用new Person方式
class Person(@BeanProperty var name:String,@BeanProperty var age:Integer) {
  //自动提供public类型的setter 和 getter
//  @BeanProperty var name:String=_
}