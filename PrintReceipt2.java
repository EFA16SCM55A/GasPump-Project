/*
* Receipt Class for GasPump-2
*/
package OutputProcesser.PrintReceipt;
import Datastore.DataStore;
public class PrintReceipt2 extends PrintReceipt {
@Override
/*Print receipt for total value for GasPump2*/
public void PrintReceipt(DataStore ds) {
System.out.println("\n Receipt : \n Total: "+ds.gettotal2());
System.out.println("                   \n Litter: "+ds.getL());
}
}
