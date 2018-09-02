/*
* PumpGasUnit class to calculate pumped gas amount for GasPump-1
*/
package OutputProcesser.PumpGasUnit;
import Datastore.DataStore;
public class PumpGasUnit1 extends PumpGasUnit{
@Override
/* Calculate G and total for GasPump-1 in integer*/
public void PumpGasUnit(DataStore ds) {
ds.setG(ds.getG()+1);
ds.settotal(ds.getprice()*ds.getG());
}
}
