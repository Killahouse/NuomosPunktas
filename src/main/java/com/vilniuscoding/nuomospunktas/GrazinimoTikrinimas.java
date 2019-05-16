package com.vilniuscoding.nuomospunktas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GrazinimoTikrinimas {
	
	public static void Tikrinimas() throws IOException {
		System.out.println("failai");
	BufferedReader skaitomasFailas1 = new BufferedReader(
			new FileReader("C:\\Users\\Vytautas\\eclipse-workspace\\NuomosPunktas\\Isnuomota.txt"));
	BufferedReader skaitomasFailas2 = new BufferedReader(
			new FileReader("C:\\Users\\Vytautas\\eclipse-workspace\\NuomosPunktas\\Grazinama.txt"));
	String eilute1 = skaitomasFailas1.readLine();
	String eilute2 = skaitomasFailas2.readLine();
	int eilutesNumeris = 1;
	boolean vienoda = true;

	while(eilute1!=null||eilute2!=null)
	{
		if (eilute1 == null || eilute2 == null) {
			vienoda = false;
			break;
		} else if (!eilute1.equalsIgnoreCase(eilute2)) {
			vienoda = false;
			break;
		}
		eilute1 = skaitomasFailas1.readLine();
		eilute2 = skaitomasFailas2.readLine();
		eilutesNumeris++;
	}if(vienoda)
	{
		System.out.println("Sugrazintas visas inventorius");
	}else
	{
		System.out.println("Ne viskas sugrazinta ");
		System.out.println("Paimta " + eilute1 + " Negrazinta " + eilute2 + " eilute " + eilutesNumeris);
	}
	skaitomasFailas1.close();
	skaitomasFailas2.close();
}
}
