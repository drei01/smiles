package org.jdw.service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class PicturePusher {

	private static final Logger logger = Logger.getLogger(PicturePusher.class.getSimpleName());

	private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	// Once every 10 minutes
	@Scheduled(fixedRate = 600000)
	public void reportCurrentTime() throws IOException {
		logger.info("The time is now " + dateFormat.format(new Date()));

		// Credential credential = null;
		// TimelineItem timelineItem = new TimelineItem();
		// timelineItem.setText("Hello!");
		// MirrorClient.insertTimelineItem(credential, timelineItem);
	}

}
