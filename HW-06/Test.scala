object Test extends App {

  println(UserManager.add("polat", "polatkoksal50@gmail.com", 45))
  println(UserManager.add("veli", "veli50@gmail.com", 75))

  println(UserManager.getUser("polatkoksal50@gmail.com"))

  println(UserManager.getUserListForGrade(45))

  println(UserManager.getCertainGrades(grade => grade > 50))

}