package com.practice.singleton;

public class ConfigManager {

	public static ConfigManager CONFIG_MANAGER = new ConfigManager();

	private ConfigManager() {

	}

	public static synchronized ConfigManager getInstance() {
		if (CONFIG_MANAGER != null) {
			return CONFIG_MANAGER;
		} else {
			CONFIG_MANAGER = new ConfigManager();
			return CONFIG_MANAGER;
		}
	}
}
