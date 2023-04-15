package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import java.text.DecimalFormat;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		//Label
		
		Label label0=new Label("CGPA Calculator");
		
		Label label1=new Label("Name: ");
		Label label2=new Label("ID: ");
		
		Label label3=new Label("Course");
		Label label4=new Label("Credit");
		Label label5=new Label("Grade");
		Label label11=new Label(" ");
		
		Label label6=new Label("Course 1:");
		Label label7=new Label("Course 2:");
		Label label8=new Label("Course 3:");
		Label label9=new Label("Course 4:");
		Label label10=new Label("Course 5:");
		
		
		//TextField
		
		TextField textfield1=new TextField();
		TextField textfield2=new TextField();
		
		
		//Line
		
		Line line1 = new Line(0, 0, 1000, 0);
		Line line2 = new Line(0, 0, 1000, 0);

		
		//Action Button

		Button button1=new Button("CALCULATE");
		
		
		//Font & Button Size
		
		label0.setFont(new Font(40));
		button1.setFont(new Font(25));
		button1.setMinSize(200, 80);
		
		
		//Bold 
		label0.setStyle("-fx-font-weight: bold;");
		label1.setStyle("-fx-font-weight: bold;");
		label2.setStyle("-fx-font-weight: bold;");
		label3.setStyle("-fx-font-weight: bold;");
		label4.setStyle("-fx-font-weight: bold;");
		label5.setStyle("-fx-font-weight: bold;");
		label6.setStyle("-fx-font-weight: bold;");
		label7.setStyle("-fx-font-weight: bold;");
		label8.setStyle("-fx-font-weight: bold;");
		label9.setStyle("-fx-font-weight: bold;");
		label10.setStyle("-fx-font-weight: bold;");

		button1.setStyle("-fx-font-weight: bold;");
		
		
		//ComboBox Objects
		
		Course obj1=new Course();
		
		Credits obj2=new Credits();
		
		Grade obj3=new Grade();
	
		
		//HBox && VBox
		
		HBox hbox10=new HBox(label0);
		
		HBox hbox1= new HBox(20,label1, textfield1, label2, textfield2);  
		
		HBox hbox2=new HBox(button1);
		
		
		VBox vbox1=new VBox(40, label11, label6, label7, label8, label9, label10);
		
		ComboBox combobox11=obj1.course();
		ComboBox combobox12=obj1.course();
		ComboBox combobox13=obj1.course();
		ComboBox combobox14=obj1.course();
		ComboBox combobox15=obj1.course();
		VBox vbox2=new VBox(30, label3, combobox11, combobox12, combobox13, combobox14, combobox15);
		
		
		ComboBox combobox21=obj2.credits();
		ComboBox combobox22=obj2.credits();
		ComboBox combobox23=obj2.credits();
		ComboBox combobox24=obj2.credits();
		ComboBox combobox25=obj2.credits();
		VBox vbox3=new VBox(30, label4, combobox21, combobox22, combobox23, combobox24, combobox25);
		
		
		ComboBox combobox31=obj3.grade();
		ComboBox combobox32=obj3.grade();
		ComboBox combobox33=obj3.grade();
		ComboBox combobox34=obj3.grade();
		ComboBox combobox35=obj3.grade();
		VBox vbox4=new VBox(30, label5, combobox31, combobox32, combobox33, combobox34, combobox35);
	
		
		HBox hbox3=new HBox(100, vbox1, vbox2, vbox3, vbox4);
		
		
		VBox vbox=new VBox(40, hbox10, hbox1, line1, hbox3, line2, hbox2);
		
		
		//Alignment
		
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		hbox3.setAlignment(Pos.CENTER);
		hbox10.setAlignment(Pos.CENTER);
		
		vbox1.setAlignment(Pos.CENTER);
		vbox2.setAlignment(Pos.CENTER);
		vbox3.setAlignment(Pos.CENTER);
		vbox4.setAlignment(Pos.CENTER);
		vbox.setAlignment(Pos.CENTER);
		
		
		//Scene
		Scene scene = new Scene(vbox,1000,800);
		primaryStage.setScene(scene);
		primaryStage.setTitle("CGPA Calculator");
		primaryStage.show();  
		
		
		//Action Button's New Window
		button1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {

				//take input
				String name=textfield1.getText();
				String id=textfield2.getText();
				
				String course011=(String)combobox11.getSelectionModel().getSelectedItem();
				String course012=(String)combobox12.getSelectionModel().getSelectedItem();
				String course013=(String)combobox13.getSelectionModel().getSelectedItem();
				String course014=(String)combobox14.getSelectionModel().getSelectedItem();
				String course015=(String)combobox15.getSelectionModel().getSelectedItem();
				
				String credit021=(String)combobox21.getSelectionModel().getSelectedItem();
				String credit022=(String)combobox22.getSelectionModel().getSelectedItem();
				String credit023=(String)combobox23.getSelectionModel().getSelectedItem();
				String credit024=(String)combobox24.getSelectionModel().getSelectedItem();
				String credit025=(String)combobox25.getSelectionModel().getSelectedItem();
				
				String grade031=(String)combobox31.getSelectionModel().getSelectedItem();
				String grade032=(String)combobox32.getSelectionModel().getSelectedItem();
				String grade033=(String)combobox33.getSelectionModel().getSelectedItem();
				String grade034=(String)combobox34.getSelectionModel().getSelectedItem();
				String grade035=(String)combobox35.getSelectionModel().getSelectedItem();
				
				
				//Label
				
				Label label21=new Label("CGPA");
				Label label22=new Label("Name: ");
				Label label23=new Label("ID: ");
				Label label24=new Label(name);
				Label label25=new Label(id);
				
				Label label26=new Label("Course 1:");
				Label label27=new Label("Course 2:");
				Label label28=new Label("Course 3:");
				Label label29=new Label("Course 4:");
				Label label30=new Label("Course 5:");
				
				Label label31=new Label("");
				
				Label label32=new Label("Course");
				Label label33=new Label("Credit");
				Label label34=new Label("Grade");
				
				
				Label label011=new Label(course011);
				Label label012=new Label(course012);
				Label label013=new Label(course013);
				Label label014=new Label(course014);
				Label label015=new Label(course015);
				
				Label label021=new Label(credit021);
				Label label022=new Label(credit022);
				Label label023=new Label(credit023);
				Label label024=new Label(credit024);
				Label label025=new Label(credit025);

				Label label031=new Label(grade031);
				Label label032=new Label(grade032);
				Label label033=new Label(grade033);
				Label label034=new Label(grade034);
				Label label035=new Label(grade035);
				
				
				Label label40=new Label("Your CGPA:");
			
				
				//Font & Bold
				
				label21.setFont(new Font(50));
				label22.setFont(new Font(20));
				label23.setFont(new Font(20));
				label24.setFont(new Font(20));
				label25.setFont(new Font(20));
				label40.setFont(new Font(30));
				
				
				label21.setStyle("-fx-font-weight: bold;");
				label22.setStyle("-fx-font-weight: bold;");
				label23.setStyle("-fx-font-weight: bold;");
				label24.setStyle("-fx-font-weight: bold;");
				label25.setStyle("-fx-font-weight: bold;");
				
				label26.setStyle("-fx-font-weight: bold;");
				label27.setStyle("-fx-font-weight: bold;");
				label28.setStyle("-fx-font-weight: bold;");
				label29.setStyle("-fx-font-weight: bold;");
				label30.setStyle("-fx-font-weight: bold;");
				label32.setStyle("-fx-font-weight: bold;");
				label33.setStyle("-fx-font-weight: bold;");
				label34.setStyle("-fx-font-weight: bold;");
				
				label40.setStyle("-fx-font-weight: bold;");
				
				//Line
				Line line3 = new Line(0, 0, 1000, 0);
				Line line4 = new Line(0, 0, 1000, 0);
				
				
				//Grade Calculation
				
				double credit0021=Double.valueOf(credit021);
				double credit0022=Double.valueOf(credit022);
				double credit0023=Double.valueOf(credit023);
				double credit0024=Double.valueOf(credit024);
				double credit0025=Double.valueOf(credit025);
				
				double totalCredit;

				totalCredit= credit0021+credit0022+credit0023+credit0024+credit0025;
				
				ConvertGrade obj5=new ConvertGrade();
				double grade0031=obj5.gradeConvertion(grade031);
				double grade0032=obj5.gradeConvertion(grade032);
				double grade0033=obj5.gradeConvertion(grade033);
				double grade0034=obj5.gradeConvertion(grade034);
				double grade0035=obj5.gradeConvertion(grade035);
				
				
				double totalGradePoint= (credit0021*grade0031)+(credit0022*grade0032)+(credit0023*grade0033)+(credit0024*grade0034)+(credit0025*grade0035);
				
				double totalCgpa= totalGradePoint/totalCredit;
				
				DecimalFormat df= new DecimalFormat(".##");
				String cgpa=df.format(totalCgpa);
				
				Label label50=new Label(cgpa);
				label50.setFont(new Font(30));
				label50.setStyle("-fx-font-weight: bold;");
				
				
				//HBox & VBox
				
				HBox hbox11=new HBox(label21);
				HBox hbox12=new HBox(20,label22, label24, label23, label25);
				
				VBox vbox11=new VBox(40, label31, label26, label27, label28, label29, label30);
				VBox vbox12=new VBox(40, label32, label011, label012, label013, label014, label015);
				VBox vbox13=new VBox(40, label33, label021, label022, label023, label024, label025);
				VBox vbox14=new VBox(40, label34, label031, label032, label033, label034, label035);
								
				HBox hbox15=new HBox(140, vbox11, vbox12, vbox13, vbox14);
				
				HBox hbox16=new HBox(label40);
				HBox hbox17=new HBox(label50);
			
				VBox vbox20=new VBox(hbox16, hbox17);
				
				
				VBox vbox=new VBox(40,hbox11,hbox12, line3, hbox15, line4, vbox20);
				
				
				//Alignment
				
				hbox11.setAlignment(Pos.CENTER);
				hbox12.setAlignment(Pos.CENTER);
				hbox15.setAlignment(Pos.CENTER);
				hbox16.setAlignment(Pos.CENTER);
				hbox17.setAlignment(Pos.CENTER);
			
				vbox11.setAlignment(Pos.CENTER);
				vbox12.setAlignment(Pos.CENTER);
				vbox13.setAlignment(Pos.CENTER);
				vbox14.setAlignment(Pos.CENTER);
				vbox.setAlignment(Pos.CENTER);
				
				
				//Scene
				
				Scene scene = new Scene(vbox,1000,800);
				primaryStage.setScene(scene);
				primaryStage.setTitle("Your CGPA");
				primaryStage.show();  
				
			}
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}
