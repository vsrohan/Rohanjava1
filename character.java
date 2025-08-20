package CharacterFrequency;
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

	public static Map<Character, Integer> getCharFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (c == ' ') continue;
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
	}

    public static void main(String[] args) {
        String text = "hello world";

        Map<Character, Integer> freq = getCharFrequency(text);

        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
