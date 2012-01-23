/*
 * This file is part of SpoutAPI (http://www.spout.org/).
 *
 * SpoutAPI is licensed under the SpoutDev License Version 1.
 *
 * SpoutAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * SpoutAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.spout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */
package org.spout.api.event.entity;

import org.spout.api.Source;
import org.spout.api.entity.Entity;
import org.spout.api.event.Cancellable;
import org.spout.api.event.HandlerList;

/**
 * Called when an entity is damaged.
 */
public class EntityDamageEvent extends EntityEvent implements Cancellable {
	public EntityDamageEvent(Entity e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	private static HandlerList handlers = new HandlerList();

	private int damage;

	private Source source;

	/**
	 * Gets the source of this event.
	 * @return An EventSource that is the source of the event.
	 */
	public Source getSource() {
		return source;
	}

	/**
	 * Sets the source of this event.
	 * @param source The source of this event.
	 */
	public void setSource(Source source) {
		this.source = source;
	}

	/**
	 * Gets the damage amount
	 *
	 * @return The damage amount
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * Sets the damage amount
	 *
	 * @param damage The damage amount to set
	 */
	public void setDamage(int damage) {
		this.damage = damage;
	}

	@Override
	public void setCancelled(boolean cancelled) {
		super.setCancelled(cancelled);
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}