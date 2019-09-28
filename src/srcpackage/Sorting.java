/**
 * @author Pierre Tobgui
 */

package srcpackage;

final class Sorting<T> {
	
	/**
	 * Sorts any generic simple set holding an element. The elements get sorted in descending order.
	 * @param set is any Simple Set containing any data type. 
	 */
	
	public static <T extends Comparable<? super T>> void sort(SimpleSet<T> set) {

		SimpleSet<T> tempSet = new SimpleSet<T>();

		for (int i = 0; i < set.size() - 1; i++) {
			
			for (int j = i + 1; j < set.size(); j++) {

				if (set.get(i).compareTo(set.get(j)) < 0) {
					
					set.swapSet(i,j);	
				
				}
			}
		}
	}
}
