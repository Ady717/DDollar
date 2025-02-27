package com.dickdollar;

import com.dickdollar.item.Moditems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DickDollar implements ModInitializer {
	public static final String MOD_ID = "dickdollar";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Moditems.registerModItems();

	}
}