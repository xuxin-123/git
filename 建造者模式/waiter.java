package ������ģʽ;

public class waiter {
private MBuilder mb;
public void setMbuilder(MBuilder mb) {
	this.mb=mb;
}
public Meal construct() {
	mb.buildFood();
	mb.buildDrink();
	return mb.getMeal();
}
}
