package CommonFunLibrary;

public class stringreverse {
  
	public static void main(String[]args){
		String reverse="qedge technologies";
		for(int i=reverse.length()-1;i>=0;i--){
			System.out.print(reverse.charAt(i));
		}
		
		for(int i=0;i<reverse.length();i++){
			int counter=0;
			char tempchar;
			tempchar=reverse.charAt(i);
			
			for(int j=0;j<reverse.length();j++){
				char comparechar=reverse.charAt(j);
				
				if(tempchar==comparechar){
					counter++; 
				}
				
			}
			
			System.out.println(tempchar+"has repeated for"+counter+"times");
			
		}
	}
}
	

