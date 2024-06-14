
object project2 {

  def main(args: Array[String]) : Unit = {

  calculate();



  }
  def calculate(): Unit = {
    println("enter the radius value: ");
    val radius = 5;
    val pi = 3.14;
    val area = pi * radius * radius;
    println("area is: " + area);
  }


}
