import javax.swing.SwingUtilities;

class ax_2 extends Thread {
   final TM i;

   ax_2(TM var1) {
      this.i = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep((long)com.c.c(506455871704714368L).getInt(com.c.c(123645524365861271L).get(com.c.c(167340028826152955L).get(this))));
      } catch (InterruptedException var3) {
         var3.printStackTrace();
      }

      try {
         if (!com.c.c(281199022400540961L).getBoolean(com.c.c(123645524365861271L).get(com.c.c(167340028826152955L).get(this)))) {
            SwingUtilities.invokeLater(new Tw_2(this));
         }
      } catch (InterruptedException var2) {
         throw a(var2);
      }
   }

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }
}





