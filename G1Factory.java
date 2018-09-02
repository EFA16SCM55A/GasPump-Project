/*
* Concrete factory class for GasPump-1
*/
package Factory;
import Datastore.DataStore;
import Datastore.DataStore1;
import OutputProcesser.CancelMsg.CancelMsg;
import OutputProcesser.CancelMsg.CancelMsg1;
import OutputProcesser.DisplayMenu.DisplayMenu;
import OutputProcesser.DisplayMenu.DisplayMenu1;
import OutputProcesser.GasPumpedMsg.GasPumpedMsg;
import OutputProcesser.GasPumpedMsg.GasPumpedMsg1;
import OutputProcesser.PayMsg.PayMsg;
import OutputProcesser.PayMsg.PayMsg1;
import OutputProcesser.PrintReceipt.PrintReceipt;
import OutputProcesser.PrintReceipt.PrintReceipt1;
import OutputProcesser.PumpGasUnit.PumpGasUnit;
import OutputProcesser.PumpGasUnit.PumpGasUnit1;
import OutputProcesser.ReadyMsg.ReadyMsg;
import OutputProcesser.ReadyMsg.ReadyMsg1;
import OutputProcesser.RejectMsg.RejectMsg;
import OutputProcesser.RejectMsg.RejectMsg1;
import OutputProcesser.ReturnCash.ReturnCash;
import OutputProcesser.ReturnCash.ReturnCash1;
import OutputProcesser.SetInitialValues.SetInitialValues;
import OutputProcesser.SetInitialValues.SetInitialValues1;
import OutputProcesser.SetPrice.SetPrice1;
import OutputProcesser.StopMsg.StopMsg;
import OutputProcesser.StopMsg.StopMsg1;
import OutputProcesser.StoreCash.StoreCash;
import OutputProcesser.StoreCash.StoreCash1;
import OutputProcesser.StoreData.StoreData;
import OutputProcesser.StoreData.StoreData1;

public class G1Factory implements Factory {
/*

*/

DataStore ds = new DataStore1();
StoreData P11= new StoreData1();
PayMsg P21=new PayMsg1();
DisplayMenu P31=new DisplayMenu1();
CancelMsg P51=new CancelMsg1();
SetPrice1 P61=new SetPrice1();
ReadyMsg P71=new ReadyMsg1();
SetInitialValues1 P81=new SetInitialValues1() ;
GasPumpedMsg P91=new GasPumpedMsg1();
PumpGasUnit P101=new PumpGasUnit1();
PrintReceipt P111=new PrintReceipt1();
StopMsg P121=new StopMsg1();
RejectMsg P41=new RejectMsg1();
ReturnCash P242=new ReturnCash1();
public void G1Factory()
{
	
}
public DataStore getdata() {
return this.ds;
}

public StoreData getStoreData() {
return this.P11;
}

public PayMsg getPayMsg() {
return this.P21;
}

public RejectMsg getRejectMsg() {

return this.P41;
}
public DisplayMenu getDisplayMenu() {

return this.P31;
}

public CancelMsg getCancelMsg() {

return this.P51;}


public SetPrice1 getSetPrice() {
return this.P61;
}

public ReadyMsg getReadyMsg() {

return this.P71;
}

public SetInitialValues getSetInitialValues() {
return this.P81;
}

public GasPumpedMsg getGasPumpedMsg() {
return this.P91;}

public PumpGasUnit getPumpGasUnit() {
return this.P101;
}

public StopMsg getStopMsg() {
return this.P121;
}
public PrintReceipt getPrintReceipt() {
return this.P111;}
public StoreCash getStoreCash() {
return null;
}
public ReturnCash getReturnCash(){
	return this.P242;
	}
@Override
public DataStore gettype() {
	// TODO Auto-generated method stub
	return null;
}



}

