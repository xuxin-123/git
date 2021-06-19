package 职责链模式;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFruitSort {
private int weight;
protected List<String> fruitbox;
private AbstractFruitSort nextFruitSort;
public void getFruitBox()
{
	System.out.println("重量:"+weight);
	System.out.println("个数："+fruitbox.size());
	for(String t:fruitbox) {
		System.out.println(t+",");
	}
	System.out.println(" ");
}
public AbstractFruitSort (int weight) {
	this.weight=weight;
	fruitbox=new ArrayList<String>();
}
public void setNextSort(AbstractFruitSort nextFruitSort) {
	this.nextFruitSort=nextFruitSort;
}
public void sendFruit(int weight,String fruit) {
	if(this.weight==weight)
		pushBox(fruit);
	else if(nextFruitSort!=null)
		nextFruitSort.sendFruit(weight, fruit);
}
private void pushBox(String fruit) {
	// TODO Auto-generated method stub
	
}
}
