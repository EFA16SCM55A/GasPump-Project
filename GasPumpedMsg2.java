/*
* GasPumpedMessage for GasPump-2 to show L &total GasPumped in Unites
*/
package OutputProcesser.GasPumpedMsg;
import Datastore.DataStore;
public class GasPumpedMsg2 extends GasPumpedMsg{
@Override
public 
void GasPumpedMsg(DataStore ds) {
System.out.println("\n"+ds.getL()+" Liter Gas Pumped " );
}
}
