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

package net.fabricmc.fabric.mixin.event.lifecycle;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageTracker;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;

@Mixin(DamageTracker.class)
public abstract class MixinDamageTracker {
	@Shadow
	@Final
	private LivingEntity entity;

	@Inject(at = @At("HEAD"), method = "onDamage")
	public void onDamage(DamageSource damageSource, float originalHealth, float damage, CallbackInfo info) {
		ServerEntityEvents.HURT.invoker().entityHurt(this.entity, damageSource, originalHealth, damage, damageSource.getAttacker());
	}
}
