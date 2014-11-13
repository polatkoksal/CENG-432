class Node {
  private var data: Int = 0;
  private var next: Node = null;

  def this(data: Int) {
    this();
    this.data = data;
  }

  def this(data: Int, next: Node) {
    this(data);
    this.next = next;
  }

  def getData(): Int = {
    this.data;
  }

  def setData(data: Int): Unit = {
    this.data = data;
  }

  def getNext(): Node = {
    this.next;
  }

  def setNext(next: Node): Unit = {
    this.next = next;
  }

}