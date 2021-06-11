package 原型管理器;

public class Client {
	public static void main(String[] args) {
		MyFruit fru1=new Apple();
		MyFruit fru2=new Banana();
		MFruitStore.Add(1,fru1);
		MFruitStore.Add(2,fru2);
		MFruitStore.Add(3,new Apple());
		MFruitStore.Add(4,new Banana());
		MyFruit fruit=MFruitStore.Get(1);
		fruit.dispaly();
	}
}
