package √¸¡Ó;

import java.util.ArrayList;

public class waitor {
private ArrayList<Command>commands=null;
public waitor(){
	commands=new ArrayList<Command>();
}
public void SetCommand(Command cmd) {
	commands.add(cmd);
}
public void OrderUp() {
	System.out.println("”–∂©µ•");
	for(Command cmd:commands) {
		if(cmd!=null)
			cmd.exe();
	}
}
}
