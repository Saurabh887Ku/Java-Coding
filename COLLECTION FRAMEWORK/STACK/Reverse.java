import java.util.Stack;
import java.util.Scanner;
    public class Reverse{
        public static void main(String[] args){
            int[] arr = {10,20,30,40,50};
            Stack<Integer> s = new Stack<>();
            // for(int i=0; i<arr.length; i++){
            //     s.push(arr[i]);
            // }
            // while(!s.isEmpty()){
            //     System.out.println(s.peek());
            //     s.pop();
            // }
            for(int i:arr){
                s.push(i);
            }
            int size = s.size()/2;
            Stack<Integer> st = new Stack<>();
            while(!s.isEmpty()){
                if(s.peek()!=arr[size]){
                    st.push(s.pop());
                    
                }
                else{
                    s.pop();
                }
            }
            while(!st.isEmpty()){
                System.out.println(st.peek());
                st.pop();
            }
        }
    }
