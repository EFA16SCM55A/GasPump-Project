package States;
import MDEFSM.MDEFSM;

public class S5 implements State{
MDEFSM me = null;
	
	public S5(MDEFSM me) {
		this.me = me;
	}
	
	public void Pump() {
			
			me.setState(me.getS5());
			me.o.PumpGasUnit();
			me.o.GasPumpedMsg();
		}
	public void StopPump() {
		
		me.setState(me.getS6());
		me.o.StopMsg();
	}
	public void Activate(){}
	public void PayType(int t){}
	public void Receipt(){}
	public void NoReceipt(){}	
	public void StartPump(){}
	public void Start(){}
	public void Reject(){}
	public void SelectGas(int g){}
	public void Approved(){}
	public void Cancel(){}
	
	
}