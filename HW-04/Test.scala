object Test extends App {

  var table = new IyteHashTable();
  for (i <- 1 to 100000) {
    table.set(i.toString(), i.toString());
    println(i);
  }
  for (i <- 1 to 100000) {
    println(table.get(i.toString()));
  }

  var count = 0;
  for (i <- 0 to table.rootNode.table.length - 1) {
    if (table.rootNode.table(i) != null) {
      count += 1;
    }
  }
  println(count);

  var table2 = new IyteHashTable();
  table2.set("polat", "koksal");
  table2.set("polat", "yanlıs");
  println(table2.get("polat"));

}