package com.nazzimods.woi.item;


public class ItemDustWOI extends ItemWOI {

	public ItemDustWOI() {
		super();
		this.setMaxStackSize(64);
		this.setHasSubtypes(false);
	}

	@Override
	public boolean getShareTag() {
		return true;
	}
	
}
