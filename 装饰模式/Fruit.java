
package 装饰模式;

public class Fruit extends Decorating {
public void putFruit() {
	System.out.println("加水果");
}
public Fruit(IBCake bcake) {
	super(bcake);
}
}
