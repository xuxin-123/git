package 职责链模式;

public class mid extends AbstractFruitSort{
	public mid(int weight) {
		super(weight);
	}
	 public void pushBox(String fruit) {
		fruitbox.add("水果罐头："+fruit);
	}
}
