object Test extends App {

  println(RandomStuff.transform(List(1, 2, 3, 9), (x: Int) => x * 2))
  println(RandomStuff.allValid(List(1, 2, 3, 6), (x: Int) => x < 5))
  println(RandomStuff.executeWithRetry(3, 5 / 0))

}