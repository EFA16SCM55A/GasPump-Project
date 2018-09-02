package States;
import MDEFSM.MDEFSM;
import Datastore.*;

public class S3 implements State{
MDEFSM me = null;

	public S3(MDEFSM me) {
		this.me = me;
	}
	
	public void SelectGas(int g) {
	
		me.setState(me.getS4());
		me.o.SetPrice(g);

	}

	public void Cancel() {
		int t=me.o.gettype();
		if(t==1){
		me.setState(me.getS0());
		me.o.CancelMsg();}
		else if(t==2){me.setState(me.getS0());
		me.o.CancelMsg();
		me.o.ReturnCash();}
	}
	public void Activate(){}
	public void PayType(int t){}
	public void Receipt(){}
	public void NoReceipt(){}	
	public void StopPump(){}
	public void StartPump(){}
	public void Start(){}
	public void Reject(){}
	public void Approved(){}

	@Override
	public void Pump() {
		// TODO Auto-generated method stub
		
	}
}