import scala.io.StdIn
object practical_8_1{
    def main(args: Array[String]):Unit = {
        /*In the Caesar cipher, the number of shifts (also called the "key") can be determined either by
         the user or the programmer, depending on how the system is designed.*/
       println("Do you want to encrypt Enter 1 Decrypt Enter 0 : ")
       val input :Int = StdIn.readInt()
       if(input == 1){
        println("Do you want to add number of shifts then Enter 1 or Is it ok to determine number of shifts by computer Enter 0 : ")
        val input1 :Int = StdIn.readInt()
        if(input1 == 1){
            println("Warning : You should remember number of shifts Otherwise you will take a wrong text when Decrypting !!!")
            println("Enter Your Text You want to Encrypt : ")
            val enText = StdIn.readLine()
            println("Enter the number of shifts : ")
            val shifts = StdIn.readInt()
            println("Your Encrypted text is : " + cryptoGraphy(encrypt,enText,shifts))
        }else if(input1 == 0){
            println("Enter Your Text You want to Encrypt : ")
            val enText1 = StdIn.readLine()
            println("Your Encrypted text is : " + cryptoGraphy(encrypt,enText1))
        }else{
            println("Entered text is invalid!")
        }
       }else if(input == 0){
        println("Do you give number of shifts when you Encrypting then Enter 1 that is not the case Enter 0 : ")
        val input2 :Int = StdIn.readInt()
        if(input2 == 1){
            println("Enter the Text You recieve when you Encrypt your text : ")
            val enText2 = StdIn.readLine()
            println("Enter the number of shifts : ")
            val shifts1 = StdIn.readInt()
            println("Your Decrypted text is : " + cryptoGraphy(decrypt,enText2,shifts1))
        }else if(input2 == 0){
            println("Enter the Text You recieve when you Encrypt your text : ")
            val enText3 = StdIn.readLine()
            println("Your Decrypted text is : " + cryptoGraphy(decrypt,enText3))
        }else{
            println("Entered text is invalid!")
        }
       }else{
        println("Your entered value is Invalid!")
       }
    }    
}
def cryptoGraphy(f:(Char,Int)=>Char,x:String,i:Int=10) ={
    x.map(a => if(a.isLetter){
        f(a,i)
    }else{
        a
    })
}

val encrypt = (x:Char,z:Int) => {
    val y = x.toInt
    if(65 <= y && y<=90){
        if((y+z)>90){
            (((y+z)-65)%26 + 65).toChar
        }else{
            (y+z).toChar
        }
    }else if(97 <= y && y<=122){
        if((y+z)>122){
            (((y+z)-97)%26 + 97).toChar
        }else{
            (y+z).toChar
        }
    }else{
        x
    }
}
val decrypt = (x:Char,z:Int) => {
    val y = x.toInt
    if(65 <= y && y<=90){
        if((y-z)<65){
            (y-z+26).toChar
        }else{
            (y-z).toChar
        }
    }else if(97 <= y && y<=122){
        if((y-z)<97){
            (y-z+26).toChar
        }else{
            (y-z).toChar
        }
    }else{
        x
    }
}


