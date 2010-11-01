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

/**
 * Simple non-reinforced square lattice.
 * Easy to collapse, but simple.
 */
public class SquareLatticeStructure extends BlobStructure {

	public SquareLatticeStructure() {
		super();
		BlobPoint toAdd = new BlobPoint(0.5f,0.5f);
		int center = addPoint(toAdd);
		
		addConnection(center,center,Region.UP_RIGHT);
		addConnection(center,center,Region.RIGHT);
		addConnection(center,center,Region.DOWN_RIGHT);
		addConnection(center,center,Region.DOWN);
	}

}
