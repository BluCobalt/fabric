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

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.impl.content.registries.ContentRegistryImpl;

public final class BlockRegistry {
	public static boolean blockIdsSetup = false;

	private BlockRegistry() {
	}

	public static <T extends Block> T register(Identifier id, T block) {
		block.setTranslationKey(id.toString());
		return ContentRegistryImpl.registerBlock(id, block);
	}
}
