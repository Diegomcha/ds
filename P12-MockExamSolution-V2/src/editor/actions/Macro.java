package editor.actions;

import java.util.*;

import editor.Document;

public class Macro implements Action
{
	private String name;
	private List<Action> actions = new ArrayList<>();
	
	public Macro(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}

	public void addAction(Action action)
	{
		actions.add(action);
	}
	
	@Override
	public void execute(Document document) 
	{
		for (Action action : actions) {
			action.execute(document);
		}
	}

	@Override
	public String toString()
	{
		return "Macro " + name;
	}
}
