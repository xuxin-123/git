package 职责链模式;

public class Big extends AbstractFruitSort {
public Big(int weight) {
	super(weight);
}
 public void pushBox(String fruit) {
	fruitbox.add("超市："+fruit);
}
}
