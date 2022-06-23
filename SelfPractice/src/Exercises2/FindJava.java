package Exercises2;

public class FindJava {
	
	public static void main(String[] args) {
		
		System.out.println(word("xjava"));
        System.out.println(word("xxjava"));
        System.out.println(word("java"));
        System.out.println(word("xxxjavaxx"));
        System.out.println(word("xxxjavaxxxjavaxx"));
        System.out.println(word("xxxxxjava"));
        System.out.println(word("xxxxjava"));	
		
	}
	
	public static boolean word(String st) {
        
        if(st.length()<4) {
        	return false;}            
        else {           
            for(int i=0; i<5; i++) {                
                if(st.substring(i,i+4).equals("java")||st.substring(i+1,i+5).equals("java")) {
                	return true;                 
                }else {return false;}               
            }           
        }
        return false;       
    }

}
