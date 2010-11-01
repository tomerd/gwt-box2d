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

/*
 * JBox2D - A Java Port of Erin Catto's Box2D
 * 
 * JBox2D homepage: http://jbox2d.sourceforge.net/ 
 * Box2D homepage: http://www.box2d.org
 * 
 * This software is provided 'as-is', without any express or implied
 * warranty.  In no event will the authors be held liable for any damages
 * arising from the use of this software.
 * 
 * Permission is granted to anyone to use this software for any purpose,
 * including commercial applications, and to alter it and redistribute it
 * freely, subject to the following restrictions:
 * 
 * 1. The origin of this software must not be misrepresented; you must not
 * claim that you wrote the original software. If you use this software
 * in a product, an acknowledgment in the product documentation would be
 * appreciated but is not required.
 * 2. Altered source versions must be plainly marked as such, and must not be
 * misrepresented as being the original software.
 * 3. This notice may not be removed or altered from any source distribution.
 */

package org.simbit.gwt.box2d.collision;

import org.simbit.gwt.box2d.common.Vec2;

//Updated to rev 139 of b2Collision.h

/** An axis-aligned bounding box. */
public class AABB {
	/** Vertex of bounding box. */
    public Vec2 lowerBound, upperBound;
    
    public String toString() {
    	String s = ""+lowerBound+" -> "+upperBound;
    	return s;
    }

    public AABB(Vec2 minVertex, Vec2 maxVertex) {
        this.lowerBound = minVertex.clone(); // clone to be safe
        this.upperBound = maxVertex.clone();
    }

    public AABB(AABB copy) {
        this(copy.lowerBound, copy.upperBound); // relies on cloning in AABB(Vec2, Vec2) constructor
    }

    public AABB() {
        lowerBound = new Vec2();
        upperBound = new Vec2();
    }

    /** Verify that the bounds are sorted. */
    public boolean isValid() {
        Vec2 d = upperBound.sub(lowerBound);
    	boolean valid = (d.x >= 0.0f && d.y >= 0);
    	valid = valid && lowerBound.isValid() && upperBound.isValid();
    	return valid;
    }

    /** Check if AABBs overlap. */
    public boolean testOverlap(AABB box) {
        Vec2 d1 = box.lowerBound.sub(upperBound);
        Vec2 d2 = lowerBound.sub(box.upperBound);

        if (d1.x > 0.0f || d1.y > 0.0f || d2.x > 0.0f || d2.y > 0.0f) {
            return false;
        }
        else {
            return true;
        }
    }
}
