/*
* ReturnCash Class for GasPump-2
*/
package OutputProcesser.ReturnCash;
import Datastore.DataStore;
public class ReturnCash1 extends ReturnCash {
@Override
/*ReturnCash for total value that remine after pumping for GasPump2*/
public void ReturnCash(DataStore ds) {
ds.gettotal2();
}
}
