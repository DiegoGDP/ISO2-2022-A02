package release;

import Presentation.UI_Login;
import it2_package.Presentation.*;
import Presentation.UI_Campaign;
import Presentation.UI_Patient;
import com.iso_project.Iteration6.Presentation.*;


public class App {
	public static void main(String [] args) {
		System.out.println("Welcome!");
		UI_Login login = new UI_Login();
		UI_Disease ui_disease = new UI_Disease();
		UI_Patient ui_patient = new UI_Patient();
		UI_Virus ui_virus = new UI_Virus();
		UI_Statistics ui_statistics = new UI_Statistics();
	}
}
