package _04_practice._1_skill_practice;

import javax.swing.JOptionPane;

public class SpellCaster {
	public static void castExpectoPatronum()
	{
		System.out.println("EXPECTO PATRONUM!!");
	}
    public static void main(String[] args) {
		String totalDementors = JOptionPane.showInputDialog(null, "How many dementors are there?");
		int Dumbledore = Integer.parseInt(totalDementors);
		{
		for(int i = 0; i < Dumbledore; i++){
			castExpectoPatronum();
		}
		}
    }
}