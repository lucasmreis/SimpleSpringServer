package simpleServer;

import java.util.ArrayList;

public class SimpleModel {
	public final int id;
	public final String name;
	public ArrayList<String> dogs;

	public SimpleModel(String name) {
		this.id = 1;
		this.name = name;
		this.dogs.add("Cotton");
		this.dogs.add("Pretinha");
	}
}