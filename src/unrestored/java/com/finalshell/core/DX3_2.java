package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.FH3;
import java.lang.reflect.InvocationTargetException;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.concurrent.ThreadPoolExecutor;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapNativeException;

public class DX3_2 implements Q0 {
   public short K = I();
   public Yu2 P = new Yu2();
   public String B;
   public Q0 F;
   public boolean S = true;
   public int A;
   public boolean w = false;
   public GH_2 G;
   public static long[] a;
   public static Integer[] b;

   public DX3_2(String var1) {
      this.B = var1;
   }

   public void C() throws UnknownHostException, PcapNativeException, NotOpenException {
      ((ThreadPoolExecutor)Ref.g(285529366020626428L, null)).execute(new FH3(this));
   }

   public void v() {
      String[] var10000 = XQ_2.B();
      this.P.C().clear();
      String[] var1 = var10000;
      DX3_2 var5 = this;
      if (var1 != null) {
         if (this.G != null) {
            Object[] var10001 = Registry.emptyArgs();
            long var3 = 624731062495880669L;
            Object[] var2 = var10001;
            Ref.h(624731062495880669L, var2, var3);

            try {
               ;
            } catch (InvocationTargetException var4) {
               throw new RuntimeException(var4.getTargetException());
            }
         }

         var5 = this;
      }

      var5.F = null;
   }

   public static short I() {
      String[] var10000 = XQ_2.B();
      int var1 = a(20338, 4574849776412187L);
      int var2 = a(9255, 3454409876788809039L);
      String[] var0 = var10000;
      short var3 = (short)new Random().nextInt(var2);
      short var4 = var3;
      if (var0 != null) {
         if (var3 < var1) {
            var3 = (short)(var3 + var1);
         }

         var4 = var3;
      }

      return var4;
   }

   @Override
   public void a(B0 var1) {
      String[] var2 = XQ_2.B();
      Q0 var10000 = this.F;
      if (var2 != null) {
         if (this.F == null) {
            return;
         }

         var10000 = this.F;
      }

      var10000.a(var1);
   }

   public Q0 i() {
      return this.F;
   }

   public void j(Q0 var1) {
      this.F = var1;
   }

   public Yu2 n() {
      return this.P;
   }

   public void C(Yu2 var1) {
      this.P = var1;
   }

   public boolean R() {
      return this.w;
   }

   public void O(boolean var1) {
      this.w = var1;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10600;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3506461730338835122L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "nM¶º\u0091À{ê\u001f.±¯¨\u008bïA";
      int var5 = "nM¶º\u0091À{ê\u001f.±¯¨\u008bïA".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
}





