class SyncThread implements Runnable{
  public boolean isWaitingThread;
  public SyncClass syncObject;
  public SyncThread( boolean isWaitingThread, SyncClass syncObject )
    { this.isWaitingThread = isWaitingThread; this.syncObject = syncObject; }
  public void run(){
    if(isWaitingThread == true)
      syncObject.doWait();
    else
      syncObject.doNotify();
  }
}
class SyncClass{
  synchronized public void doWait() {
    System.out.println("Before wait in doWait");
    try { wait(); } catch (Exception e) {}
    System.out.println("After wait in dowait"); }
  synchronized public void doNotify() {
    System.out.println("Before notify in doNotify");
    notify();
    System.out.println("After notify in doNotify");
   }
}
public class Welcome{
  public static void main(String[] args){
    SyncClass syncObject = new SyncClass();
    Thread waitThread = new Thread(new SyncThread(true, syncObject));
    Thread notifyThread = new Thread(new SyncThread(false, syncObject));
    waitThread.start();
    try{ Thread.sleep(1000); } catch (Exception e) {}
    notifyThread.start();
    }
}
