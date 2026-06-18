class Solution {
    public String minWindow(String s, String t) {
        int l=0,r=0;
        int minlen=Integer.MAX_VALUE;
        int count=0;
        int stindex=-1;
        HashMap<Character,Integer> Mpp=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            Mpp.put(c,Mpp.getOrDefault(c,0)+1);}
            while(r<s.length()){
                char ch=s.charAt(r);
                if(Mpp.getOrDefault(ch,0)>0) count=count+1;
                Mpp.put(ch,Mpp.getOrDefault(ch,0)-1);
                while(count==t.length()){
                    if(r-l+1<minlen){
                        minlen=r-l+1;
                        stindex=l;
                    }
                    // shrinking logic
                    char leftchar=s.charAt(l);
                    Mpp.put(leftchar,Mpp.getOrDefault(leftchar,0)+1);
                    if(Mpp.get(leftchar)>0) count--;
                    l++;
                }
                r++;
            }
        
        return stindex==-1?"":s.substring(stindex,stindex+minlen);}}
        
