/*
* Receipt Class for GasPump-1
*/
package OutputProcesser.PrintReceipt;
import Datastore.DataStore;
public class PrintReceipt1 extends PrintReceipt {
@Override
/*Print receipt for total value for GasPump1*/
public void PrintReceipt(DataStore ds) {
System.out.println("\n Receipt : \n Total: "+ds.gettotal());
}
}
