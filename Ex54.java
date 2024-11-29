package bookExercises;

import javax.swing.JOptionPane;

public class Ex54 {

	public static void main(String[] args) {

		String[] daysWeek = { "Sunday", "Monday", "Tuesday", "Wednesday ", "Thursday ", "Friday", "Saturday" };

		Double[] temperatures = new Double[7];

		Double averageTemperature, sum = 0.0;

		String userAnswer;

		do {

			for (int i = 0; i < temperatures.length; i++) {

				temperatures[i] = Double
						.parseDouble(JOptionPane.showInputDialog(null, "Enter the temperature for " + daysWeek[i]));

				sum += temperatures[i];
			}

			averageTemperature = sum / temperatures.length;

			JOptionPane.showMessageDialog(null, "Average temperature of the week: " + Math.round(averageTemperature));

			userAnswer = JOptionPane.showInputDialog("Do You Want To Continue? (yes/no)");

			userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

	}

}
