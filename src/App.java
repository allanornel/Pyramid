public class App {
    public static void main(String[] args) throws Exception {
        int count = 1;
        while (count < 6){
            int var = 1;
            while(var <= count) {
                System.out.print(count);
                var++;
            }
            System.out.println();
            count++;
        }        
    }
}
