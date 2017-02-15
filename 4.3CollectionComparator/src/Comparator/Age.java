
package Comparator;
import java.util.*;
public class Age implements Comparator{
	public int compare(Object o1,Object o2)
	{
		ComparatorDemo s1=(ComparatorDemo) o1;
		ComparatorDemo s2=(ComparatorDemo) o2;
		if(s1.age==s2.age)  
			return 0;  
			else if(s1.age>s2.age)  
			return 1;  
			else  
			return -1;  
			}  

}
