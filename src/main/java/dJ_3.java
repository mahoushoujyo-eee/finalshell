import javax.swing.SwingUtilities;

class dJ_3 implements Runnable {
   final CE x;
   private static final long a;

   dJ_3(CE var1) {
      this.x = var1;
   }

   @Override
   public void run() {
      int[] var1 = CE.S();

      while (com.c.c(209317155687574257L).getBoolean(com.c.c(253496364775430961L).get(this))) {
         SwingUtilities.invokeLater(new gl_2(this));

         try {
            Thread.sleep(a);
         } catch (InterruptedException var3) {
            var3.printStackTrace();
            if (var1 == null) {
               break;
            }
         }
      }
   }

   static {
      long var0 = 6082190871435017201L;
      long var10002 = 6082190871435016709L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





