import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

class TV implements WindowStateListener {
   final U l;
   private static final long[] a;
   private static final Integer[] b;

   TV(U var1) {
      this.l = var1;
   }

   @Override
   public void windowStateChanged(WindowEvent var1) {
      label18: {
         String[] var10000 = F8.y();
         int var3 = ((U)com.c.c(495029120157815251L).get(this)).getExtendedState();
         String[] var2 = var10000;
         if (var2 == null) {
            if (var3 != a(12628, 6223775070963769478L) && var3 != a(30406, 2574914611774318357L)) {
               break label18;
            }

            com.c.c(193840005716781234L).setLong(com.c.c(495029120157815251L).get(this), System.currentTimeMillis());
            com.c.c(597383034860606442L).setBoolean(com.c.c(495029120157815251L).get(this), true);
         }

         if (var2 == null) {
            return;
         }
      }

      com.c.c(597383034860606442L).setBoolean(com.c.c(495029120157815251L).get(this), false);
   }

   static {
      long var0 = 7260490875415661886L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ä\u0011Î\u0097\u00adØê,x\u009cw\u007f~§\u00ad¾";
      int var5 = "ä\u0011Î\u0097\u00adØê,x\u009cw\u007f~§\u00ad¾".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4563;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





