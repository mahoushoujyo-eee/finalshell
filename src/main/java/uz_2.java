import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Uz_2 implements MouseListener {
   final C_ t;
   final aM f;
   private static final long[] a;
   private static final Integer[] b;

   Uz_2(aM var1, C_ var2) {
      this.f = var1;
      this.t = var2;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      int var2 = a(11954, 7565056891482505379L);
      ((C_)com.c.c(632910963017384475L).get(this)).setForeground(new Color(var2, var2, var2));
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      ((C_)com.c.c(632910963017384475L).get(this))
         .setForeground(new Color(a(15197, 778928473408738638L), a(13236, 3136484287224126886L), a(12130, 7158988147851592050L)));
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   static {
      long var0 = 1395296470180665448L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "\u0099\u009aµÛo\u0016\u0018¯\u0000\u000615b\u0094\u0099\u008c";
      int var5 = "\u0099\u009aµÛo\u0016\u0018¯\u0000\u000615b\u0094\u0099\u008c".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "Ëþ-\u0095ï\u008e\u008d\u0014Ù\u009d.\u0086Zï\u0005ª";
                  var5 = "Ëþ-\u0095ï\u008e\u008d\u0014Ù\u009d.\u0086Zï\u0005ª".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11793;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





