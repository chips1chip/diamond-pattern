public class Diamond {
    public static void main(String[] args) {
        int maxStars = 5; 
        int currentStars = maxStars;
        for(int row = 0; row < maxStars / 2; row++) { // Upper half of the diamond
            for(int space = row; space < maxStars / 2; space++) 
                System.out.print(" "); // Spaces before stars
            for(int star = 0; star < 2 * row + 1; star++) 
                System.out.print("*"); // Printing stars
            System.out.println();
        }
        for(int row = 0; row <= maxStars / 2; row++) { // Lower half of the diamond
            for(int space = 0; space < row; space++) 
                System.out.print(" "); // Spaces before stars
            for(int star = 1; star <= currentStars; star++) 
                System.out.print("*"); // Printing stars
            currentStars -= 2; // Decrease the number of stars for next row
            System.out.println();
        }
    }
}
