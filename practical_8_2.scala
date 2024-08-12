import scala.io.StdIn

object practical_8_2
{
    def main(args: Array[String]):Unit={

        println("Enter the Number that You want to check : ")

        val num = StdIn.readInt()

        val result = num match {

            case x if isMulBoth(x) => mulTF(num) 

            case x if isMulThree(x) => mulT(num)

            case x if isMulFive(x) => mulF(num) 
            
            case _ => muln(num) 
        } 
        println("You Entered " + result)      
    }
    val isMulThree = (input:Int) => input%3 == 0

    val isMulFive = (input:Int) => input%5 == 0

    val isMulBoth = (input:Int) => input%3 == 0 && input%5 == 0

    val mulT = (input:Int) => s"$input is only multiple of Three" 

    val mulF = (input:Int) => s"$input is only multiple of Five" 

    val mulTF = (input:Int) => s"$input is multiple of both Three and Five"

    val muln = (input:Int) => s"$input is not a multiple of both Three and Five" 
}