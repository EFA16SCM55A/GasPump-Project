 
	/*
	* SetPrice Class For GasPump-2
	*/
package OutputProcesser.SetPrice;
	import Datastore.DataStore;
	public class SetPrice2 extends SetPrice{
	@Override
	/*Set price for gas in Gaspump2*/
	public 
	void SetPrice(int n,DataStore ds) {
	if(n==1) {
	ds.setprice(ds.getSprice());}
	if(n==2) {
	ds.setprice(ds.getPprice());}
	if(n==3) {
	ds.setprice(ds.getRprice());}
	}
	}


