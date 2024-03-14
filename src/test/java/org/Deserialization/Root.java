package org.Deserialization;

import java.util.ArrayList;

public class Root  {
	private String id;
	private String type;
	private String name;
	private int ppu;
	
	private ArrayList<String>topping;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPpu() {
		return ppu;
	}
	public void setPpu(int ppu) {
		this.ppu = ppu;
	}
	
	public ArrayList<String> getTopping() {
		return topping;
	}
	public void setTopping(ArrayList<String> topping) {
		this.topping = topping;
	}
	
	
	

}
