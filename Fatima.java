class Solution {
    public List<String> fizzBuzz(int n) {
        int numberMax = (int) Math.pow(10, 4);
        
        if(1<=n || n<=numberMax){
            List<String> answer = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            if(i%3==0 && i%5==0) {
                answer.add("FizzBuzz");
            } else if (i%5==0) {
                answer.add("Buzz");
            } else if (i%3==0 ) {
                answer.add("Fizz");
            }else {
                answer.add(""+ i +"");
            }
        }
        return answer;  
        }
        
        return null;
        
    }
}
