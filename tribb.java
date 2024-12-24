class Main{

    public static void main(String[] args){

        System.out.println(algo.trib(5));
    }
}

class algo{

    static int trib(int n){

        if (n==0 || n==1){ return n; }
        else if (n==3){ return n-1; }
        else{
            return trib(n-1)+trib(n-2)+trib(n-3);
        }
    }
}
