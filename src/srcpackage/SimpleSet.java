
/**
 * @author Pierre Tobgui

 */

package srcpackage;

import exceptionpackage.DuplicateItemException;
import exceptionpackage.NotEnoughSpaceException;

public class SimpleSet<T> {

	private T[] myArray = (T[]) new Object[10];
	private int size;

	/**
	 * Creates an empty SimpleSet.
	 */
	public SimpleSet() {

		this.size = 0;
	}

	/**
	 * Creates a SimpleSet from a comma separated list with a maximum size of ten.
	 * 
	 * @param item
	 *            The size of the SimpleSet is equivalent to the size of the list
	 *            given to the method. Method is limited to a list with a maximum of
	 *            10 elements.
	 */

	public SimpleSet(T... item) {

		int total = 0;

		if (item.length > 10) {
			try {
				throw new NotEnoughSpaceException(
						"Not Enough Space Exception defined exception was thrown " + "and handled.");
			} catch (NotEnoughSpaceException e) {
				e.printStackTrace();
			}

		} else {

			for (int i = 0; i < item.length; i++) {

				myArray[i] = item[i];
				total++;
			}

		}

		for (int i = 0; i < item.length - 1; i++) {
			for (int j = i + 1; j < item.length - 1; j++) {

				if (myArray[i] == myArray[j]) {
					try {
						throw new DuplicateItemException(
								"Duplicate item Exception defined exception was thrown " + "and handled.");
					} catch (DuplicateItemException e) {
						e.printStackTrace();
					}
				}
			}
		}

		this.size = total;

	}

	/**
	 * A getter for the size of the Simple Set.
	 * 
	 * @return the simple sets size.
	 */

	public int size() {
		return this.size;
	}

	/**
	 * A setter for the size of the Simple Set.
	 * 
	 * @param size
	 *            is the desired size to change the current size to.
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * Determine if an item exists in a Simple Set or not.
	 * 
	 * @param item
	 *            can be any data type.
	 * @return if the item is in the given set true will be return. If the item is
	 *         not false will be returned.
	 */
	public Boolean contains(T item) {

		for (int i = 0; i < this.size; i++) {

			if (myArray[i].equals(item)) {

				return true;
			}

		}
		return false;
	}

	/**
	 * A way to access an item in the set based on the given index.
	 * 
	 * @param index
	 *            specifies the item to be returned based on the index in the set.
	 * @return the specified item in the set with the index in the parameter.
	 */
	public T get(int index) {

		if (index < 0 || index > this.size) {
			try {
				throw new NotEnoughSpaceException(
						"Index doesn't exist out of bound exception was thrown " + "and handled.");
			} catch (NotEnoughSpaceException e) {
				e.printStackTrace();
			}
		}
		return myArray[index];
	}

	/**
	 * Adds an item to the set.
	 * 
	 * @param item
	 *            is an item that can be added to a given set.
	 */
	public void add(T item) {

		if (this.size() >= 10) {
			try {
				throw new NotEnoughSpaceException(
						"Not Enough Space Exception defined exception was thrown " + "and handled.");
			} catch (NotEnoughSpaceException e) {
				e.printStackTrace();
			}

		} else if (contains(item) == true) {
			try {
				throw new DuplicateItemException(
						"Duplicate item Exception defined exception was thrown " + "and handled.");
			} catch (DuplicateItemException e) {
				e.printStackTrace();

			}
		} else {
			myArray[size] = item;
			this.setSize(size + 1);
		}
	}

	/**
	 * Puts an item into a set at a specific index replacing the old one.
	 * 
	 * @param index
	 *            is the index where the new item will be inputed.
	 * @param item
	 *            is the item being put into the set.
	 */

	public void put(int index, T item) {

		if (index < 0 || index >= this.size) {
			try {
				throw new NotEnoughSpaceException(
						"Not enough space define exception was thrown index out of bound" + "and handled.");
			} catch (NotEnoughSpaceException e) {
				e.printStackTrace();
		}
		}

		if (this.size() > 10) {
			try {
				throw new NotEnoughSpaceException(
						"Not Enough Space Exception defined exception was thrown " + "and handled.");
			} catch (NotEnoughSpaceException e) {
				e.printStackTrace();
			}

		} else if (contains(item) == true && !myArray[index].equals(item)) {
			try {
				throw new DuplicateItemException(
						"Duplicate item Exception defined exception was thrown " + "and handled.");
			} catch (DuplicateItemException e) {
				e.printStackTrace();

			}
		} else {

			myArray[index] = item;
		}
	}

	/**
	 * Swaps any two elements in the SimpleSet by giving the method the indexes of
	 * both elements.
	 * 
	 * @param index1
	 *            is the the index of the item in the set that you are swapping with
	 *            another item.
	 * @param index2
	 *            is the index of the other item in the set that is being swapped
	 *            with another item.
	 */

	public void swapSet(int index1, int index2) {

		T temp;
		temp = myArray[index1];
		myArray[index1] = myArray[index2];
		myArray[index2] = temp;

	}

	/**
	 * A way to print the desired set.
	 * 
	 * @return output. Method returns a string of the objects in the SimpleSet.
	 */

	public String toString() {

		String output = "{";
		for (int i = 0; i < this.size; i++) {
			output += myArray[i];

			if (i < this.size-1) {
				output += ", ";
			}
		}
		output += "}";
		return output;
	}

}
