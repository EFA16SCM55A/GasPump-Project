/*
* SetInitialValue class for GasPUmp-2 to set L & total
*/
package OutputProcesser.SetInitialValues;
import Datastore.DataStore;
public class SetInitialValues2 extends SetInitialValues {
@Override
/*set initial value equals to 0 for L & total
*/
public void SetInitialValues(DataStore ds) {
ds.setL(0);
ds.settotal2(0);
}
}
