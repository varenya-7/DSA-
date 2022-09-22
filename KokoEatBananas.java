class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        // 1 Pile == 1 hour 
        // arr.length <= hours
        // minimum bananas per hour to fullfil the given hour condition
        int max=Integer.MIN_VALUE;
        int sp=0;
        for(int i:piles){
            max= (int) Math.max(max , i);
        }
        int start= 0;
        int end = max;
        while(start <= end){
        int mid = start + (end -start) / 2;
            
            if(isPossible(piles , mid , h)){
                sp=mid;
                end = mid-1;
            }
            
            else{
                start=mid+1;
            }
    }
        return sp;
}
    
    
    
    
    public boolean isPossible(int[] piles , int mid, int h){
        int sum=0;
         for(int i=0;i< piles.length;i++){
            sum+=(int)Math.ceil(piles[i] * 1.0 / mid); 
    }
        return sum <= h;
}
    
}
