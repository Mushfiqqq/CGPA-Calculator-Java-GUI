package application;

import javafx.scene.control.ComboBox;

public class Credits {

	public ComboBox credits() {
		
		ComboBox combobox21=new ComboBox();
		
		combobox21.getItems().add("3.0");
		combobox21.getItems().add("1.5");
		combobox21.getItems().add("1.0");
		combobox21.getItems().add("0.0");
		
		combobox21.setPromptText("Choose Credits");
		return combobox21;
	}
}
