package com.example.limitsservice;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Configuration {
	@Value("${limits-service-minimum}")
	private int minimum;
	@Value("${limits-service-maximum}")
	private int maximum;
}
