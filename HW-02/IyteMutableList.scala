class IyteMutableList {

  private var head: Node = null;

  def add(x: Int): IyteMutableList = {
    val newNode = new Node(x);
    if (head != null) {
      var tempNode = head;
      while (tempNode.getNext() != null) {
        tempNode = tempNode.getNext();
      }
      tempNode.setNext(newNode);
    } else {
      head = newNode;
    }
    this;
  }

  override def toString(): String = {
    var result: String = "";
    if (head != null) {
      var tempNode = head;
      while (tempNode.getNext() != null) {
        result = result + tempNode.getData() + ",";
        tempNode = tempNode.getNext();
      }
      result = result + tempNode.getData();
    } else {
      result = "Empty List!";
    }
    result;
  }

}

object IyteMutableList {
  def apply() = new IyteMutableList();
}