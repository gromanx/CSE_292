/***
* CSE292 - Fall 2019
* RandomSentences.java
* Purpose: Generates 20 random sentences using the random number generator and four arrays called: article, noun, verb, preposition.
*
* @author Gladys Roman
* @version 1.0 11/15/2019
*/

import java.security.SecureRandom; //library for generating random number 

public class RandomSentences {
	public static void main(String [] args) {
		//create 4 arrays where the given articles, nouns, verbs and prepositions will be stored
		String[] article = { "the", "a", "one", "some", "any" };
		String[] noun = { "boy", "girl", "dog", "town", "car" };
		String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
		String[] preposition = { "to", "from", "over", "under", "on" };
	
		SecureRandom random = new SecureRandom(); //for generating random numbers
	
		for(int i = 0 ; i < 20 ; i++) { //for loop to create the 20 random sentences
			int randArticle = random.nextInt(5); //using the number 5 because there are 5 elements in each array from index # 0-4
			int randNoun = random.nextInt(5);
			int randVerb = random.nextInt(5);
			int randPrep = random.nextInt(5);
			int randArticle2 = random.nextInt(5); //since there are 2 articles and 2 nouns in each sentence, we will generate 2 of each so as to not use the same one
			int randNoun2 = random.nextInt(5);
			
			//concatenate the sentence in the given form, with a period at the end
			String sentence = article[randArticle] + " " + noun[randNoun] + " " + verb[randVerb] + " " + preposition[randPrep] + " " + article[randArticle2] + " " + noun[randNoun2] + "."; 
	
			//make the first letter of each sentence uppercase
			String sentence2 = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);
			
			//output the final and completed sentence
			System.out.println(sentence2); 
			System.out.println();
		}
	}
}

