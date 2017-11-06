public class Checked1 implements Runnable{
    public void run(){
        System.out.println("new method run for implements Runnable interface");
    }
    public static void main (String[] args){
        Thread t = new Thread (new Checked1());
        t.run();
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            System.out.println ("we catch InterruptedException");
        }
    }

}
