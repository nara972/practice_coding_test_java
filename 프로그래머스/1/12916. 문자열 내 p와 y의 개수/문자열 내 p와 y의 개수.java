class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String[] strArr = s.toLowerCase().split("");
        
        int countp = 0;
        int county = 0;
        
        for(int i=0; i<strArr.length; i++){
            if("p".equals(strArr[i])){
                countp++;
            }else if("y".equals(strArr[i])){
                county++;
            }
        }
        
        if(countp != county){
            return false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return true;
    }
}