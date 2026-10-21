package com.finalshell.task;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.ui.model.TA3;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class F82 implements Runnable {
   public HashMap X;
   public final YT3_2 l;
   public static long[] a;
   public static Long[] b;

   public F82(YT3_2 var1) {
      this.l = var1;
      HashMap var10001 = new HashMap();
      long var3 = 590582259753910902L;
      HashMap var2 = var10001;
      Ref.s(590582259753910902L, var2, var3);
   }

   @Override
   public void run() {
      com.finalshell.ui.panel.Ky4[] var10000 = YT3_2.c();
      Set var2 = Thread.getAllStackTraces().keySet();
      com.finalshell.ui.panel.Ky4[] var1 = var10000;
      Iterator var3 = var2.iterator();
      ThreadMXBean var4 = ManagementFactory.getThreadMXBean();
      ArrayList var5 = new ArrayList();
      HashMap var6 = new HashMap();

      while (true) {
         if (var3.hasNext()) {
      HashMap var26;
            Thread var7 = (Thread)var3.next();
            var5.add(var7);
            var26 = var6;
            if (var1 == null) {
               break;
            }

            var6.put(var7.getId(), var7);
            if (var1 != null) {
               continue;
            }
         }

         var26 = new HashMap();
         break;
      }

      HashMap var22 = var26;
      Iterator var8 = var5.iterator();

      while (true) {
         if (var8.hasNext()) {
            Thread var9;
            long var10;
            label46: {
               var9 = (Thread)var8.next();
               var10 = 0L;
               var27 = this;
               Object var16 = 590582259753910902L;
               Object var10001 = (HashMap)Ref.g(590582259753910902L, var16);
               Object var10002 = var9.getId();
               if (var1 != null) {
                  boolean var28 = var10001.containsKey(var10002);
                  if (var1 == null) {
                     break;
                  }

                  if (!var28) {
                     break label46;
                  }

                  var10001 = this;
                  Object var18 = 590582259753910902L;
                  var10002 = (HashMap)Ref.g(590582259753910902L, var18);
                  Long.valueOf(var9.getId());
               }

               var10 = (Long)var10001.get(var10002);
            }

            long var12 = var4.getThreadCpuTime(var9.getId());
            long var14 = var12 - var10;
            var22.put(var9.getId(), var14);
            if (var12 > 0L) {
            }

            Object var20 = 590582259753910902L;
            ((HashMap)Ref.g(590582259753910902L, var20)).put(var9.getId(), var12);
            if (var1 != null) {
               continue;
            }
         }

         Collections.sort(var5, new TA3(this, var22));
         var27 = true;
         break;
      }

      F82 var23 = var27;

      for (Thread var25 : var5) {
         long var11 = (Long)var22.get(var25.getId());
         long var13 = var11 / a(11498, 3548592707169661807L) / a(229, 245575733783437153L);
         if (var13 > 0L) {
         }

         if (var23 >= 5) {
         }

         var23++;
         if (var1 == null) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 8068) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }

   public static void __vfClinit__() {
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
}





