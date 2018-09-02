package States;
import Datastore.*;

import MDEFSM.MDEFSM;
public class S1 implements State{
MDEFSM me = null;
DataStore ds=null;	
public S1(MDEFSM me) {
		this.me = me;
	}
	
public void PayType(int t){
	me.o.sett(t);
		if(1 == t ){
    		me.setState(me.getS2());}
		else{
    		me.o.StoreCash();
    		me.o.DisplayMenu();
    		me.setState(me.getS3());
    		}
	}
public void Activate(){}
public void Receipt(){}
public void NoReceipt(){}	
public void StartPump(){}
public void Pump(){}
public void StopPump(){}

public void Start(){}
public void Reject(){}
public void SelectGas(int g){}
public void Approved(){}
public void Cancel(){}
}
