public class App {
    public static void main(String[] args) throws Exception {
        int count = 1;
        while (count < 6){
            int checkNumber = 1;
            while(checkNumber <= count) {
                System.out.print(count);
                checkNumber++;
            }
            System.out.println();
            count++;
        }        
    }
}
