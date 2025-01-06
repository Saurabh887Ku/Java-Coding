public class UniqueElementIs {
    public static boolean isUnique(int[] array){
        int n=array.length;
        for (int i = 0; i <array.length; i++) {
            for(int j=i+1; j<array.length; j++){
                if(array[i]==array[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 5};
        if(isUnique(array)){
            System.out.println("this is unique array");
        }
        else{
            System.out.println("this is not unique array");
        }

    }
}
