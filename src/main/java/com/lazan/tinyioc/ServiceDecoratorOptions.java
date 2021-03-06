package com.lazan.tinyioc;

public interface ServiceDecoratorOptions {
	ServiceDecoratorOptions withServiceId(String serviceId);
	ServiceDecoratorOptions before(String... serviceIds);
	ServiceDecoratorOptions after(String... serviceIds);
}
