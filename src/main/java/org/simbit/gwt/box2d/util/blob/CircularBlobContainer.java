/**
 * GWT-Box2d, a GWT port of the popular Box2D physics engine
 * Copyright (C) 2010 simbit
 * www.simbit.org
 *
 * Please note this is a modified version of JBox2D, the original Java port of Box2D.
 * for more information on JBox2D see http://jbox2d.sourceforge.net
 * for more information on Box2D: http://www.box2d.org
 *
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.simbit.gwt.box2d.util.blob;

import org.simbit.gwt.box2d.collision.AABB;
import org.simbit.gwt.box2d.common.Vec2;

/**
 * A circular blob container specified by radius and center.
 */
public class CircularBlobContainer implements BlobContainer {
	private float centerX, centerY;
	private float radius;
	private float radiusSqr;
	
	public CircularBlobContainer(Vec2 _center, float _radius) {
		centerX = _center.x;
		centerY = _center.y;
		radius = _radius;
		radiusSqr = _radius*_radius;
	}
	
	public float getRadius() {
		return radius;
	}
	
	public void setRadius(float r) {
		radius = r;
		radiusSqr = r*r;
	}
	
	public Vec2 getCenter() {
		return new Vec2(centerX,centerY);
	}
	
	public void setCenter(Vec2 c) {
		centerX = c.x;
		centerY = c.y;
	}
	
	public boolean containsPoint(Vec2 p) {
		float distSqr = (p.x-centerX)*(p.x-centerX)+(p.y-centerY)*(p.y-centerY);
		if (distSqr > radiusSqr) return false;
		return true;
	}

	public AABB getAABB() {
		Vec2 min = new Vec2(centerX-radius*1.2f,centerY-radius*1.2f);
		Vec2 max = new Vec2(centerX+radius*1.2f,centerY+radius*1.2f);
		return new AABB(min,max);
	}

}
