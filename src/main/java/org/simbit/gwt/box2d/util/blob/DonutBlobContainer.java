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
 * A donut blob container specified by two radii and a center.
 */
public class DonutBlobContainer implements BlobContainer {
	private float centerX, centerY;
	private float radiusSmall, radiusLarge;
	private float radiusSmallSqr, radiusLargeSqr;
	
	public DonutBlobContainer(Vec2 _center, float _radiusSmall, float _radiusLarge) {
		centerX = _center.x;
		centerY = _center.y;
		radiusSmall = _radiusSmall;
		radiusLarge = _radiusLarge;
		radiusSmallSqr = _radiusSmall*_radiusSmall;
		radiusLargeSqr = _radiusLarge*_radiusLarge;
	}

	
	public boolean containsPoint(Vec2 p) {
		float distSqr = (p.x-centerX)*(p.x-centerX)+(p.y-centerY)*(p.y-centerY);
		if (distSqr > radiusLargeSqr) return false;
		if (distSqr < radiusSmallSqr) return false;
		return true;
	}

	public AABB getAABB() {
		Vec2 min = new Vec2(centerX-1.2f*radiusLarge,centerY-1.2f*radiusLarge);
		Vec2 max = new Vec2(centerX+1.2f*radiusLarge,centerY+1.2f*radiusLarge);
		return new AABB(min,max);
	}

}