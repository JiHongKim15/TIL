package virus;

public class CoronaThreadSync extends Thread{
	Cell cell;
	
	public CoronaThreadSync(Cell cell) {
		this.cell = cell;
	}
	
	@Override
	public void run() {
		synchronized(cell) {
			if(cell.power<100) {
				try {
					cell.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if(cell.power >= 100) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				cell.power -= 100;
			}
		}
		System.out.println("CoronaThreadSync: "+cell.power);
	}
}
