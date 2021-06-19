package в╟йндёй╫;

public class Decorating implements IBCake{
private IBCake bcake;
public Decorating(IBCake bcake) {
	this.bcake=bcake;
}
public void Show() {
	bcake.Show();
}
}
