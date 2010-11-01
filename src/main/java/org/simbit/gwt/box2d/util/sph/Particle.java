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

package org.simbit.gwt.box2d.util.sph;

import org.simbit.gwt.box2d.common.Vec2;

public class Particle {

	public Vec2 pos;
	public Vec2 vel;
	public double mass;
	protected int deleted;
	
	public Particle() {
		pos = new Vec2();
		vel = new Vec2();
		mass = 0.0;
		deleted = 1;
	}
		
	public Particle(Vec2 p, Vec2 v, double m) {
		pos = p.clone();
		vel = v.clone();
		mass = m;
	}
		
	public Particle(Particle P) {
		pos = P.pos.clone();
		vel = P.vel.clone();
		mass = P.mass;
		deleted = P.deleted;
	}

	public void deleteParticle()		       { deleted = 1; }
	public void undeleteParticle()		       { deleted = 0; }
	public boolean isEmpty()		      	   { return ((deleted!=0)?true:false); }
		
}

