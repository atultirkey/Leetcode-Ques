import java.util.*; 
 
class CardGameUnique { 
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of cards:"); 
             int n = sc.nextInt();
                 sc.nextLine();
                  
                  
 
        HashMap<String, Integer> hashMap = new HashMap<>(); 
 
        for (int i = 0; i < n; i++) { 
            System.out.println("Enter a card :"); 
            String key = sc.nextLine(); 
 
            int value = sc.nextInt(); 
            sc.nextLine();  
        } 
 
        System.out.println("Unique Cards:");
        for (String key : hashMap.keySet()) { 
            int firstValue = hashMap.get(key); 
            System.out.println(key + " " + firstValue); 
        } 
	 	System.out.println("Atul Tirkey 21BCS5094"); 
    } 
} 
