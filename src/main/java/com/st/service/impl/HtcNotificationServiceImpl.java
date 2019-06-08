package com.st.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.st.service.INotificationService;

@Component
@Profile("htc")
public class HtcNotificationServiceImpl implements INotificationService {

	@Override
	public void notified() {
			System.out.println("Service executed by htc profile");
	}

}
