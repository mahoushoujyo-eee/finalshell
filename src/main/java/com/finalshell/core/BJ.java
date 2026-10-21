package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

public class BJ {
   String M;
   public static int f;
   public static int w;
   int W;

   public String B() {
      Object var1 = 244924605468350985L;
      return (String)Ref.g(244924605468350985L, var1);
   }

   public void o(String var1) {
      long var3 = 244924605468350985L;
      Ref.s(244924605468350985L, var1, var3);
   }

   public int P() {
      return Registry.lookupField(477447395719945513L).getInt(this);
   }

   public void V(int var1) {
      Registry.lookupField(477447395719945513L).setInt(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 8290374672878413104L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "\u0098Ü\u007fd7Ð&ÙÊ~\u0017\u00077Ð&Ø";
      int var6 = "\u0098Ü\u007fd7Ð&ÙÊ~\u0017\u00077Ð&Ø".length();
      byte var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         var10001 = var4++;
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
            ^ var1;
         byte var10003 = -1;
         var0[var10001] = var10004;
      } while (var3 < var6);

      Registry.lookupField(153892563842185940L).setInt(null, (int)var0[1]);
      Registry.lookupField(282832775171570604L).setInt(null, (int)var0[0]);
   }
}





