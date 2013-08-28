package com.client;

import java.net.MalformedURLException;
import java.rmi.*;

import com.rmi.IHello;

public class HelloClient {
	public static void main(String args[]){ 
        try { 
            //在RMI服务注册表中查找名称为RHello的对象，并调用其上的方法 
            IHello rhello =(IHello) Naming.lookup("rmi://localhost:9090/RHello"); 
            System.out.println(rhello.helloWorld()); 
            System.out.println(rhello.add(11, 23));
            System.out.println(rhello.sayHelloToSomeBody("测试RMI")); 
        } catch (NotBoundException e) { 
            e.printStackTrace(); 
        } catch (MalformedURLException e) { 
            e.printStackTrace(); 
        } catch (RemoteException e) { 
            e.printStackTrace();   
        } 
    } 
}
