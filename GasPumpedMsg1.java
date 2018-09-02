/*
* GasPumpedMessage for GasPump-1 to show total GasPumped in Unites
*/
package OutputProcesser.GasPumpedMsg;
import Datastore.DataStore;
public class GasPumpedMsg1 extends GasPumpedMsg {
@Override
public 
void GasPumpedMsg(DataStore ds) {
System.out.println("\n"+ds.getG()+" Gallon Gas Pumped " );
}
}
