// This program shows the usage of the diamond syntax when using generics
class PairD<T1, T2> {
 T1 object1;
 T2 object2;
 PairD(T1 one, T2 two) {
 object1 = one;
 object2 = two;
 }
 public T1 getFirst() {
 return object1;
 }

 public T2 getSecond() {
 return object2;
 }
}
class TestPair {
 public static void main(String []args) {
 PairD<Integer, String> worldCup = new PairD<>(2018, "Russia");
 System.out.println("World cup " + worldCup.getFirst() +
 " in " + worldCup.getSecond());
 }
}