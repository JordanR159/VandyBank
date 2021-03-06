package org.vandy.client.packet;

import org.vandy.client.login.LoginLogic;
import org.vandy.client.main.MainLogic;

import com.polaris.engine.App;
import com.polaris.engine.thread.AppPacket;
import com.polaris.engine.thread.LogicApp;

public class GuiMainPacket extends AppPacket
{
	private LoginLogic loginLogic;
	
	public GuiMainPacket(App app, LogicApp logic, LoginLogic login) 
	{
		super(app, logic);
		loginLogic = login;
	}

	@Override
	public void handle() 
	{
		logicThread.setLogicHandler(new MainLogic(logicThread, loginLogic));
	}

}
