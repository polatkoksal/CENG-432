object TestApp extends App {

  var m1 = IyteMutableList();
  var m2 = m1.add(4);
  var m3 = m1.add(5);
  var m4 = m2.add(6);

  print("m1:" + m1.toString() + " m2:" + m2.toString() + " m3:" + m3.toString() + " m4:" + m4.toString() + "\n");

  var im1 = IyteImmutableList();
  var im2 = im1.add(7);
  var im3 = im2.add(8);
  var im4 = im2.add(9);

  print("im1:" + im1.toString() + " im2:" + im2.toString() + " im3:" + im3.toString() + " im4:" + im4.toString());

}