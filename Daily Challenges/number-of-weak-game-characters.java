// You are playing a game that contains multiple characters, and each of the characters has two main properties: attack and defense. You are given a 2D integer array properties where properties[i] = [attacki, defensei] represents the properties of the ith character in the game.

// A character is said to be weak if any other character has both attack and defense levels strictly greater than this character's attack and defense levels. More formally, a character i is said to be weak if there exists another character j where attackj > attacki and defensej > defensei.

// Return the number of weak characters.

class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
         // if we sort only by 1st indexes, there could be values where 1st index is the same 
        // Arrays.sort(properties, (a,b) -> Integer.compare(a[0], b[0]));
        
        // b[1], a[1] because we need the 2nd values in descending order
        Arrays.sort(properties, (a,b) -> (a[0] == b[0]) ? Integer.compare(b[1], a[1]) : 
                    
        Integer.compare(a[0], b[0]));
        
        int noOfWeakCharacters = 0;
        int len = properties.length;
       // improvization here - // we need to keep track of the max value
        int max = properties[len-1][1];
        
        for(int i = len-2; i>=0 ;i--) {
            
            if(properties[i][1] < max) {
                noOfWeakCharacters++;
            } else {
                max = properties[i][1];
            }
        }
        return noOfWeakCharacters;
    }
}
