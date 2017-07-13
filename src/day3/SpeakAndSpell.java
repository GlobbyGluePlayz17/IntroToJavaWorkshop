package day3;

import javax.swing.JOptionPane;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell Mandelbrot"
		String word;
		word = "anacolathon";
		speak(word);
		// 2. Catch the user's answer in a String
		String answer;
		answer = JOptionPane.showInputDialog("Spell the word you heard...");

		// 3. If the user spelled the word correctly, speak "correct"
		if(answer.equals(word)){
			JOptionPane.showMessageDialog(null, "Correct! :)");
			String word2;
			word2 = "keratectomy";
			speak(word2);
			answer = JOptionPane.showInputDialog("Spell the word you heard...");
			if(answer.equals(word2)){
				JOptionPane.showMessageDialog(null, "Correct! :)");
			}
			else {JOptionPane.showMessageDialog(null, "Wrong! You failed level 2!!! :(");
			}
		}

		// 4. Otherwise say "wrong"
			else {JOptionPane.showMessageDialog(null, "Wrong! You failed level 1!!! XP");
		}

		// 5. repeat the process for other words
			
		}

	private static void speak(String word) {
		// TODO Auto-generated method stub
		
	}
	}