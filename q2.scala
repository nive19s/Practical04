import scala.io.StdIn

object q2 {
  def main(args: Array[String]): Unit = {
    print("Enter an integer: ")
    val integer: Int = StdIn.readInt()
    
    integer match {
      case n if n <= 0 => println("Negative/Zero is input")
      case n if n % 2 == 0 => println("Even number is given")
      case _ => println("Odd number is given")
    }
  }
}