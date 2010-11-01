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

package org.simbit.gwt.box2d.dynamics.joints;

import org.simbit.gwt.box2d.common.Vec2;
import org.simbit.gwt.box2d.dynamics.Body;

//Updated to rev 56->130 of b2PrismaticJoint.cpp/.h

public class PrismaticJointDef extends JointDef {
	public PrismaticJointDef() {
		type = JointType.PRISMATIC_JOINT;
		localAnchor1 = new Vec2();
		localAnchor2 = new Vec2();
		localAxis1 = new Vec2();
		referenceAngle = 0.0f;
		enableLimit = false;
		lowerTranslation = 0.0f;
		upperTranslation = 0.0f;
		enableMotor = false;
		maxMotorForce = 0.0f;
		motorSpeed = 0.0f;
	}

	/// Initialize the bodies, anchors, axis, and reference angle using the world
	/// anchor and world axis.
	public void initialize(Body b1, Body b2, Vec2 anchor, Vec2 axis) {
		body1 = b1;
		body2 = b2;
		localAnchor1 = body1.getLocalPoint(anchor);
		localAnchor2 = body2.getLocalPoint(anchor);
		localAxis1 = body1.getLocalVector(axis);
		referenceAngle = body2.getAngle() - body1.getAngle();
	}

	/// The local anchor point relative to body1's origin.
	public Vec2 localAnchor1;

	/// The local anchor point relative to body2's origin.
	public Vec2 localAnchor2;

	/// The local translation axis in body1.
	public Vec2 localAxis1;

	/// The constrained angle between the bodies: body2_angle - body1_angle.
	public float referenceAngle;

	/// Enable/disable the joint limit.
	public boolean enableLimit;

	/// The lower translation limit, usually in meters.
	public float lowerTranslation;

	/// The upper translation limit, usually in meters.
	public float upperTranslation;

	/// Enable/disable the joint motor.
	public boolean enableMotor;

	/// The maximum motor torque, usually in N-m.
	public float maxMotorForce;

	/// The desired motor speed in radians per second.
	public float motorSpeed;
}