import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<>();
	    list.add(1);
	    list.add(2);
	    list.add(2);
	    list.add(3);
	    list.add(4);
	    list.add(4);
	    list.add(5);
	    
	    for(int i=0; i<list.size()-1; i++){
	        if(list.get(i) == list.get(i+1)){
	            list.remove(i+1);
	            i=i-1;
	        }
	    }
	    
	    print(list);
	}
	public static void print(ArrayList<Integer> list){
	     System.out.print("[");
	    for(int i=0; i<list.size(); i++){
	        if(i==list.size()-1){
	            System.out.print(list.get(i));
	        }
	        else System.out.print(list.get(i)+", ");
	    }
	    System.out.print("]");
	}
}
