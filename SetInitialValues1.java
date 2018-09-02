/*
* SetInitialValue class for GasPump-1 
*/
package OutputProcesser.SetInitialValues;
import Datastore.DataStore;
public class SetInitialValues1 extends SetInitialValues{
@Override
/*Set initial value is equal to 0 for G & total
*/
public 
void SetInitialValues(DataStore ds) {
ds.setG(0);
ds.settotal(0);}}
