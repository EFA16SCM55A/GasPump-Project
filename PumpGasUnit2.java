/*
* PumpGasUnit class to calculate pumped gas amount for GasPump-2
*/
package OutputProcesser.PumpGasUnit;
import Datastore.DataStore;
public class PumpGasUnit2 extends PumpGasUnit {
@Override
/*Calculate total and G for GasPump2 in */
public void PumpGasUnit(DataStore ds) {
ds.setL(ds.getL()+1);
ds.settotal2(ds.getprice2()*ds.getL());
}
}
