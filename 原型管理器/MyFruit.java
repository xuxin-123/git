package 原型管理器;

public class MyFruit implements Cloneable {
protected String kind;
public void dispaly() {
	System.out.println(kind);
}
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
