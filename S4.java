package States;
import MDEFSM.MDEFSM;

public class S4 implements State{
MDEFSM me = null;
	
	public S4(MDEFSM me) {
		this.me = me;
	}
	
	public void StartPump() {
		
		me.setState(me.getS5());
		me.o.ReadyMsg();
		me.o.SetInitialValues();

	}
	public void Activate(){}
	public void PayType(int t){}
	public void Receipt(){}
	public void NoReceipt(){}
	public void StopPump(){}
	public void Pump(){}
	public void Reject(){}
	public void SelectGas(int g){}
	public void Approved(){}
	public void Cancel(){}
	public void Start() {
		
	}
}