package me.jjfoley.adt.errors;

/**
 * This is an error for lists and other data structures that can run out of space.
 * @author jfoley
 *
 */
@SuppressWarnings("serial")
public class RanOutOfSpaceError extends RuntimeException {
	public RanOutOfSpaceError() {
		super("RanOutOfSpace::FixedSizeList");
	}
}
