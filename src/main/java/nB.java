import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class nB extends com.T4 {
   private static final long[] a;
   private static final Integer[] b;

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      return new Dimension(b(28963, 6711902340995496985L), b(667, 2600422355702370208L));
   }

   @Override
   public void layoutContainer(Container var1) {
      String[] var10000 = F_.F();
      Component[] var3 = var1.getComponents();
      String[] var2 = var10000;
      int var4 = var3.length;
      int var5 = 0;

      while (var5 < var4) {
         Component var6 = var3[var5];
         label40:
         if (var2 != null) {
            if (var6.getClass().equals(Y3.class)) {
               Y3 var7 = (Y3)var6;
               if (var2 == null) {
                  break label40;
               }

               Object[] var10001 = com.c.f();
               Method var10003 = com.c.d(346087293806109292L);
               Object[] var10002 = var10001;
               Y3 var12 = var7;
               Method var10 = var10003;

               try {
                  var11 = (Rectangle)var10.invoke(var12, var10002);
               } catch (InvocationTargetException var9) {
                  throw var9.getTargetException();
               }

               if (var11 != null) {
                  var10002 = com.c.f();
                  Method var10004 = com.c.d(346087293806109292L);
                  Object[] var17 = var10002;
                  Y3 var16 = var7;
                  Method var13 = var10004;

                  try {
                     var10001 = (Rectangle)var13.invoke(var16, var17);
                  } catch (InvocationTargetException var8) {
                     throw var8.getTargetException();
                  }

                  var7.setBounds(var10001);
               }
            }

            var5++;
         }

         if (var2 == null) {
            break;
         }
      }
   }

   static {
      long var0 = 3899595100330472455L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ÃCh\u0001ê\u0092ûÃÙyg\u009c\u0001+\bz";
      int var5 = "ÃCh\u0001ê\u0092ûÃÙyg\u009c\u0001+\bz".length();
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19771;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





