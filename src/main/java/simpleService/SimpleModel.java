package simpleServer;

import java.util.ArrayList;

public class SimpleModel {
	private final int id;
	private final String name;

	public SimpleModel(String name) {
		this.id = 1;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}
}