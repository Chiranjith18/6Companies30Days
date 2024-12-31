class Solution {
    public int findTheWinner(int n, int k) {
     return   fi(n,k)+1;
    }
    public int fi(int n,int k){
        if(n==0){
            return 1; //if there is only one player then he is the winner
        }
        return (fi(n-1,k)+k)%n;  // +k to return the correct index in parent call and % used to
                                //simulate circular nature

    }
}
