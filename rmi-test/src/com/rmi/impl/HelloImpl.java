package com.rmi.impl;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import com.rmi.IHello;

public class HelloImpl extends UnicastRemoteObject implements IHello { 
    /** 
     * 因为UnicastRemoteObject的构造方法抛出了RemoteException异常，因此这里默认的构造方法必须写，必须声明抛出RemoteException异常 
     * 
     * @throws RemoteException 
     */ 
    public HelloImpl() throws RemoteException { 
    } 

    /** 
     * 简单的返回“Hello World！"字样 
     * 
     * @return 返回“Hello World！"字样 
     * @throws java.rmi.RemoteException 
     */ 
    public String helloWorld() throws RemoteException { 
        return "Hello World!"; 
    } 

    /** 
     * 一个简单的业务方法，根据传入的人名返回相应的问候语 
     * 
     * @param someBodyName 人名 
     * @return 返回相应的问候语 
     * @throws java.rmi.RemoteException 
     */ 
    public String sayHelloToSomeBody(String someBodyName) throws RemoteException { 
        return "你好，" + someBodyName + "!"; 
    }

	@Override
	public long add(long a, long b) throws RemoteException {
		// TODO Auto-generated method stub
		return a+b;
	} 
}
