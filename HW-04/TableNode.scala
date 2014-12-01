class TableNode {

  var table: Array[Node] = null;
  var next: TableNode = null;

  def this(table: Array[Node]) {
    this();
    this.table = table;
  }

}