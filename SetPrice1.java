
/*
	* SetPrice Class For GasPump-1
	*/
package OutputProcesser.SetPrice;
	import Datastore.DataStore;
	public  class SetPrice1 extends SetPrice{
	/*Set price for gas in Gaspump1*/
	@Override
	public
	void SetPrice(int n, DataStore ds) {
	if(n==1) {
	ds.setprice(ds.getSprice());}
	if(n==2) {
	ds.setprice(ds.getRprice());}
	}
	}

