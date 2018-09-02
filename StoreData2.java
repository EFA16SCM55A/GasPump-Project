package OutputProcesser.StoreData;
import Datastore.DataStore;

	/*
	* StoreData for GasPump-2 in DataStorage
	*/
	
	public class StoreData2 extends StoreData {
	/*Store data for GasPump2*/
	public void StoreData(DataStore ds) {
	int temp1=ds.gettempa2();
	int temp2=ds.gettempb2();
	int temp3=ds.gettempc();
	ds.setRprice2(temp1);
	ds.setSprice2(temp2);
	ds.setPprice2(temp3);
	}
	}

