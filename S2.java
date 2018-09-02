package States;
import MDEFSM.MDEFSM;

public class S2 implements State{
MDEFSM me = null;
	
	public S2(MDEFSM me) {
		this.me = me;
	}
	
	public void Reject() {
		
		me.setState(me.getS0());
		me.o.RejectMsg();
	}
	public void Approved() {
		
		me.setState(me.getS3());
		me.o.DisplayMenu();
	}
	public void Activate(){}
	public void PayType(int t){}
	public void Receipt(){}
	public void NoReceipt(){}	
	public void StopPump(){}
	public void StartPump(){}
	public void Start(){}
	public void SelectGas(int g){}
	public void Cancel(){}

	public void Pump() {
		
	}
}
