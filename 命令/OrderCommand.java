package ����;

public class OrderCommand implements Command {
private Operator receiver;
private Order order;
	public OrderCommand(Operator receiver,Order order) {
		this.receiver=receiver;
		this.order=order;
	}
	@Override
	public void exe() {
		// TODO Auto-generated method stub
System.out.println(order.getID+"�Ź˿͵ĳ�Ʒ");
receiver.MarkFruit(order);
	}

}
