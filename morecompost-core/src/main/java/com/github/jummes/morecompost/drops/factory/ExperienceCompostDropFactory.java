package com.github.jummes.morecompost.drops.factory;

import org.bukkit.configuration.ConfigurationSection;

import com.github.jummes.morecompost.drops.AbstractCompostDrop;
import com.github.jummes.morecompost.drops.ExperienceCompostDrop;

public class ExperienceCompostDropFactory implements CompostDropFactory {

	@Override
	public AbstractCompostDrop buildCompostDrop(ConfigurationSection drop) {
		int weight = drop.getInt("weight", 1);

		int minAmount = drop.getInt("minAmount", 5);
		int maxAmount = drop.getInt("maxAmount", 5);

		return new ExperienceCompostDrop(drop.getName(), weight, minAmount, maxAmount);
	}

}
