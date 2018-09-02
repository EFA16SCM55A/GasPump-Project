/*
	* Concrete Factory for GasPump2
	*/
package Factory;
import Datastore.*;
import OutputProcesser.StoreData.*;
import OutputProcesser.PayMsg.*;
import OutputProcesser.DisplayMenu.*;
import OutputProcesser.CancelMsg.*;
import OutputProcesser.SetPrice.*;
import OutputProcesser.StopMsg.StopMsg1;
import OutputProcesser.ReadyMsg.*;
import OutputProcesser.RejectMsg.RejectMsg1;
import OutputProcesser.SetInitialValues.*;
import OutputProcesser.GasPumpedMsg.*;
import OutputProcesser.PumpGasUnit.*;
import OutputProcesser.PrintReceipt.*;
import OutputProcesser.StoreCash.*;
import OutputProcesser.ReturnCash.*;
import OutputProcesser.StopMsg.*;

public class G2Factory implements Factory{ 
DataStore ds2=new DataStore2();
StoreData P12=new StoreData2();
PayMsg P22=new PayMsg2();
DisplayMenu P42=new DisplayMenu2();
CancelMsg P52=new CancelMsg2();
SetPrice P62=new SetPrice2();
ReadyMsg P72=new ReadyMsg2();
SetInitialValues P82=new SetInitialValues2();
GasPumpedMsg P92=new GasPumpedMsg2();
PumpGasUnit P102=new PumpGasUnit2();
PrintReceipt P112=new PrintReceipt2();
StoreCash P232=new StoreCash1();
ReturnCash P242=new ReturnCash1();
StopMsg P252=new StopMsg1();
public G2Factory()
{
	
}

	public DataStore getdata() {
	return this.ds2;
	}
	
	public StoreData getStoreData() {
	return P12;
	}

	public PayMsg getPayMsg() {
	return P22;
	}
	
	public DisplayMenu getDisplayMenu() {
	return P42;
	}

	public CancelMsg getCancelMsg() {
	return P52;}

	
	public SetPrice getSetPrice() {
	return P62;
	}

	public ReadyMsg getReadyMsg() {
	return this.P72;
	}

	
	public SetInitialValues getSetInitialValues() {
	return this.P82;
	}
	
	public GasPumpedMsg getGasPumpedMsg() {
	return this.P92;}
	

	
	public PumpGasUnit getPumpGasUnit(){
	return this.P102;
	}

	public PrintReceipt getPrintReceipt(){
	return this.P112;
	}


	public StoreCash  getStoreCash(){
	return this.P232;
	}
	
	public ReturnCash getReturnCash(){
	return this.P242;
	}

	public RejectMsg1 getRejectMsg() {
		return null;
	}

	public StopMsg getStopMsg() {
		return P252;
	}

	@Override
	public DataStore gettype() {
		// TODO Auto-generated method stub
		return null;
	}

}