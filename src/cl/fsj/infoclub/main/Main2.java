package cl.fsj.infoclub.main;

public class Main2 {

	    public static void main(String[] args) {
	       
	    	System.out.println("****");
	    	
	    	
	    	try {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } catch (Exception e) {
	            /*No hacer nada*/
	        }
	          
	    }
}

