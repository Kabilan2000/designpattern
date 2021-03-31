
 class customer implements Observer   {

	  Store store;
	  String customerName;
	 customer(Store store,String name)
	 {
		 this.store=store;
		 this.store.addCutomer(this);
		 this.customerName=name;
	 }
	
	@Override
	public  void update() {
		// TODO Auto-generated method stub
System.out.println("Hey!"+this.customerName+". The new product "+this.store.name+" is added to the store of price "+this.store.price+"Rs");
	}

}
