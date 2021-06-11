package 简单工厂模式;

public class ClientClass {
public static void main(String[] args) {
	Factory factory =new Factory();
	Fruit fruit=factory.CreateFruit("A");
	fruit.eat();
}
public String factory(String fruitname) {
	if(fruitname.equals("Apple")) {
	return "Apple";
	}
	if(fruitname.equals("Banana")) {
		return "Banana";
		}
	return null;
}
}
