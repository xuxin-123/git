package Ç³¿½±´;

public class MyFruit implements Cloneable {
protected String kind;
public Object clone() {
	Object obj =null;
	try {
		obj=super.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return obj;
}
}
