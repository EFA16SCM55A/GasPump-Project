
	/*
	* StoreData for GasPump-1 in DataStorage
	*/
package OutputProcesser.StoreData;
	import Datastore.DataStore;
	public class StoreData1 extends StoreData {
	/*Store data for GasPump1*/
	public void StoreData(DataStore ds) {
	float temp1=ds.gettempa1();
	float temp2=ds.gettempb1();
	ds.setPprice1(temp1);
	ds.setSprice1(temp2);
	}
	}
