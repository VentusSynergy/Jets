package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	static List<Jet> jets = new ArrayList<>();

	public void jetList() {
		FileReader fr = null;
		String fileName = "jet.txt";


		try {
			fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String fileRead = br.readLine();
			
			while(fileRead != null) {
					String[] file = fileRead.split(", ");
					String tempModel = file[0];
					double tempSpeed = Double.parseDouble(file[1]);
					int tempRange = Integer.parseInt(file[2]);
					long tempPrice = Long.parseLong(file[3]);
					
					if(tempModel.charAt(0) == 70) {
						Jet tempObj = new FighterJet(tempModel, tempSpeed, tempRange, tempPrice);
						jets.add(tempObj);
						
						fileRead = br.readLine();
					}
					else if(tempModel.charAt(0) == 67) {
						Jet tempObj = new CargoPlane(tempModel, tempSpeed, tempRange, tempPrice);
						jets.add(tempObj);
						
						fileRead = br.readLine();
						
					}
					else if(tempModel.charAt(0) == 66) {
						Jet tempObj = new BasicJet(tempModel, tempSpeed, tempRange, tempPrice);
						jets.add(tempObj);
						
						fileRead = br.readLine();
						
					}
					
					
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void currentList(FighterJet f) {
		jets.add(f);
		System.out.println(jets);
		JetsApplication.displayUserMenu();
		
		
	}


	


    
}