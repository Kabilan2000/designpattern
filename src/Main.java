
public class Main {

	public static void main(String[] args) {
  		// TODO Auto-generated method stub
          Store store =new Store();
          
          Observer c1=new customer(store,"kabilan");
          Observer c2=new customer(store,"abishek");
          Observer c3=new customer(store,"hari");
          
          store.upDateProduct("tv", 10000);
          store.upDateProduct("mobile", 20000);
  	}

}
