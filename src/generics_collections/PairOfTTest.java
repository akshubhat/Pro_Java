class PairOfT<T> {
 T object1;
 T object2;
 PairOfT(T one, T two) {
 object1 = one;
 object2 = two;
 }

 public T getFirst() {
 return object1;
 }

 public T getSecond() {
 return object2;
 }
}

class PairOfTTest {
	public static void main(String []args) {
		PairOfT<String> worldCup = new PairOfT<String>("2018", "Russia");
		System.out.println("World cup " + worldCup.getFirst() + " in " + worldCup.getSecond());
	}
}