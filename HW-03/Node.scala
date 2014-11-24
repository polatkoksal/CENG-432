class Node {

  private var data: Int = 0;
  private var height: Int = 0;
  private var left: Node = null;
  private var right: Node = null;

  def this(data: Int) {
    this();
    this.data = data;
  }

  def getData(): Int = {
    this.data;
  }

  def getHeight(): Int = {
    this.height;
  }

  def getLeft: Node = {
    this.left;
  }

  def getRight(): Node = {
    this.right;
  }

  def setData(data: Int) = {
    this.data = data;
  }

  def setHeight(height: Int) = {
    this.height = height;
  }

  def setLeft(left: Node) = {
    this.left = left;
  }

  def setRight(right: Node) = {
    this.right = right;
  }

}