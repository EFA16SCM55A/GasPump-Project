
/*
* GasPump-1 Implementation Class
*/
package Input;
import Datastore.DataStore1;
import Datastore.DataStore;
import MDEFSM.MDEFSM;
import OutputProcesser.OutputProcesser;
import Factory.Factory;
import MDEFSM.MDEFSM;

import java.util.Scanner;
public class GasPump1{
float a, b;

public MDEFSM me = null;
public DataStore ds = null;	
public Factory af=null;
public GasPump1(MDEFSM me,DataStore ds) 
{
    this.me = me;
    this.ds = ds;
}

/*
* Activate GasPump1 with Gas Price is a
*/
public void Activate(float a, float b) {
if(a > 0 && b>0){
((DataStore1)ds).tempa1=a;
((DataStore1)ds).tempb1=b;
me.Activate();
System.out.println("\n ******GasPump 1 is Activated****** ");
}
else {
System.out.println("\n Gas Price must be greater than 0");
}
}

/*
* Start GasPump1
*/
public void start() {
me.Start();
}
/*
* Payment by Credit
*/
public void PayCredit() {
me.PayType(1);
}
/*5
* Reject Credit card
*/
public void Reject() {
me.Reject();
}
/*
* Cancel Transaction
*/
public void Cancel() {
me.Cancel();
}
/*
* Approve Credit card
*/
public void Approved() {
me.Approved();
}
/*
* Select Gas from type Super
*/
public void Super() {
me.SelectGas(2);
}
/*
* Select Gas from type Regular
*/
public void Regular() {
me.SelectGas(1);
}
/*
* Start Pumping for gas
*/
public void StartPump() {
System.out.println("\n******GasPumpStart******");
me.StartPump();
}
/*
* Pumping of gallon
*/
public void PumpGallon() {
System.out.println("\n******Pumping GasGallon******");
me.Pump();
}
/*
* Stop pumping of gas
*/
public void StopPump() {
me.StopPump();
me.Receipt();
}
}

