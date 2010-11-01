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

package org.simbit.gwt.box2d.dynamics.contacts;

import org.simbit.gwt.box2d.collision.ContactID;
import org.simbit.gwt.box2d.collision.Shape;
import org.simbit.gwt.box2d.common.Vec2;

// Updated to rev 139 of b2Contact.h

/** This structure is used to report contact point results. */
public class ContactResult {
	/** The first shape */
	public Shape shape1;
	/** The second shape */
	public Shape shape2;
	/** Position in world coordinates */
	public Vec2 position;
	/** Points from shape1 to shape2 */
	public Vec2 normal;
	/** The normal impulse applied to body2 */
	public float normalImpulse;
	/** The tangent impulse applied to body2 */
	public float tangentImpulse;
	/** The contact id identifies the features in contact */
	public ContactID id;
	
	public ContactResult() {
		position = new Vec2();
		normal = new Vec2();
		id = new ContactID();
	}
}
