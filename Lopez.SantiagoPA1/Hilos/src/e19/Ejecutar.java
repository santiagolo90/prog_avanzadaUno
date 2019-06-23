package e19;

public class Ejecutar extends Thread {
	private Boolean stop = Boolean.FALSE;
	private Boolean pause = Boolean.FALSE;;

	
	@Override
	public void run() {
		while(true) {
			if(Boolean.TRUE.equals(stop)) {
				System.out.println("se mató el hilo");
				Thread.currentThread().interrupt();
				
				return;
			}
			if(Boolean.TRUE.equals(pause)) {
				synchronized (this) {
					try {
						System.out.println("se pauso el hilo");
						//Thread.currentThread().wait();
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}

	}
	
	public void StopThread(){
		this.stop = Boolean.TRUE;
	}
	public void pauseThread(){
		this.pause = Boolean.TRUE;
	}
	public void resumeThread(){
		this.pause = Boolean.FALSE;
		synchronized (this) {
			System.out.println("se reanudo el hilo");
			this.notify();
		}
	}

}
