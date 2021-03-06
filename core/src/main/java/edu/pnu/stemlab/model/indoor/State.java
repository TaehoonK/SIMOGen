/**
 * 
 */
package edu.pnu.stemlab.model.indoor;

import java.util.Map;
import java.util.Set;

import com.vividsolutions.jts.geom.Point;

/**
 * @author hgryoo
 * 
 */
public interface State {
	String getId();
	
	Point getGeometry();
	
	SpaceLayer getSpaceLayer();
	
	Set<Transition> getConnects();
	
	Set<State> getNeighbors();
	
	State getNeighbor(Transition t);
	
	CellSpace getDuality();
	
	Map<Object, Object> getUserData();
	
	boolean isBranch();
}
