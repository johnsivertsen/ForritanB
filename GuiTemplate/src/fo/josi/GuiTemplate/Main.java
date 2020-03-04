package fo.josi.GuiTemplate;

public class Main {

    public static ArrayList<int> integerArray;

    public static void main(String[] args) {
	    // old form:
        IForm form = new Form();
        // new form:
        IForm layoutedForm = new LayoutedForm();

        layoutedForm.show();
    }
}
