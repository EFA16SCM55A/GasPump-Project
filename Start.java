package States;

import MDEFSM.MDEFSM;

public class Start implements State{
MDEFSM me = null;
	
	public Start(MDEFSM me) {
		this.me = me;
	}
	
	public void Activate() {
			me.setState(me.getS0());
			me.o.StoreData();
		}
	public void StartPump(){}
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