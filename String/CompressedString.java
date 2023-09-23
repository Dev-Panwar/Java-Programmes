public class CompressedString {
    public static String getCompressedString(String input) {
        if (input == null){
        	return null;
        }
        if (input.length() == 0){
        	return "";
        }
        // Variables to iterate the string and keep the count of the current character.
        int startIndex = 0;
        int endIndex = 0;
        // Resultant string.
        String compressedString = "";
        // Iterate all the characters of the string.
        while (startIndex < input.length()) {
            while ((endIndex < input.length()) && (input.charAt(endIndex) == input.charAt(startIndex))) {
            	endIndex += 1;
            }
            int totalCharCount = endIndex - startIndex;
            // If count is greater than 1, then append count to the string, else onlycharacter.
            if (totalCharCount != 1) {
            	compressedString += (input.charAt(startIndex) + "" + totalCharCount);
            }
            else {
            	compressedString += input.charAt(startIndex);
            }
            startIndex = endIndex;
        }
        return compressedString;
    }

    public static void main(String[] args){
        String xyz="aaaabbbbbbcccc";
        System.out.println(getCompressedString(xyz));
    }
}
