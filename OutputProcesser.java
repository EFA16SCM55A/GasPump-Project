/*
* OutputProcessor class to direct all operations and connect some operation with other classes; it plays important role to call actions from abstractfactory when it is needed 
*/
package OutputProcesser;
import Datastore.DataStore;
import Factory.*;
import OutputProcesser.CancelMsg.CancelMsg;
import OutputProcesser.DisplayMenu.DisplayMenu;
import OutputProcesser.GasPumpedMsg.GasPumpedMsg;
import OutputProcesser.PayMsg.PayMsg;
import OutputProcesser.PrintReceipt.PrintReceipt;
import OutputProcesser.PumpGasUnit.PumpGasUnit;
import OutputProcesser.ReadyMsg.ReadyMsg;
import OutputProcesser.RejectMsg.RejectMsg;
import OutputProcesser.ReturnCash.ReturnCash;
import OutputProcesser.SetInitialValues.SetInitialValues;
import OutputProcesser.SetPrice.SetPrice;
import OutputProcesser.StopMsg.StopMsg;
import OutputProcesser.StoreCash.StoreCash;
import OutputProcesser.StoreData.StoreData;
public class OutputProcesser {
		public    DataStore ds = null;
		public    Factory af = null;
public OutputProcesser(DataStore ds, Factory af){
			this.af = af;
			this.ds = ds;}

public void StoreData() {
StoreData P1=af.getStoreData();
P1.StoreData(ds);
}
public void PayMsg() {
PayMsg P2=af.getPayMsg();
P2.PayMsg();
}

public void StoreCash() {
StoreCash P3=af.getStoreCash();
P3.storeCash(ds);
}

public void DisplayMenu() {
DisplayMenu P4=af.getDisplayMenu();
P4.DisplayMenu();
}
public void RejectMsg () {
RejectMsg P5 =af.getRejectMsg();
P5.RejectMsg();
}

public void SetPrice(int n) {
SetPrice P6=af.getSetPrice();
P6.SetPrice(n, ds);
}
public void ReadyMsg () {
ReadyMsg P7=af.getReadyMsg();
P7.ReadyMsg();
}
public void SetInitialValues() {
SetInitialValues P8=af.getSetInitialValues();
P8.SetInitialValues(ds);
}
public void PumpGasUnit() {
PumpGasUnit P9=af.getPumpGasUnit();
P9.PumpGasUnit(ds);
}

public void GasPumpedMsg () {
GasPumpedMsg P10=af.getGasPumpedMsg();
P10.GasPumpedMsg(ds);
}
public void StopMsg(){
StopMsg P11=af.getStopMsg();
P11.StopMsg();}
/*
* Print Receipt
*/
public void PrintReceipt() {
PrintReceipt P12 =af.getPrintReceipt();
P12.PrintReceipt(ds);
}
/*
* cancel the operation 
*/

public void CancelMsg() {
CancelMsg P13 =af.getCancelMsg();
P13.CancelMsg();
//System.out.println("\n Cancel Transaction");
}
public void ReturnCash(){
ReturnCash P14 =af.getReturnCash();
P14.ReturnCash(ds);}
public void sett(int t){
	ds.setdata1(t);
}
public int gettype() {
	return ds.type;
}}

