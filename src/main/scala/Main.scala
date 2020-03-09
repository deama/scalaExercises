object Main extends App
{
  def task1() : Unit =
  {
    def test( string1:String, string2:String, char1:Character, char2:Character ) : String =
    {
      val word1 = replace( string1, char1, char2 )
      val word2 = replace( string2, char1, char2 )

      return word1 + word2
    }

    def replace( string:String, char1:Character, char2:Character ) : String =
    {
      var result : String = ""

      for( char <- string )
      {
        if( char.equals(char1) )
        {
          result = result + char2
        }
        else
        {
          result = result + char
        }
      }

      return result
    }

    println( test("ha", "llo", 'a', 'e') )
  }



  def task2() : Unit =
  {
    def test(string1:String, string2:String, maxNum:Int) : Unit =
    {
      for( i <- 1 to maxNum by 1 )
      {
        if( i % 5 == 0 && i % 3 == 0 )
        {
          println(string1+string2)
        }
        else if( i % 5 == 0 )
        {
          println(string2)
        }
        else if( i % 3 == 0 )
        {
          println(string1)
        }
        else
        {
          println(i)
        }
      }
    }

    test( "fizz", "buzz", 15 )
  }

  def task3() : Unit =
  {
    def test(string1:String, string2:String, maxNum:Int, count:Int) : Unit =
    {
      if( count == maxNum ) return

      val i : Int = count + 1

      if( i % 5 == 0 && i % 3 == 0 )
      {
        println(string1+string2)
      }
      else if( i % 5 == 0 )
      {
        println(string2)
      }
      else if( i % 3 == 0 )
      {
        println(string1)
      }
      else
      {
        println(i)
      }

      test(string1, string2, maxNum, i)
    }

    test( "fizz", "buzz", 15, 0 )
  }

  var blackJack = new BlackJack()
  println( blackJack.play(18, 20) )
}

class BlackJack()
{
  def play( num1:Int, num2:Int ) : Int =
  {
    val div1 :Int = num1 % 21
    val div2 :Int = num2 % 21

    if(  )
    {
      return
    }
    else if( div1 >= div2 )
    {
      return num1
    }
    else
    {
      return num2
    }
  }
}