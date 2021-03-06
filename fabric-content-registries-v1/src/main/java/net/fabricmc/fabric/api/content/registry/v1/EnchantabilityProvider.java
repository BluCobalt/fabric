/*
 * Copyright (c) 2020 Legacy Fabric
 * Copyright (c) 2016 - 2020 FabricMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.fabricmc.fabric.api.content.registry.v1;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Implement this interface when you want an ItemStack aware version of {@link Item#getEnchantability()}.
 */
public interface EnchantabilityProvider {
	default int getEnchantability(ItemStack stack) {
		return ((Item) this).getEnchantability();
	};
}
