package C13_Thread;

public class ThreadEx9 {
	public static void main(String[] args) throws Exception{
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		ThreadGroup grp1 = new ThreadGroup("G1");
		ThreadGroup grp2 = new ThreadGroup("G2");
		
		ThreadGroup subGrp1 = new ThreadGroup(grp1, "SubG1");
		
		grp1.setMaxPriority(3);
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {}
			}
		};
		
		new Thread(grp1, r, "th1").start();
		new Thread(subGrp1, r, "th2").start();
		new Thread(grp2, r, "th3").start();
		
		System.out.println(">>List of ThreadGroup : " + main.getName() + ", Active ThreadGroup : " + main.activeGroupCount() + ", Active Thread : " + main.activeCount());
		main.list();
	}
}