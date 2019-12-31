package com.deloitte.collections;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;
public class CollectionDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    @SuppressWarnings("rawtypes")
	List items= new ArrayList();
    items.add(35);
    items.add(true);
    items.add(10.6);
    items.add("Manish");
    items.add(2, "Rahul");//items.add(index,value);
    for(Object item: items)
    {
    	System.out.println(item);
    }
    System.out.println("Capacity = "+items.size());
    items.remove((Object)10.6); //If Object is not given and direct 10.6 is given, itwill be treated as index
    System.out.println("\nAfter removing");
    for(Object item:items)
    {
    	System.out.println(item);
    }
    /*OR
     * Iterator it = items.iterator();
     * while(it.hasNext())
     * {
     *  SOP(it.next());
     *  }
     *  This also prints the list of items after removing.
     */
    /* OR
     * for(int i=0;i<items.size;++i)
     * {
     *  SOP(items.get(i));
     * }
     * This also prints the list of items after removing.
     */
    /*OR
     * items.forEach((item) -> System.out.println(item)); //Lambda func
     */
    /*OR
     * items.forEach(System.out::println); //Method caller 
     * 
     * This also prints the list of items after removing.
     */
    System.out.println("Capacity = "+items.size());
    System.out.println("\nString Buffer : ");
    List <StringBuffer> sbList= new ArrayList<>();
    
    sbList.add(new StringBuffer("abc"));
    sbList.add(new StringBuffer("xyz"));
    sbList.add(new StringBuffer("pqr"));
    sbList.add(new StringBuffer("ijk"));
    
    for(StringBuffer sb:sbList)
    {
   	  sb.append("-123 ");
    }
    for(StringBuffer sb: sbList)
    {
    	System.out.println(sb);
    }
  }

}
