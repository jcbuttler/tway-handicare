package br.com.tway.handicare.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProcessCsvJob {
	@Scheduled(fixedRate = 1000)
	public void aaa() {
		System.out.println("teste");
	}
}