import javax.swing.JSplitPane;

class On_2 implements Runnable {
   final JSplitPane N;
   final CV v;

   On_2(CV var1, JSplitPane var2) {
      this.v = var1;
      this.N = var2;
   }

   @Override
   public void run() {
      int var1 = (int)((float)((JSplitPane)com.c.c(538664854951199242L).get(this)).getWidth() * 0.65F);
      ((JSplitPane)com.c.c(538664854951199242L).get(this)).setDividerLocation(var1);
   }
}





