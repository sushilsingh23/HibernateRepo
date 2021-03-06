//eVERY bID HAS ONE AND ONLY ITEM SO Bid to Item association is 
//many(Bids) to a single Item i.e. Many-to-One


import java.util.*;

public class Bid {
   Item item;
   private Long id = null;
   private Date created = new Date();
   private boolean successful = false;
   private int amount;
   
   public Bid(Item item, Long id, Date created, boolean successful, int amount) {
	super();
	this.item = item;
	this.id = id;
	this.created = created;
	this.successful = successful;
	this.amount = amount;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
Bid(){}
   Bid(Item item){
	   this.item = item;
   }
public Item getItem() {
	return item;
}
 public void setItem(Item item) {
	 this.item = item;
	 item.getBids().add(this);//This code ensures the bidirectional relationship
}
 
public Date getCreated() {
	return created;
}
public void setCreated(Date created) {
	this.created = created;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public boolean isSuccessful() {
	return successful;
}
public void setSuccessful(boolean successful) {
	this.successful = successful;
}
public String toString(){
	return getId()+" "+getAmount();
}
}

