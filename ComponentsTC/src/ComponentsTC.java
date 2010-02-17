import totalcross.io.IOException;
import totalcross.ui.Button;
import totalcross.ui.Check;
import totalcross.ui.ComboBox;
import totalcross.ui.Edit;
import totalcross.ui.Grid;
import totalcross.ui.Label;
import totalcross.ui.MainWindow;
import totalcross.ui.Radio;
import totalcross.ui.RadioGroupController;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;
import z.af;

public class ComponentsTC extends MainWindow {

	public void initUI() {

		Button saveButton = new Button("Salvar");
		add(saveButton, RIGHT - 2, TOP + 2, PREFERRED + 5, PREFERRED + 5);

		Button saveButton2 = null;
		try {
			saveButton2 = new Button(new Image("save.png"));
		} catch (ImageException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		add(saveButton2, BEFORE - 2, SAME, PREFERRED + 5, PREFERRED + 5);

		Button saveButton3 = null;

		try {
			saveButton3 = new Button("Salvar", new Image("save.png"), TOP, 2);
		} catch (ImageException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		add(saveButton3, BEFORE - 2, SAME, PREFERRED + 5, PREFERRED + 5);

		Edit editNormal = new Edit();
		add(editNormal, LEFT + 2, AFTER + 5);

		// CEP: 99999-999
		Edit cepEdit = new Edit("99999-999");
		cepEdit.setMode(Edit.NORMAL, true);
		cepEdit.setValidChars("0123456789");

		add(cepEdit, SAME, AFTER + 2);

		Label label1 = new Label("Olá Mundo com o TC!", RIGHT);
		add(label1, LEFT + 2, AFTER + 2, FILL - 2, PREFERRED);
		// label1.setMarqueeText(label1.getText(), 100, -1, 10);

		ComboBox estadoCivilComboBox = new ComboBox(new String[] { "Casado",
				"Solteiro", "Divorciado" });
		add(estadoCivilComboBox, LEFT + 2, AFTER + 2);

		Label sexoLabel = new Label("Sexo:");
		add(sexoLabel, LEFT + 2, AFTER + 2);

		RadioGroupController controller = new RadioGroupController();
		Radio masculinoRadio = new Radio("Masculino", controller);
		Radio femininoRadio = new Radio("Feminino", controller);

		add(masculinoRadio, AFTER + 2, CENTER_OF);
		add(femininoRadio, AFTER + 2, SAME);

		Check check1 = new Check("Java");
		add(check1, LEFT + 2, AFTER + 2);

		Check check2 = new Check("TotalCross");
		add(check2, AFTER + 2, SAME);

		Grid grid = new Grid(new String[] { "Coluna1", "Coluna2", "Coluna3" },
				new int[] {0, -20, -30 }, new int[] { LEFT, RIGHT, CENTER },
				false);
		add(grid, LEFT + 2, AFTER + 2, FILL - 2, FILL - 2);

		grid.add(new String[] { "valor1", "valor2", "valor3" });
		grid.add(new String[] { "valor1", "valor2", "valor3" });
		grid.add(new String[] { "valor1", "valor2", "valor3" });
		

	}
}
