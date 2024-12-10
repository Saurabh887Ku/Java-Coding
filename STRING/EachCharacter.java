public class EachCharacter {
    public static void main(String[] args){
        String str = "aabb a b c d ba c a";
        
        int []arr = new int[256];
        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)]++;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0 && arr[i] != ' ')
                System.out.println((char)i+" "+arr[i]);
        }
    }
}
