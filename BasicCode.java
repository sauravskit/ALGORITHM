// Java programs to count character occurrences in a string
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Map<Character, Integer> counts = new HashMap<>();
        String str = "Hhello world";
         for(char c : str.toCharArray())
         {
             counts.put(c,counts.getOrDefault(c,0)+1);
         }
        for(Map.Entry<Character, Integer> entry : counts.entrySet()){
            
                System.out.println(entry.getKey() + ": " + entry.getValue());
            
        }

    }
    
}
or int[] charCounts = new int[256]; // Assuming ASCII characters

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCounts[c]++;
        }

        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0) {
                System.out.println((char) i + ": " + charCounts[i]);
            }
        }
----------------------------------------------------------using java stream----------------

        String input = "example"; // Example input string

        // Convert the string into a character array
        char[] charArray = input.toCharArray();

        // Using Stream API to count occurrences of each character
        Map<Character, Integer> charCountMap = Arrays.stream(charArray)
            .boxed() // Convert primitive char to Character
            .collect(Collectors.groupingBy(c -> c, Collectors.summingInt(c -> 1)));

        // Print the result
        charCountMap.forEach((character, count) -> 
            System.out.println(character + ": " + count));

    or use  for(Map.Entry<Character, Integer> entry : counts.entrySet()){
            
                System.out.println(entry.getKey() + ": " + entry.getValue());
            
        }
    }
}
--------------------------------------------------
        String input = "stream example";

        // Count the occurrence of each character
        Map<Character, Long> charCountMap = input.chars()
            .mapToObj(c -> (char) c) // Convert int to Character
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the result
        charCountMap.forEach((character, count) -> 
            System.out.println(character + ": " + count));
    }
}

------------------------------------------------------------
   
}

