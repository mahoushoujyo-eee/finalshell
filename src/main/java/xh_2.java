import javax.swing.SwingUtilities;

class xh_2 extends Thread {
   final KC O;

   xh_2(KC var1) {
      this.O = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep((long)com.c.c(341137764522313600L).getInt(com.c.c(489572751534480599L).get(com.c.c(634156811479991088L).get(this))));
      } catch (InterruptedException var3) {
         var3.printStackTrace();
      }

      try {
         if (!com.c.c(532071324274744951L).getBoolean(com.c.c(489572751534480599L).get(com.c.c(634156811479991088L).get(this)))) {
            SwingUtilities.invokeLater(new bv_4(this));
         }
      } catch (InterruptedException var2) {
         throw a(var2);
      }
   }

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }
}





