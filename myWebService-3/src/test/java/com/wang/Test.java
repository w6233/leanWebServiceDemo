package com.wang;

public class Test {

	public static void main(String[] args) {
			//使用命令生成下列类信息
			//wsimport -keep -d W:\tmp\ -s W:\tmp\ -p com.wang -verbose http://localhost:8081/wsSer?wsdl
			MySerImplService mySer = new MySerImplService();
			MySerImpl he = mySer.getPort(MySerImpl.class);
			System.out.println(he.sayHello("tom"));
	 
	}
  
}
