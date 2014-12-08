trait RandomStuffTrait {
  def transform(list: List[Int], op: (Int) => Int): List[Int]
  def allValid(list: List[Int], op: (Int) => Boolean): Boolean
  def executeWithRetry(retryCount: Int, op: => Int): Option[Int]
}

object RandomStuff extends RandomStuffTrait {

  def transform(list: List[Int], op: (Int) => Int): List[Int] = {
    val newList = for (i <- list) yield {
      op(i)
    }
    newList
  }

  def allValid(list: List[Int], op: (Int) => Boolean): Boolean = {
    var result: Boolean = true
    for { i <- list if (!op(i)) } {
      result = false
    }
    result
  }

  def executeWithRetry(retryCount: Int, op: => Int): Option[Int] = {
    var result: Option[Int] = None
    var flag = true
    for (i <- 1 to retryCount if (flag)) {
      try {
        result = Some(op)
        flag = false
      } catch {
        case e: Exception => {
        }
      }
    }
    result
  }

}
