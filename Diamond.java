public class Diamond {
    public static void main(String[] args) {
        int size = 5; 
        int temp = size;
        for(int x = 0; x < size/2 ;x++){
            for(int y = x; y < size/2 ;y++){
                System.out.print(" ");
            }
            for(int z = 0; z < 2 * x + 1 ; z++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0;i <= size/2 ; i++){
            for(int k = 0; k < i; k++){
                System.out.print(" ");
            }
            for(int j = 1;j <= temp ; j++){
                System.out.print("*");
            }
            temp -= 2;
            System.out.println();
        }
    }
}