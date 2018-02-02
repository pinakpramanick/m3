package com.cg.bin;

public class ItemSchema {
	int itemId;
	String itemName;
	double itemPrice;
	int txnId;
	
	public ItemSchema(int itemId,String itemName, double itemPrice, int txnId){
		this.itemId=itemId;
		this.itemName=itemName;
		this.itemPrice=itemPrice;
		this.txnId=txnId;
	}

	@Override
	public String toString() {
		return "ItemSchema [itemId=" + itemId + ", itemName=" + itemName
				+ ", itemPrice=" + itemPrice + ", txnId=" + txnId + "]";
	}
	public static void main(String args[]){
		ItemSchema ob=new ItemSchema(6,"a",1.1,123);
		
		System.out.println(ob.toString());
		
	}

}


