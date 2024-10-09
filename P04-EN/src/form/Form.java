package form;

import java.util.*;

public class Form {
	public void addField(Field field) {
		fields.add(field);
	}

	public void ask4Data() {
		for (Field campo : fields) {
			campo.ask4Data();
			System.out.println(campo.getData());
		}
	}
	
	public void writeForm () {
		System.out.println("\nFORM:");
		for (Field f : fields)
			System.out.println(f.getLabel() + ": " +f.getData());
	}

	private List<Field> fields = new ArrayList<>();
}
