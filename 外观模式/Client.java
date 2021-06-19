package 外观模式;

public class Client {
public static void main (String args[]) {
	GSF gsf=new GSF();
	gsf.on();
	System.out.println("---------");
	gsf.off();
}
}
