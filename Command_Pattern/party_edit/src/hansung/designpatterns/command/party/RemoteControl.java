package hansung.designpatterns.command.party;

import java.util.Stack;

//
// This is the invoker
//
public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Stack<Command> stack = new Stack<Command>();
 
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
 
		Command noCommand = new NoCommand();
		for(int i=0;i<7;i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
  
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		stack.push(onCommands[slot]);
	}
 
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		stack.push(offCommands[slot]);
	}

	public void undoButtonWasPushed() {
		if(stack.empty()){
			System.out.println("Stack is empty!");
		}else {
			stack.pop().undo();
		}
	}
 
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		int i=0;
		for (i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot"+i+"]"+"( " + 2*i + ") " + onCommands[i].getClass().getName()
				+ "      \t" + "( " + (2*i+1) + ") "+offCommands[i].getClass().getName() + "\n");
		}
		if(stack.empty()){
			stringBuff.append("[undo] ("+2*i+") stack is empty!" + "\n");
		}else {
			stringBuff.append("[undo] ("+2*i+") " + stack + "\n");
		}
		return stringBuff.toString();
	}
}
