package com.st.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.st.service.INotificationService;

@Component
@Profile("default")
public class NotificationServiceImpl implements INotificationService {

	@Override
	public void notified() {
		System.out.println("hello from by default service");
		
	Runnable r=()->{
			System.out.println("task completed by run method");
			for(int i=1;i<=10;i++) {
				for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"= "+i*j);
				}
				System.out.println();		
			}
	
	};	
	Thread t=new Thread(r);
		t.start();
	}

}
