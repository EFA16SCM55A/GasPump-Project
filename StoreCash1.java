
package OutputProcesser.StoreCash;
	/*
	* StoreCash for GasPump-2
	*/
	import Datastore.DataStore;
	public class StoreCash1 extends StoreCash {
	@Override
	/*Store cash given during cash payment i
	*/
	public void storeCash(DataStore ds) {
	ds.setcash(ds.getcash());
	}
	}
