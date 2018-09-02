/*
* GasPump-2 Implementation 
*/
package Input;
import Datastore.DataStore2;
import Datastore.DataStore;
import MDEFSM.MDEFSM;
import OutputProcesser.OutputProcesser;
import Factory.Factory;
import Factory.G2Factory;

import java.util.Scanner;
/*
* Constructor for GasPump2
*/
public class GasPump2{
private static final String DataStore2 = null;
int  a, b, c;
public Factory af=null;
public MDEFSM me = null;
public DataStore ds = null;	
    public GasPump2(MDEFSM me,DataStore ds){ 
     this.me = me;
     this.ds = ds;}

public void Activate(int a, int b, int c) {
if(a > 0 && b>0 &&c>0){

	((DataStore2)ds).tempa2=a;
	((DataStore2)ds).tempb2=b;
	((DataStore2)ds).tempc=c;
me.Activate();
}
else {
System.out.println("Gas Price must be greater than 0");
}
}

/*
* start the operation
*/
public void Start() {
me.Start();
}

/*
* cash Payment 
*/
public void PayCash(int cash) {

((DataStore2)ds).cash=cash;
me.PayType(2);
}

/*
* cancel the operation
*/
public void Cancel() {
me.Cancel();
}

/*
* Select super type of gas 
*/
public void Super() {
me.SelectGas(2);
}

/*
* Select regular type of gas 
*/
public void Regular() {
me.SelectGas(1);
}

/*
* Start pumping
*/
public void StartPump() {
System.out.println("\n******Gas Pump Start******");
me.StartPump() ;
}

/*
* pump gas in liter
*/
public void PumpLiter() {
System.out.println("\n******Pumping for Gas Started from GasPump-1******");

if (((DataStore2)ds).getcash() < (((DataStore2)ds).getL()+1)*((DataStore2)ds).getprice()) {
me.StopPump();}
else {me.Pump();}}

/*
* Stop pumping
*/
public void Stop() {
me.StopPump();
}


/*
* Take Receipt 
*/
public void Receipt() {
me.Receipt();
}
/*
* don't take Receipt 
*/
public void NoReceipt(){
me.NoReceipt();}

public void Premium() {
	me.SelectGas(3);

	
}

}