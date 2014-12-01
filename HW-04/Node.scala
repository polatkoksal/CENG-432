class Node {

  private var key: String = "";
  private var value: String = "";
  private var next: Node = null;

  def this(key: String, value: String) {
    this();
    this.key = key;
    this.value = value;
  }

  def getKey(): String = {
    this.key;
  }

  def setKey(key: String) = {
    this.key = key;
  }

  def getValue(): String = {
    this.value;
  }

  def setValue(value: String) = {
    this.value = value;
  }

  def getNext(): Node = {
    this.next;
  }

  def setNext(next: Node) = {
    this.next = next;
  }
}