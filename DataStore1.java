/**
* DataStorage for GasPump-1
*/
package Datastore;
public class DataStore1 extends DataStore {
public float tempa1;
public float tempb1;
public int tempG;
public int Gd;
public float price2;
int total;
float price;
public float gettempa1() {
return tempa1;
}
public float gettempb1() {
return tempb1;
}
public void setprice1(float price1) {
price=price1;}
public float getprice1(){return price;}
public void setprice(int pc){price=pc;}
public int gettempG(){return tempG;}
public int getG(){return Gd;}
public void setG(int c){Gd=c;}
public  int total1(){return total;}
public void settotal1(int t){total=t;}
}
