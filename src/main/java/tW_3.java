import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class tW_3 extends Thread {
   final L0 v;
   private static final long[] a;
   private static final Long[] b;

   tW_3(L0 var1) {
      this.v = var1;
   }

   @Override
   public void run() {
      boolean var10000 = zD.d();
      long var2 = System.currentTimeMillis();
      boolean var1 = var10000;

      while (true) {
         while (Math.abs(System.currentTimeMillis() - var2) > a(24930, 538320805014106729L)) {
            var2 = System.currentTimeMillis();

            try {
               if (!var1) {
                  Object var8 = com.c.c(422123708702137249L).get(this);
                  Object[] var10001 = com.c.f();
                  Method var10003 = com.c.d(435470792842628354L);
                  Object[] var10002 = var10001;
                  var10001 = (Object[])var8;
                  Method var9 = var10003;

                  try {
                     var9.invoke(var10001, var10002);
                     break;
                  } catch (InvocationTargetException var5) {
                     throw var5.getTargetException();
                  }
               }
            } catch (InterruptedException var7) {
               throw a(var7);
            }
         }

         try {
            Thread.sleep(a(27927, 7278848123819589149L));
         } catch (InterruptedException var6) {
            return;
         }
      }
   }

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      long var0 = 515389026270463201L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u0000_x}1í5`b$®[\r´º\u0098";
      int var5 = "\u0000_x}1í5`b$®[\r´º\u0098".length();
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
      b = new Long[2];
   }

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 4875) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }
}





