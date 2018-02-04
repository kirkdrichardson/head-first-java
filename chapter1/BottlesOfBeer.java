public class BottlesOfBeer {
  public static void main(String[] args) {
    int cnt = 99;
    String bottle = "bottles";
    while (cnt > 0) {
      System.out.println(String.format("%d %s of beer on the wall", cnt, bottle));
      System.out.println(String.format("%d %s of beer!", cnt, bottle));
      cnt -= 1;
      bottle = (cnt < 2) ? "bottle" : "bottles";
      if (cnt > 0) {
        System.out.println(String.format("Take one down, pass it around, %d %s of beer on the wall", cnt, bottle));
      }
      System.out.println();
    }
    System.out.println("Take one down, pass it around, no more bottles of beer on the wall!");
  }
}
