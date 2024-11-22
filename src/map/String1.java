package map;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "This is a simple sentence for testing";
        String result = reverseShortWords(sentence);
        System.out.println(result);
    }

    public static String reverseShortWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() < 5) {
                result.append(new StringBuilder(word).reverse().toString());
            } else {
                result.append(word);
            }
            result.append(" ");
        }

        // Remove the trailing space
        return result.toString().trim();

	}

}
