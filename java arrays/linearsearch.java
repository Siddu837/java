

public class linearsearch {
    
    public static int linearnum(int num[], int key){

        for(int i = 0; i< num.length; i++){
            
            if(num[i]== key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String args[]){

        int num [] = { 2, 3, 5, 6, 4};
        int key = 3;
        int index = linearnum(num,key);
        if(num[index] == key){
        System.out.println("the index of the key "+ index);
        }
        else{
            System.out.println("key not found");
        }
    }
}
