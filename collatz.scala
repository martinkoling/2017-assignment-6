import java.awt.List
import java.util
// Part 1 about the 3n+1 conjecture
//=================================

object CW6a {

//(1) Complete the collatz function below. It should
//    recursively calculate the number of steps needed 
//    until the collatz series reaches the number 1.
//    If needed, you can use an auxiliary function that
//    performs the recursion. The function should expect
//    arguments in the range of 1 to 1 Million.
  /*

def collatz(n: Long, count: Long = 0) : Long = n match  {




  case n if (n == 1) => count + 1


  case n if(n % 2 == 0) => collatz(n / 2, count + 1)


  case n if(n % 2 == 1) => collatz((n * 3) + 1, count + 1)




  }

*/

  def collatz(n: Long): Long = {
    val count=1

    if (n==1) { count }

    else if (n%2==1) {
      val count2 =collatz(n*3+1)+1
      count2
    }
    else {
      val count3=collatz(n/2) +1
      count3
    }
  }






//(2)  Complete the collatz-bound function below. It should
//     calculate how many steps are needed for each number 
//     from 1 up to a bound and then calculate the maximum number of
//     steps and the corresponding number that needs that many 
//     steps. Again, you should expect bounds in the range of 1
//     up to 1 Million. The first component of the pair is
//     the maximum number of steps and the second is the 
//     corresponding number.



  def collatz_max(bnd: Long) : (Long, Long) = {

    val hej = bnd.toInt

    val listOfCollatz = (1 to hej).toList.map(i => collatz(i))

    val maxValue = listOfCollatz.max

    (maxValue, listOfCollatz.indexOf(maxValue) + 1)
  }

  }






