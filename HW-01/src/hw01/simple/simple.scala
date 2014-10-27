package hw01.simple

object simple extends App {

  var myList = Array(10, 25, 30)

  for (x <- myList) {
    if ((x % 2) == 0) {
      println(x * 2);
    } else if ((x % 2) == 1) {
      println(x * 3);
    }
  }
}