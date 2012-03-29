package jsettlers.mapcreator.tools.shapes;


import jsettlers.common.position.ShortPoint2D;

/**
 * This is a shape a tool can work with.
 * 
 * @author michael
 */
public interface ShapeType {
	/**
	 * Sets the affected status of the tiles. Assumes that the given array is
	 * initialized with 0s, and that 0 means no influence, 127 means full
	 * influence.
	 */
	void setAffectedStatus(byte[][] fields, ShortPoint2D start, ShortPoint2D end);

	/**
	 * Gets the size of the shape (as optimisation)
	 * 
	 * @return The (average) size in map units.
	 */
	int getSize();

	String getName();
}
