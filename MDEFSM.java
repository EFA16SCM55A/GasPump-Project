package MDEFSM;

import Factory.*;
import States.*;
import OutputProcesser.*;

/*** This class is manages the state changes*/
public class MDEFSM{

	 States.Start Start = new Start(this);
	 State S0 = new S0(this);
	 State S1 = new S1(this);
	 State S2 = new S2(this);
	 State S3 = new S3(this);
	 State S4 = new S4(this);
	 State S5 = new S5(this);
	 State S6 = new S6(this);
	 State Cstate=null;
		public int n;
		public Factory af=null;
		public OutputProcesser o =null;
		
 /*It is the constructor. It sets the current state of the Account to Start and set the value of Attempts to 0.*/
public MDEFSM(Factory af, OutputProcesser o) {
	Cstate = Start;
    this.o = o;
    this.af = af;}

	public void Activate() {
		if(!(Cstate instanceof Start)){
			printNotAValidOperation();}
		else{((Start)Cstate).Activate();}
		printCurState();
	}

	public void Start() {
		if(!(Cstate instanceof S0)){
			printNotAValidOperation();}
		else{
			((S0)Cstate).Start();}
		printCurState();}
	
public void PayType(int t) {
		if(!(Cstate instanceof S1)){
			printNotAValidOperation();}
		else {
			((S1)Cstate).PayType(t);}
		printCurState();}

public void Reject() {
	if(!(Cstate instanceof S2)){
		printNotAValidOperation();
	}else{
	((S2)Cstate).Reject();
	}
	printCurState();
}

public void Approved(){
		if(!(Cstate instanceof S2)){
			printNotAValidOperation();}
	
		else{
			((S2)Cstate).Approved();}
	printCurState();}

	public void Cancel() {
		if(!(Cstate instanceof S3)){
			printNotAValidOperation();
    	}
    	else{
    		((S3)Cstate).Cancel();}
    	   	printCurState();

	}
	public void SelectGas(int g) {
		if(!(Cstate instanceof S3)){
			printNotAValidOperation();
		}else{
			((S3)Cstate).SelectGas(g);
		}
		printCurState();
	}
	public void StartPump(){
		if(!(Cstate instanceof S4)){
			printNotAValidOperation();
		}else{
			((S4)Cstate).StartPump();
		}
		printCurState();
	}
	public void Pump() {
		if(!(Cstate instanceof S5)){
			printNotAValidOperation();}
		else {
			((S5)Cstate).Pump();
		}
	
		printCurState();
	}
	public void StopPump() {
		if(!(Cstate instanceof S5)){
			printNotAValidOperation();
		}else{
			((S5)Cstate).StopPump();
		}
		printCurState();
	}
	public void Receipt() {
		if(!(Cstate instanceof S6)){
			printNotAValidOperation();
		}else{
			((S6)Cstate).Receipt();
		}
		printCurState();
	}
	public void NoReceipt() {
		if(!(Cstate instanceof S6)){
			printNotAValidOperation();
		}else{
			((S6)Cstate).NoReceipt();
		}
		printCurState();
	}
	public State getS0() {
		return S0;
	}
	public void setstart(State S0) {
		this.Cstate = S0;
	}
	public State getS1() {
		return S1;
	}
	public void setS1(State S1) {
		this.Cstate = S1;
	}
	public State getS2() {
		return S2;
	}
	public void setS2(State S2) {
		this.Cstate = S2;
	}
	public State getS3() {
		return S3;
	}
	public void setS3(State S3) {
		this.Cstate = S3;
	}
	public State getS4() {
		return S4;
	}
	public void setS4(State S4) {
		this.Cstate=S4;
	}
	public State getS5() {
		return S5;
	}
	public void setS5(State S5) {
		this.Cstate=S5;
	}
	public State getS6() {
		return S6;
	}
	public void setS6(State S6) {
		this.Cstate = S6;
	}
	
	public State getStart() {
		return this.Cstate;
	}
	public void setStart(State Start1) {
		this.Cstate = Start1;
	}
	
	public Factory getAf() {
		return this.af;
	}
	public void setAf(Factory af) {
		this.af = af;
	}
	/*public OutputProcesser getO() {
		return this.o;
	}
	public void setO(OutputProcesser o) {
		this.o = o;
	}*/
	public State getState() {
		return this.Cstate;
	}
	public void setState(State state) {
		this.Cstate = state;
	}
	
	private void printCurState() {
		// TODO Auto-generated method stub
		System.out.println("Current State : "+Cstate.getClass().getName());
	}
	private void printNotAValidOperation() {
		// TODO Auto-generated method stub
		System.out.println("Not a valid operation");
	}}

	



