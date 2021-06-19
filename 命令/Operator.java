package ÃüÁî;

public class Operator {

	public void MarkFruit(Order order) {
		// TODO Auto-generated method stub
		String str="";
		for(String key:order.getfruitmap().keySet()) {
			str+=order.getfruitmap().get(key);
		}
		System.out.print("»ìºÏÖ­");
	}

}
