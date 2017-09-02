package semaine3;

public class Chat {
       
	 	String eyes;
	 	String color;
	    String name;
	    final int age = 0;
	    boolean sovageOuDomestique;
	    String voix =  "miaw";

	public Chat(String eyes, String color, String name) {
		this.eyes = eyes;
		this.color = color;
		this.name = name;
	}

	public void miao(){
	    	System.out.println("Miawwwww..");
	    }
	    public void myInfo(){
	    	System.out.println("Miaww my name is "+name);
	    }	
	    public int apresUnNom(){
	    	return age+1;
	    }
	    
}
