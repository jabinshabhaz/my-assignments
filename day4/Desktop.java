package assignment.day4;

	public class Desktop extends Computer{
	    public void desktopSize(){
	        System.out.println("Desktop size");
	    }

	    public static void main(String[] args) {
	        Desktop computer = new Desktop();
	        //Single inheritance
	        computer.computerModel();
	        computer.desktopSize();
	    }
	}


