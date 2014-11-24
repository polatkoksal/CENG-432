class IyteMutableSet {

  private var root: Node = null;
  private var result: String = "";

  def add(x: Int): IyteMutableSet = {
    root = add(x, root);
    this;
  }

  private def add(x: Int, node: Node): Node = {
    var n = node;
    if (n == null) {
      n = new Node(x);
    } else if (x < n.getData()) {
      n.setLeft(add(x, n.getLeft));
      if (findHeight(n.getLeft) - findHeight(n.getRight) > 1) {
        if (x < n.getLeft.getData) {
          n = rotateLeft(n);
        } else {
          n = doubleRotateLeft(n);
        }
      }
    } else if (x > n.getData) {
      n.setRight(add(x, n.getRight));
      if (findHeight(n.getRight) - findHeight(n.getLeft) > 1) {
        if (x > n.getRight.getData) {
          n = rotateRight(n);
        } else {
          n = doubleRotateRight(n);
        }
      }
    } else {
      println(n.getData() + " already exist in the set!")
    }
    n.setHeight(math.max(findHeight(n.getLeft), findHeight(n.getRight)) + 1);
    n;
  }

  def contains(x: Int): Boolean = {
    contains(x, this.root);
  }

  private def contains(x: Int, node: Node): Boolean = {
    var n = node;
    var result = false;
    if (n != null && !result) {
      var temp = n.getData;
      if (x < temp) {
        n = n.getLeft;
      } else if (x > temp) {
        n = n.getRight;
      } else {
        result = true;
      }
      if (!result) {
        result = contains(x, n);
      }
    }
    result;
  }

  override def toString(): String = {
    result = "";
    makeString(root);
    if (result.size > 0) {
      result = result.substring(0, result.size - 1)
    } else {
      result = "Empty Set!";
    }
    result;
  }

  private def makeString(node: Node): String = {
    if (node != null) {
      makeString(node.getLeft);
      result = result + node.getData() + ",";
      makeString(node.getRight);
    }
    result;
  }

  private def findHeight(n: Node): Int = {
    if (n == null) {
      -1
    } else {
      n.getHeight();
    }
  }

  private def rotateLeft(node: Node): Node = {
    var temp = node.getLeft;
    node.setLeft(temp.getRight);
    temp.setRight(node);
    node.setHeight(math.max(findHeight(node.getLeft), findHeight(temp.getRight)) + 1);
    temp.setHeight(math.max(findHeight(temp.getLeft), node.getHeight) + 1);
    temp;
  }

  private def rotateRight(node: Node): Node = {
    var temp = node.getRight;
    node.setRight(temp.getLeft);
    temp.setLeft(node);
    node.setHeight(math.max(findHeight(node.getLeft), findHeight(temp.getRight)) + 1);
    temp.setHeight(math.max(findHeight(temp.getRight), node.getHeight) + 1);
    temp;
  }

  private def doubleRotateLeft(node: Node): Node = {
    node.setLeft(rotateRight(node.getLeft));
    rotateLeft(node);
  }

  private def doubleRotateRight(node: Node): Node = {
    node.setRight(rotateRight(node.getRight));
    rotateRight(node);
  }

}

object IyteMutableSet {
  def apply() = new IyteMutableSet();
}