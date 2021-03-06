package com.xihuanyuye;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.FastDateFormat;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling // 该注解必须要加
public class ScheduleJobs_Corn {

	// public final static long SECOND = 1;
	public final static long SECOND = 5 * 1000;
	FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");

	@Scheduled(fixedDelay = SECOND * 2)
	public void fixedDelayJob() throws InterruptedException {
		// TimeUnit.SECONDS.sleep(2);
		System.out.println("[FixedDelayJob Execute]" + fdf.format(new Date()));
	}
}
