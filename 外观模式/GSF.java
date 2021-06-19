package 外观模式;

public class GSF {
private Light lights[]=new Light[4];
private Fan fan;
private AC ac;
private TV tv;

public GSF() {

	lights[0]=new Light("向左");
	lights[1]=new Light("向右");
	lights[2]=new Light("向前");
	lights[3]=new Light("向后");
	fan=new Fan();
	ac=new AC();
	tv=new TV();
}
public void on() {
	lights[0].on();
	lights[1].on();
	lights[2].on();
	lights[3].on();
	fan.on();
	ac.on;
	tv.on;
}
public void off() {
	lights[0].off();
	lights[1].off();
	lights[2].off();
	lights[3].off();
	fan.off();
	ac.off;
	tv.off;
}

}
