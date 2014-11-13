class IyteImmutableList {

  private var head: Node = null;

  def add(x: Int): IyteImmutableList = {
    val newList: IyteImmutableList = new IyteImmutableList();
    var newHead = new Node(x);
    newHead.setNext(head);
    newList.setHead(newHead);
    newList;
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

  def setHead(head: Node) {
    this.head = head;
  }
}

object IyteImmutableList {
  def apply() = new IyteImmutableList();
}
