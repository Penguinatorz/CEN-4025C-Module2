
public class todoFacade {

	private boolean looper = false;

	todoSystem todoList;
	todoInput input;

	todoWelcome welcome;

	public todoFacade() {
		todoList = new todoSystem();
		input = new todoInput();
	}

	public void todoSwitch() {
		do {
			welcome = new todoWelcome();
			int userInputted = input.userInputCase();
			switch (userInputted) {
			case 1:
				System.out.println("Choice 1 has been Selected "
						+ "- Add a to-do item.");
				todoList.addToDo(input.userInputString());
				break;
			case 2:
				System.out.println("Choice 2 has been Selected "
						+ "- Delete a to-do item (item numbering starts at 0)");
				todoList.todoCheck(input.userInputInt());
				break;
			case 3:
				System.out.println("Choice 3 has been Selected "
						+ "- Viewing item list");
				todoList.todoView();
				break;
			case 4:
				System.out.println("Choice 4 has been selected\n"
						+ "Exiting...");
				looper = true;
				break;
			}
		} while (looper == false);
	}

}
