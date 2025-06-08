package com.example.projectbrad.core.config;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.spi.MappingContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @since 2023-06-26
 * @version 0.1.0
 * @author <a href="http://vertis-solutions.com">Vertis Solutions</a>
 */
@Configuration
public class ModelMapperConfig {

	@Bean
	ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.addConverter((MappingContext<String, String> context) -> context.getSource() != null ? context.getSource().trim() : null);

		return modelMapper;
	}
}

class StringTrimConverter implements Converter<String, String> {

	@Override
	public String convert(MappingContext<String, String> context) {
		if (context.getSource() == null) {
			return null;
		}
		return context.getSource().trim();
	}
}