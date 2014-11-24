object Test extends App {

  var m1 = IyteMutableSet();
  var m2 = m1.add(4);
  var m3 = m1.add(6);
  var m4 = m2.add(1);

  println("m1:" + m1.toString() + " m2:" + m2.toString() + " m3:" + m3.toString() + " m4:" + m4.toString());

  var im1 = IyteImmutableSet();
  var im2 = im1.add(7);
  var im3 = im1.add(8);
  var im4 = im2.add(9);

  println("im1:" + im1.toString() + " im2:" + im2.toString() + " im3:" + im3.toString() + " im4:" + im4.toString());

  var muSet = IyteMutableSet();
  for (i <- 1 to 10000000) {
    muSet.add(i)
  }

  println(muSet.toString());
  println(muSet.contains(567545653));

  var ImmuSet = IyteImmutableSet();
  for (i <- 1 to 10000000) {
    ImmuSet = ImmuSet.add(i);
  }

  println(ImmuSet.toString());
  println(ImmuSet.contains(10000000));

}