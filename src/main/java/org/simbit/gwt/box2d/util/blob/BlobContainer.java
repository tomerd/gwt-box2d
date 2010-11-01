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

public interface BlobContainer {
	/**
	 * Is the Vec2 within the desired geometry?
	 * @param p The point to test
	 * @return True if the geometry contains the point
	 */
	public boolean containsPoint(Vec2 p);
	
	/** Get the world AABB of the container. */
	public AABB getAABB();
}
