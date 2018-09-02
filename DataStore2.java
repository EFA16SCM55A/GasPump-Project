/**
* DataStorage for GasPump-2
*/
package Datastore;
public class DataStore2 extends DataStore {
public int Rpriced;
public int  Spriced;
public int  Ppriced;
public int  tempa2;
public int tempb2;
public int tempc2;
public int tempcash2;
public int cd;
public int tempL;
public int L1;
public float total2;
public int price;

public int  gettempa() {
return tempa2;
}
public int  gettempc1() {
return tempc;
}

public int gettempb() {
return tempb2;
}
public void setRprice(int Rprice) {
Rpriced=price;
}
public void setSprice(int price) {
Spriced=price;
}
public void setPprice(int price) {
Ppriced=price;
}

public int gettempc(){return tempc;}
public int getcash(){return cd;}
public void setcash(int c){cd=c;}
public int getprice(){return price;}
public void setprice(int pc){price=pc;}
public int gettempL(){return tempL;}
public int getL(){return L1;}
public void setL(int d){L1=d;}
public int getRprice(){return Rpriced;}
public int  getSprice(){return Spriced;}
public int  getPprice(){return Ppriced;}
public float  gettotal2(){return total2;}
public void settotal2(int t){total2=t;}
}

