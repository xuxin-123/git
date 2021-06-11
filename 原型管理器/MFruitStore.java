package 原型管理器;

import java.util.Hashtable;

public class MFruitStore {
	private static Hashtable fruittable=new Hashtable<Integer,MyFruit>();
	public static void Add(Integer key,MyFruit fruit) {
		fruittable.put(key, fruit);	
		}
	public static MyFruit Get(Integer key) {
		MyFruit fruit =(MyFruit) fruittable.get(key);
		return (MyFruit) fruit.clone();
	}
}
