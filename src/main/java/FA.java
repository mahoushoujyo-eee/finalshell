import javax.swing.SwingUtilities;

class FA implements Runnable {
   final CT o;
   private static final long a;

   FA(CT var1) {
      this.o = var1;
   }

   @Override
   public void run() {
      boolean var1 = Uo_2.i();

      while (com.c.c(392954843758135722L).getBoolean(com.c.c(591504459344043173L).get(this))) {
         SwingUtilities.invokeLater(new oj_4(this));

         try {
            Thread.sleep(a);
         } catch (InterruptedException var3) {
            var3.printStackTrace();
            if (var1) {
               break;
            }
         }
      }
   }

   static {
      long var0 = 8141341996293006600L;
      long var10002 = 8141341996293006588L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





