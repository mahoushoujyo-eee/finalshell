import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

public class T3 implements LayoutManager {
   private static final long[] a;
   private static final Integer[] b;

   @Override
   public void addLayoutComponent(String var1, Component var2) {
   }

   @Override
   public void removeLayoutComponent(Component var1) {
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      new Dimension();
      return new Dimension(a(30281, 9053219455060983881L), a(6416, 2628195482779889425L));
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      return new Dimension(a(6416, 2628195482779889425L), a(6416, 2628195482779889425L));
   }

   @Override
   public void layoutContainer(Container var1) {
      String var10000 = Km_2.U();
      Component[] var3 = var1.getComponents();
      String var2 = var10000;

      for (Component var7 : var3) {
         var7.setBounds(0, 0, var1.getWidth(), var1.getHeight());
         if (var2 != null) {
            break;
         }
      }
   }

   static {
      long var0 = 3744109555090489656L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ícfTCÀA\u0015L<E\u0092x1.M";
      int var5 = "ícfTCÀA\u0015L<E\u0092x1.M".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13824;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





