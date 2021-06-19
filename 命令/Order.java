package ÃüÁî;

import java.util.HashMap;

public class Order {
private int id;
public HashMap<String,Integer>fruitmap;
public String getID;
public Order()
{
	fruitmap=new HashMap<String,Integer>();
}
	public int getID() {
		return 0;
		
	}
	public void setID(int id) {
		this.id=id;
		
	}
	public HashMap<String,Integer> getfruitmap(){
		return fruitmap;
	}
public void setFruitmap(String fruitkind,int quantity) {
	this.fruitmap.put(fruitkind, quantity);
}
}
