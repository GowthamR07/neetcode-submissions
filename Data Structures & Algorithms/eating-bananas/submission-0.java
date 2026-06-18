class Solution {
    public int func(int[] piles,int hourlyEatingRate){
        int sum=0;
        for(int banana:piles){
            sum+=(int)Math.ceil((double)banana/hourlyEatingRate);
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high;
        int maxi=piles[0];
        for(int pile:piles){
          maxi=Math.max(maxi,pile);
        }
        high=maxi;
        while(low<=high){
            int mid=(low+high)/2;
            int s=func(piles,mid);
            if(s<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
