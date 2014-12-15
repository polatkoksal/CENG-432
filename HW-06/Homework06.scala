case class User(name: String, email: String, grade: Int)

trait UserManagerTrait {
  def add(name: String, email: String, grade: Int): Option[User]
  def getUser(email: String): Option[User]
  def getUserListForGrade(grade: Int): List[User]
  def getCertainGrades(gradeSelector: (Int) => Boolean): List[String]
}

object UserManager extends UserManagerTrait {

  val users = scala.collection.mutable.HashMap[String, User]()

  def add(name: String, email: String, grade: Int): Option[User] = {
    var user: User = null
    if (!users.contains(email)) {
      user = new User(name, email, grade)
      users.put(email, user)
    }
    Option(user)
  }

  def getUser(email: String): Option[User] = {
    users.get(email)
  }

  def getUserListForGrade(grade: Int): List[User] = {
    users.values.toList.filter(s => s.grade == grade)
  }

  def getCertainGrades(gradeSelector: (Int) => Boolean): List[String] = {
    users.values.toList.filter(u => gradeSelector(u.grade)).map(u => u.name).toList
  }

}
