class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!countMap.containsKey(nums[i])) countMap.put(nums[i],0);
            {
                countMap.put(nums[i],countMap.get(nums[i])+1);
            }
        
        }
        Map<Integer,List<Integer>> reverseMap=new HashMap<>();
        for(int num:countMap.keySet())
        {
            int count=countMap.get(num);
            if(!reverseMap.containsKey(count)) reverseMap.put(count,new ArrayList<Integer>());
            {
                reverseMap.get(count).add(num);
            }
        }
      int[] result=new int[k];
      int index=0;
      for(int possibleCount=nums.length;possibleCount>=1;possibleCount--)
      {
        if(reverseMap.containsKey(possibleCount))
        {
            for(int n:reverseMap.get(possibleCount))
            {
                if(index<k)
                {
                    result[index++]=n;
                }
                else
                {
                    break;
                }
            }
        }
        if(index>=k){
            break;
        }
      }
      return result;


    }
}
