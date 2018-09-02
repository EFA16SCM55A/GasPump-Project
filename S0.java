package States;

import MDEFSM.MDEFSM;

public class S0  implements State{
MDEFSM me = null;
	
	public S0(MDEFSM me) {
		this.me = me;
	}
	
	public void Start() {
		me.o.PayMsg();
			me.setState(me.getS1());
		}
	public void Activate(){}
	public void PayType(int t){}
	public void Receipt(){}
	public void NoReceipt(){}	
	public void StartPump(){}
	public void Reject(){}
	public void SelectGas(int g){}
	public void Approved(){}
	public void Cancel(){}
	public void Pump(){}
	public void StopPump(){}
}