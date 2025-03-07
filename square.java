class Main{
    public static void main(String[] args){
        
        System.out.println( square(5) );
        
    }
    
    static String square(int n){
        
        String substr = "";
        
        for(int i=0; i<n; i++){
            
            for(int j=0; j<n; j++){
                
                if (i==0 || i==n-1){
                    substr += Integer.toString(n).concat(" ");
                }    
                else if ( j==0 || j == n-1){
                    substr += Integer.toString(n).concat(" ");
                }
                else {
                    substr += "* ";
                }
        } substr += " \n";
    } return substr;
}
}
