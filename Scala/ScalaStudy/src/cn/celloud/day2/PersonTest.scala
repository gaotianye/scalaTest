package cn.celloud.day2

object PersonTest {
  def main(args: Array[String]): Unit = {
    var p = new Person("yuwei",22)
    println(p.getName())
    p.name="gaotianye"
    println(p.getName())
    println(p.getAge())
  }
}