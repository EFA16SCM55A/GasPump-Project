
	/*
	* AbstractFactory class 
	*/
	package Factory;
    import Datastore.DataStore;
    import OutputProcesser.DisplayMenu.*;
	import OutputProcesser.StoreData.*;
	import OutputProcesser.PayMsg.*;
	import OutputProcesser.RejectMsg.*;
	import OutputProcesser.SetPrice.*;
	import OutputProcesser.ReadyMsg.*;
	import OutputProcesser.SetInitialValues.*;
    import OutputProcesser.GasPumpedMsg.*;
	import OutputProcesser.PumpGasUnit.*;
	import OutputProcesser.PrintReceipt.*;
	import OutputProcesser.StoreCash.*;
     import OutputProcesser.StopMsg.*;
	import OutputProcesser.CancelMsg.*;
	import OutputProcesser.ReturnCash.*;
	
	public interface Factory {
	public   DataStore getdata();
	public   StoreData getStoreData();
	public   DisplayMenu getDisplayMenu() ;
	public   PayMsg getPayMsg();
	public   RejectMsg getRejectMsg();
	public   SetPrice getSetPrice() ;
	public   ReadyMsg getReadyMsg();
	public   SetInitialValues getSetInitialValues();
	public   GasPumpedMsg getGasPumpedMsg();
	public   PumpGasUnit getPumpGasUnit();
	public   PrintReceipt getPrintReceipt();
	public   StoreCash getStoreCash();
	public   StopMsg getStopMsg();
	public   CancelMsg getCancelMsg();
	public   ReturnCash getReturnCash();
	public DataStore gettype();
	}

