import java.util.HashSet;
class Solution {
    
    HashSet<Integer> set = new HashSet<>();
    
    public boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public void recursive(String comb,String others){
        
        if(!comb.isEmpty()){
            set.add(Integer.valueOf(comb));
        }
        
        for(int i=0;i<others.length();i++){
            recursive(comb+others.charAt(i),
                     others.substring(0,i)+others.substring(i+1));
        }
    }
    public int solution(String numbers) {
        recursive("",numbers);
        int cnt=0;
        for(int n:set){
            if(isPrime(n)) cnt++; 
        }
        return cnt;
    }
}