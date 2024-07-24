package Selenium;
import java.util.List;
import java.util.ArrayList;
public class ABC {
 public static void main(String[] args) {
 char initialValue = 'f';
 char currentValue = initialValue;

 List<Character> alphabets = new ArrayList<>();
 for (char c = 'a'; c <= 'z'; c++) {
 alphabets.add(c);
 }
 do {
 // Print the current value
 System.out.println("Current Value: " + currentValue);
 // Find the index of the current value
 int currentIndex = alphabets.indexOf(currentValue);

 // Calculate the next index
 int nextIndex = (currentIndex + 1) % alphabets.size();
 // Get the next alphabet from the list
 char nextValue = alphabets.get(nextIndex);
 // Update the current value
 currentValue = nextValue;
 } while (currentValue != initialValue);
 }
}