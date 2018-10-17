package com.mexico.web.item;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component @Lazy 
public class Item {
	 	private int itemSeq;
	    private String itemName;
	    private String brand;
	    private int price;
	    private double salePercent;
	    private boolean event;
	    private boolean newItem;
	    private String image;
	    private String explains;
	    private int calorie;
		public int getItemSeq() {
			return itemSeq;
		}
		public void setItemSeq(int itemSeq) {
			this.itemSeq = itemSeq;
		}
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public double getSalePercent() {
			return salePercent;
		}
		public void setSalePercent(double salePercent) {
			this.salePercent = salePercent;
		}
		public boolean isEvent() {
			return event;
		}
		public void setEvent(boolean event) {
			this.event = event;
		}
		public boolean isNewItem() {
			return newItem;
		}
		public void setNewItem(boolean newItem) {
			this.newItem = newItem;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public String getExplains() {
			return explains;
		}
		public void setExplains(String explains) {
			this.explains = explains;
		}
		public int getCalorie() {
			return calorie;
		}
		public void setCalorie(int calorie) {
			this.calorie = calorie;
		}
	    
}
