package com.nazzimods.woi.network.message;

import java.util.UUID;

import com.nazzimods.woi.tileentity.TileEntityWOI;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.tileentity.TileEntity;

public class MessageTileEntityWOI implements IMessage, IMessageHandler<MessageTileEntityWOI, IMessage> {

	public int x, y, z;
	public byte orientation, state;
	public String customName;
	public UUID ownerUUID;

	public MessageTileEntityWOI() {
	}

	public MessageTileEntityWOI(TileEntityWOI tileEntityWOI) {
		this.x = tileEntityWOI.xCoord;
		this.y = tileEntityWOI.yCoord;
		this.z = tileEntityWOI.zCoord;
		this.orientation = (byte) tileEntityWOI.getOrientation().ordinal();
		this.state = (byte) tileEntityWOI.getState();
		this.customName = tileEntityWOI.getCustomName();
		this.ownerUUID = tileEntityWOI.getOwnerUUID();
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.x = buf.readInt();
		this.y = buf.readInt();
		this.z = buf.readInt();
		this.orientation = buf.readByte();
		this.state = buf.readByte();
		int customNameLength = buf.readInt();
		this.customName = new String(buf.readBytes(customNameLength).array());
		if (buf.readBoolean()) {
			this.ownerUUID = new UUID(buf.readLong(), buf.readLong());
		} else {
			this.ownerUUID = null;
		}
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(x);
		buf.writeInt(y);
		buf.writeInt(z);
		buf.writeByte(orientation);
		buf.writeByte(state);
		buf.writeInt(customName.length());
		buf.writeBytes(customName.getBytes());
		if (ownerUUID != null) {
			buf.writeBoolean(true);
			buf.writeLong(ownerUUID.getMostSignificantBits());
			buf.writeLong(ownerUUID.getLeastSignificantBits());
		} else {
			buf.writeBoolean(false);
		}
	}

	@Override
	public IMessage onMessage(MessageTileEntityWOI message, MessageContext ctx) {
		TileEntity tileEntity = FMLClientHandler.instance().getClient().theWorld.getTileEntity(message.x, message.y, message.z);

		if (tileEntity instanceof TileEntityWOI) {
			((TileEntityWOI) tileEntity).setOrientation(message.orientation);
			((TileEntityWOI) tileEntity).setState(message.state);
			((TileEntityWOI) tileEntity).setCustomName(message.customName);
			((TileEntityWOI) tileEntity).setOwnerUUID(message.ownerUUID);
		}

		return null;
	}

	@Override
	public String toString() {
		return String.format("MessageTileEntityEE - x:%s, y:%s, z:%s, orientation:%s, state:%s, customName:%s, ownerUUID:%s", x, y, z, orientation, state, customName, ownerUUID);
	}

}
