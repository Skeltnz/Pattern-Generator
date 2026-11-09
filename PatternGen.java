//Arseniy Ignatyev Pattern Gen
public class PatternGen{
    
    public static void stars(int rows){
        
        String star = "*";
        
        while(rows<=7)
        {
            String line = star.repeat(rows);
            System.out.println(line);
            rows+=1;
        }
        
    }
    public static void digits(int rows){
        
        int dig = 1;
        
        while(rows<=9)
        {
            String line = String.valueOf(dig);
            System.out.println(line.repeat(rows));
            rows+=1;
            dig+=1;
        }
        
    }
    public static void odds(int start){
        start = 9;
        
        while(start>=1)
        {
            if((start%2)==1){
                String line = String.valueOf(start);
                System.out.println(line.repeat(start));
                start-=1;
            }
            else{
                start-=1;
            }
        }
        
        
    }
    public static String swap(String a){
        return a.equals("O") ? "E" : "O";
    }

    public static void eo(int maxE){
        String symbol = (maxE % 2 == 0) ? "O" : "E";
        int start = 1;

        while(start<maxE){
            System.out.println(symbol.repeat(start));
            start+=1;
            symbol = swap(symbol);
        }
        while(start>=1)
        {
            if(start>0){
                
                    
                System.out.println(symbol.repeat(start));
                start-=1;
                symbol = swap(symbol);
                
                  
                }
            }
        }
    
    public static void pyramid(int rows) {

        for (int i = 1; i <= rows; i++) {
    
            for (int j = 0; j < i - 1; j++) {

                System.out.print(" ");
            }
        
            for (int j = 0; j < 2 * (rows - i) + 1; j++) {

                System.out.print(i);
            }
        
        System.out.println();
        }
    }

    
    public static void main(String[] args) {
        stars(1);
        digits(1);
        odds(9);
        eo(6);
        pyramid(5);
    }
    
}
