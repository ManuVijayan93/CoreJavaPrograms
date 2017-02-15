package Comparator;
import java.util.*;
public class Name implements Comparator {
	public int compare(Object o1, Object o2)
	{
	ComparatorDemo s1=(ComparatorDemo) o1;
	ComparatorDemo s2=(ComparatorDemo) o2;
	return s1.name.compareTo(s2.name);
	}	
}
