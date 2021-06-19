package 装饰模式;

public class Cream extends Decorating{
	public void putCream() {
		System.out.println("加水果");
	}
	public Cream(IBCake bcake) {
		super(bcake);
	}
}
