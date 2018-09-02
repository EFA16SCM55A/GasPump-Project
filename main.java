package main;
import Input.GasPump1;
import Input.GasPump2;
import MDEFSM.MDEFSM;
import OutputProcesser.OutputProcesser;
import Factory.*;

import java.util.Scanner;
import java.io.*;

import Datastore.DataStore;
/**
* This class is a Driver class which is used help the user to choose and call the gas-pump operations. Typically shows the execution of the gas-pump system
*/
 public class main{
	 public static void main(String[] args) throws IOException{
	 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
 	 String input = null;
 	 int choice = 1;
 	
	System.out.println("Select GasPump from below Chocies \n");
	System.out.println("1.GasPump‐1\n" + "2.GasPump‐2\n" + "3.Exit\n");
	System.out.println("Start");

input = bufferedReader.readLine();
if(input.equalsIgnoreCase("1"))
{
	float a,b;
  G1Factory G1fact=new G1Factory();
  OutputProcesser o1 = new OutputProcesser(G1fact.getdata(), G1fact);
  MDEFSM me1 = new MDEFSM(G1fact, o1);
  GasPump1 G1 = new GasPump1(me1, G1fact.getdata());

  System.out.println("\n******Choose GasPump-1 operations******");
  System.out.println("\n1. Activate(float,float)");
System.out.println("\n2.Start()");
System.out.println("\n3. PayCredit()" );
System.out.println("\n4. Reject()" );
System.out.println("\n5. Cancel()" );
System.out.println("\n6. Approved()" );
System.out.println("\n7. Super()" );
System.out.println("\n8. Regular" );
System.out.println("\n9. StartPump" );
System.out.println("\n10.PumpGallon" );
System.out.println("\n11.StopPump" );
System.out.println("\n12.Quit the program" );
while (true) 
{
	System.out.println("Select Operation: ");
	System.out.println("\n1. Activate,2.Start, 3. PayCredit,4. Reject, 5. Cancel,6. Approved, 7. Super, 8. Regular,9. StartPump, 10.PumpGallon, 11.StopPump, 12.Quit the program" );
     
	input = bufferedReader.readLine();

    if(input.isEmpty()) continue;
    if(input.equalsIgnoreCase("e"))
    	break;
    
    choice = Integer.parseInt(input);
    
    switch(choice)
 {
case 1: System.out.println("\nEnter value1 for activate : ");
input = bufferedReader.readLine();
a = Float.parseFloat(input);
System.out.println("\nEnter value2 for activate: ");
input = bufferedReader.readLine();
b = Float.parseFloat(input);
G1.Activate(a,b);
break;
case 2: System.out.println("\nStart() operation ");
G1.start();
break;
case 3: System.out.println("\nPayCredit() operation ");
G1.PayCredit();
break;
case 4: System.out.println("\n Reject()operation : ");
G1.Reject();
break;
case 5: System.out.println("\n Cancel()operation : ");
G1.Cancel();
break;
case 6: System.out.println("\n Approved()operation : ");
G1.Approved();
break;
case 7: System.out.println("\n Super()operation : ");
G1.Super();
break;
case 8: System.out.println("\n Regular()operation : ");
G1.Regular();
break;
case 9: System.out.println("\n StartPump()operation : ");
G1.StartPump();
break;
case 10: System.out.println("\n PumpGallon()operation : ");
G1.PumpGallon();
break;
case 11: System.out.println("\n StopPump()operation : ");
G1.StopPump();
break;
default: System.out.println("Please enter a valid option");
break; }}}
else if(input.equalsIgnoreCase("2")){
G2Factory G2fact=new G2Factory();
OutputProcesser o2 = new OutputProcesser(G2fact.getdata(), G2fact);
MDEFSM me2 = new MDEFSM(G2fact, o2);
GasPump2 G2 = new GasPump2(me2, G2fact.getdata());
System.out.println("\n******Choose GasPump-2 operations******");
System.out.println("\n1. Activate(int,int,int)");
System.out.println("\n2.Start()");
System.out.println("\n3. PayCash(float)" );
System.out.println("\n4. Cancel()" );
System.out.println("\n5. Super()" );
System.out.println("\n6. Premium()" );
System.out.println("\n7. Regular()" );
System.out.println("\n8. StartPump()" );
System.out.println("\n9.PumpLiter()" );
System.out.println("\n10.Stop()" );
System.out.println("\n11.Receipt()" );
System.out.println("\n12.NoReceipt()" );
System.out.println("\n13.Quit the program" );
while(true)
	{
	System.out.println("******Select Operation:******");
	System.out.println("\n1. Activate,2.Start, 3. Paycash,4. Cancel,5. Super, 6.Premium 7. Regular,8. StartPump, 9.PumpLiter, 10.Stop,11.Receipt,12.NoReceipt, 13.Quit the program" );
	int a, b, c;
	int  cash;
	 while (true) 
     {
     	
     	System.out.println("Select Operation: ");
     	System.out.println("\n1. Activate,2.Start, 3. Paycash,4. Cancel,5. Super, 6.Premium 7. Regular,8. StartPump, 9.PumpLiter, 10.Stop,11.Receipt,12.NoReceipt, 13.Quit the program" );          
			input = bufferedReader.readLine();

         if(input.isEmpty()) continue;
         if(input.equalsIgnoreCase("e"))
         	break;
         
         choice = Integer.parseInt(input);
         
switch(choice)
   {
	case 1: System.out.println("\nEnter value1 for activate : ");
	input = bufferedReader.readLine();
	a = Integer.parseInt(input);
	System.out.println("\nEnter value2 for activate: ");
	input = bufferedReader.readLine();
	b = Integer.parseInt(input);	
	System.out.println("\nEnter value3 for activate: ");
	input = bufferedReader.readLine();
	c= Integer.parseInt(input);
	G2.Activate(a,b,c);
	break;
	case 2: System.out.println("\nStart() operation ");
	G2.Start();
	break;
	case 3: System.out.println("\nPayCash() operation ");
	System.out.println("\nEnter cash: ");
	input = bufferedReader.readLine();
	cash = Integer.parseInt(input);
	G2.PayCash(cash);
	break;
	case 4: System.out.println("\n Cancel()operation : ");
	G2.Cancel() ;
	break;
	case 5: System.out.println("\n Super()operation : ");
	G2.Super();
	break;
	case 6: System.out.println("\n Premium()operation : ");
		G2.Premium();
		case 7: System.out.println("\n Regular()operation : ");
		G2.Regular();
		break;
		case 8: System.out.println("\n StartPump()operation : ");
		G2.StartPump();
		break;
		case 9: System.out.println("\n PumpLiter()operation : ");
		G2.PumpLiter();
		break;
		case 10: System.out.println("\n Stop()operation : ");
		G2.Stop();
		break;
		case 11: System.out.println("\n Receipt()operation : ");
		G2.Receipt();
		break;
		case 12: System.out.println("\n NoReceipt()operation : ");
		G2.NoReceipt();
		break;
		default: System.out.println("Please enter a valid option");
		break; }}
		System.out.println("End");}

}}}