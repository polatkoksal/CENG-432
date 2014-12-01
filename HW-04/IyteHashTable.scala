class IyteHashTable {

  val size: Int = 1000;
  val load_factor: Double = 0.7;
  var count: Int = 0;
  var rootNode: TableNode = null;

  private def init() = {
    rootNode = new TableNode(new Array[Node](size));
  }
  init();

  def set(key: String, value: String) = {
    var hash = hashCode(key);
    var check = false;
    var tempNode = rootNode;
    while (tempNode != null) {
      if (tempNode.table(hash) == null && tempNode.next == null) {
        tempNode.table(hash) = new Node(key, value);
        count += 1;
      } else {
        var temp = tempNode.table(hash);
        while (temp != null && !check) {
          if (temp.getKey().equals(key)) {
            temp.setValue(value);
            check = true;
          } else {
            temp = temp.getNext();
          }
        }
        if (!check && tempNode.next == null) {
          var t = tempNode.table(hash);
          while (t.getNext() != null) {
            t = t.getNext();
          }
          t.setNext(new Node(key, value));
        }
      }
      tempNode = tempNode.next;
    }
    if (count / size >= load_factor) {
      count = 0;
      var newNode = new TableNode(new Array[Node](size));
      var temp = rootNode;
      while (temp.next != null) {
        temp = temp.next
      }
      temp.next = newNode;
    }
  }

  def get(key: String): String = {
    var hash = hashCode(key);
    var result: String = null;
    var check = false;
    var tempNode = rootNode;
    while (tempNode != null && !check) {
      var temp = tempNode.table(hash);
      while (temp != null && !check) {
        if (temp.getKey().equals(key)) {
          result = temp.getValue();
          check = true;
        } else {
          temp = temp.getNext();
        }
      }
      tempNode = tempNode.next;
    }
    result;
  }

  private def hashCode(key: String): Int = {
    var result: Int = 0;
    for (i <- 0 to key.length() - 1) {
      var c = key.charAt(i);
      result = (result * 13 + c) % size;
    }
    result;
  }
}

object IyteHashTable {
  def apply() = new IyteHashTable();
}