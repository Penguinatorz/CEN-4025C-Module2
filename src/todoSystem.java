import java.util.ArrayList;
/**
 * 
 * @author Jancarlo Sevilla
 * todoSystem class this runs all the parameters needed to pass and retrieve todo items into an arraylist
 */
public class todoSystem {

	private ArrayList<String> todoList = new ArrayList<String>();
	private String addPassing;
/**
 * 
 * geToDo is a method just to check if the list is being added.
 */
	public void getToDo() {
		System.out.println(todoList);
	}
/**
 * incrementToDo is just a simple method to differentiate added to-do item 
 * @param todo is the passing String given from the todoInput class
 * @return this method return an update String of the user input.
 */
	public String incrementToDo(String todo) {
		addPassing = ">> ' " + todo + " '";
		return addPassing;
	}
/**
 * addToDo method is a simple method calling the incrementToDo adding in more items to the user inputted string
 * @param todo user input retrieve from todoInput class
 * @return the update string
 */
	public boolean addToDo(String todo) {
		return todoList.add(incrementToDo(todo));
	}
/**
 * deleteToDo is a simple method that deletes the inputted index
 * @param index is retrieved from todoInput
 * @return deletes the inputted todolist
 */
	public boolean deleteToDo(int index) {
		return todoList.remove(index) != null;
	}
/**
 * todoCheck makes use of the deleteToDo method and verifies if the retrieve user input is valid
 * 
 * @param index retrieved from todoInput class
 * @return update on deleted index
 */
	public boolean todoCheck(int index) {
		if (index >= 0 && index < todoList.size()) {
			deleteToDo(index);
			System.out.println("The item " + index + " of the to-do has been deleted");
			return true;
		} else {
			System.out.println("The to-do item list is empty or the entered to-do to delete is invalid");
			return false;
		}
	}
/**
 * todoView is a void method that simply checks if the todoList is empty and if not prints out each index in a loop.
 */
	public void todoView() {
		if(todoList.isEmpty())
		{
			System.out.println("The to-do item list is empty\n"
					+ "Try adding an item.");
		}
		else {
			for(int i = 0; todoList.size() > i; i++)
			{
				System.out.println(todoList.get(i));
			}
		}
	}
	
}
