package application;

import javafx.scene.control.ComboBox;

public class Grade {

	public ComboBox grade() {
		
		ComboBox combobox31=new ComboBox();
		
		combobox31.getItems().add("A");
		combobox31.getItems().add("A-");
		combobox31.getItems().add("B+");
		combobox31.getItems().add("B");
		combobox31.getItems().add("B-");
		combobox31.getItems().add("C+");
		combobox31.getItems().add("C");
		combobox31.getItems().add("C-");
		combobox31.getItems().add("D+");
		combobox31.getItems().add("D");
		combobox31.getItems().add("F");
		
		combobox31.setPromptText("Select Grade");
		return combobox31;
		
	}
}
