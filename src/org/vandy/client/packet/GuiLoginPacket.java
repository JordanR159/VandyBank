package org.vandy.client.packet;

import org.vandy.client.login.LoginLogic;

import com.polaris.engine.App;
import com.polaris.engine.thread.AppPacket;
import com.polaris.engine.thread.LogicApp;

public class GuiLoginPacket extends AppPacket
{

	public GuiLoginPacket(App app, LogicApp logic) 
	{
		super(app, logic);
	}

	@Override
	public void handle() 
	{
		logicThread.setLogicHandler(new LoginLogic(logicThread));
	}

}
