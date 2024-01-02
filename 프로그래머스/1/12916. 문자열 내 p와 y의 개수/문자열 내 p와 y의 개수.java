class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int countp=0;
        int county=0;
        
        String[] array=s.toLowerCase().split("");
        
        for(int i=0; i<array.length; i++){
            if("p".equals(array[i])){
                countp++;
            }else if("y".equals(array[i])){
                county++;
            }
        }
        if(countp != county){
            return false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");

        return true;
    }
}