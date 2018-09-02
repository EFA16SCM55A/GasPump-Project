package States;

public interface State {
	public void Activate();
	public void PayType(int t);	
	public void StopPump();
	public void StartPump();
	public void Start();
	public void Reject();
	public void SelectGas(int g);
	public void Approved();
	public void Cancel();
	public void Receipt();
	public void NoReceipt();
	public void Pump();}
	
