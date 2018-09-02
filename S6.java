package States;

import MDEFSM.MDEFSM;

public class S6 implements State{
MDEFSM me = null;
	
	public S6(MDEFSM me) {
		this.me = me;
	}
	
	public void Receipt() {
			me.setState(me.getS0());
			me.o.ReturnCash();
			me.o.PrintReceipt();
		}
	public void NoReceipt() {
		me.setState(me.getS0());
		me.o.ReturnCash();
	}
	public void Activate(){}
	public void PayType(int t){}
	public void StopPump(){}
	public void StartPump(){}
	public void Start(){}
	public void Reject(){}
	public void SelectGas(int g){}
	public void Approved(){}
	public void Cancel(){}
	public void Pump(){}


}