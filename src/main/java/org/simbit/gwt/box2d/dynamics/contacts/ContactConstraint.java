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

//Updated to rev 89 of b2ContactSolver.h/.cpp

package org.simbit.gwt.box2d.dynamics.contacts;

import org.simbit.gwt.box2d.collision.Manifold;
import org.simbit.gwt.box2d.common.Settings;
import org.simbit.gwt.box2d.common.Vec2;
import org.simbit.gwt.box2d.dynamics.Body;

// Updated to rev 139 of b2ContactSolver.h
public class ContactConstraint {
    public ContactConstraintPoint points[];

    public Vec2 normal;

    public Manifold manifold;

    public Body body1;

    public Body body2;

    public float friction;

    public float restitution;

    public int pointCount;

    public ContactConstraint() {
        points = new ContactConstraintPoint[Settings.maxManifoldPoints];
        for (int i = 0; i < Settings.maxManifoldPoints; i++) {
            points[i] = new ContactConstraintPoint();
        }
        pointCount = 0;
        normal = new Vec2();
        manifold = new Manifold();
    }
}
