package com.st.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.st.service.INotificationService;

@Component
@Profile("dml")
public class DmlNotificationServiceImpl implements INotificationService {

	@Override
	public void notified() {
		System.out.println("service executed by dml method ");
	}

}
