import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class f8_2 implements Runnable {
   HashMap X;
   final yT_3 l;
   private static final long[] a;
   private static final Long[] b;

   f8_2(yT_3 var1) {
      this.l = var1;
      com.c.c(590582259753910902L).set(this, new HashMap());
   }

   @Override
   public void run() {
      com.ky_4[] var10000 = yT_3.c();
      Set var2 = Thread.getAllStackTraces().keySet();
      com.ky_4[] var1 = var10000;
      Iterator var3 = var2.iterator();
      ThreadMXBean var4 = ManagementFactory.getThreadMXBean();
      ArrayList var5 = new ArrayList();
      HashMap var6 = new HashMap();

      while (true) {
         if (var3.hasNext()) {
            Thread var7 = (Thread)var3.next();
            var5.add(var7);
            var20 = var6;
            if (var1 == null) {
               break;
            }

            var6.put(var7.getId(), var7);
            if (var1 != null) {
               continue;
            }
         }

         var20 = new HashMap();
         break;
      }

      HashMap var16 = var20;
      Iterator var8 = var5.iterator();

      while (true) {
         if (var8.hasNext()) {
            Thread var9;
            long var10;
            label46: {
               var9 = (Thread)var8.next();
               var10 = 0L;
               HashMap var21 = (HashMap)com.c.c(590582259753910902L).get(this);
               Long var10001 = var9.getId();
               if (var1 != null) {
                  var22 = var21.containsKey(var10001);
                  if (var1 == null) {
                     break;
                  }

                  if (var22 == 0) {
                     break label46;
                  }

                  var21 = (HashMap)com.c.c(590582259753910902L).get(this);
                  var10001 = var9.getId();
               }

               var10 = (Long)var21.get(var10001);
            }

            long var12 = var4.getThreadCpuTime(var9.getId());
            long var14 = var12 - var10;
            var16.put(var9.getId(), var14);
            if (var12 > 0L) {
            }

            ((HashMap)com.c.c(590582259753910902L).get(this)).put(var9.getId(), var12);
            if (var1 != null) {
               continue;
            }
         }

         Collections.sort(var5, new tA_3(this, var16));
         var22 = 1;
         break;
      }

      int var17 = var22;

      for (Thread var19 : var5) {
         long var11 = (Long)var16.get(var19.getId());
         long var13 = var11 / a(11498, 3548592707169661807L) / a(229, 245575733783437153L);
         if (var13 > 0L) {
         }

         if (var17 >= 5) {
         }

         var17++;
         if (var1 == null) {
            break;
         }
      }
   }

   static {
      long var0 = 6714615678991258939L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "^Gn¶D\u0014É²l\u00109&~ée¼";
      int var5 = "^Gn¶D\u0014É²l\u00109&~ée¼".length();
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
      int var3 = (var0 ^ (int)var1 ^ 8068) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }
}





