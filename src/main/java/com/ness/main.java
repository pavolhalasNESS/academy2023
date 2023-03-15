package com.ness;

import java.awt.Color;
import java.awt.Font;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageConverter;
import ij.process.ImageProcessor;

public class main {
	public static void main(String[] args) {
		ImagePlus image = IJ.openImage("C:\\Users\\P3503630\\eclipse-workspace\\academy2023\\assets\\springBoot.png");
		Font font = new Font("Arial", Font.BOLD, 25);

		ImageProcessor ip = image.getProcessor();
		ip.setColor(Color.RED);
		ip.setFont(font);
		ip.drawString("Approved by Pavol",300,50);
		image.show();
		new ImageConverter(image); 
		IJ.saveAs(image, "jpg", "C:\\Users\\P3503630\\eclipse-workspace\\academy2023\\output\\springBootEdited");
		
	}
}
