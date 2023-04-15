package application;

public class ConvertGrade {

	public double gradeConvertion(String grade) {
		double gradePoint=0;
		
		if(grade=="A"){
			gradePoint=4.00;
		}
		else if(grade=="A-"){
			gradePoint=3.70;
		}
		else if(grade=="B+"){
			gradePoint=3.30;
		}
		else if(grade=="B"){
			gradePoint=3.00;
		}
		else if(grade=="B-"){
			gradePoint=2.70;
		}
		else if(grade=="C+"){
			gradePoint=2.30;
		}
		else if(grade=="C"){
			gradePoint=2.00;
		}
		else if(grade=="C-"){
			gradePoint=1.70;
		}
		else if(grade=="D+"){
			gradePoint=1.30;
		}
		else if(grade=="D"){
			gradePoint=1.00;
		}
		else if(grade=="F"){
			gradePoint=0.00;
		}
		
		return gradePoint;
	}
}
