class SyncThread implements Runnable{
  public boolean isWaitingThread;
  public SyncClass syncObject;
  public SyncThread( boolean isWaitingThread, SyncClass syncObject )
    { this.isWaitingThread = isWaitingThread; this.syncObject = syncObject; }
  public void run(){
    if(isWaitingThread == true)
      while(true)
        syncObject.get();
        System.out.println("Get " + syncObject.get());
    // else{
      int i = 0;
      while(true){
        System.out.println("Set " + i);
        syncObject.set(i);
        i++;
      }
  }
}

class SyncClass{
  public int buffer;
  public boolean bufferFilled = false;
  synchronized public void set (int value){
    if(this.bufferFilled == true)
      try { wait(); } catch (Exception e) {}
    else{
      this.buffer = value; this.bufferFilled = true;
      System.out.println("Set " + this.buffer);
      notify();
    }
  }

  synchronized public int get(){
    int returnedValue = 0;
    if(this.bufferFilled == false)
      try{wait();} catch (Exception e) {}
    //else {
      this.bufferFilled = false;
      returnedValue = this.buffer;
      System.out.println("Get " + this.buffer);
      notify();
      return returnedValue;
  }

public class Welcome{
  public void main(String[] args){
    SyncClass syncObject = new SyncClass();
    Thread waitThread = new Thread(new SyncThread(true, syncObject));
    Thread notifyThread = new Thread(new SyncThread(false, syncObject));
    waitThread.start();
    // try{ Thread.sleep(1000); } catch (Exception e) {}
    notifyThread.start();
    }
  }
}
