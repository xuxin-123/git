package 职责链模式;

public class small extends AbstractFruitSort{
	public small(int weight) {
		super(weight);
	}
	 public void pushBox(String fruit) {
		fruitbox.add("榨果汁"+fruit);
	}
}
