package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Tf4;

public class Uf4 {
   public static int e;
   public static int P;
   int J;
   Tf4 t;
   com.finalshell.ui.model.Ck4 u;

   public Uf4(int var1) {
      Registry.lookupField(159784702252834868L).setInt(this, 0);
      Registry.lookupField(159784702252834868L).setInt(this, var1);
   }

   public int Q() {
      return Registry.lookupField(159784702252834868L).getInt(this);
   }

   public void D(int var1) {
      Registry.lookupField(159784702252834868L).setInt(this, var1);
   }

   public Tf4 n() {
      Object var1 = 611048862107038066L;
      return (Tf4)Ref.g(611048862107038066L, var1);
   }

   public void w(Tf4 var1) {
      long var3 = 611048862107038066L;
      Ref.s(611048862107038066L, var1, var3);
   }

   public com.finalshell.ui.model.Ck4 v() {
      Object var1 = 287959232878030326L;
      return (com.finalshell.ui.model.Ck4)Ref.g(287959232878030326L, var1);
   }

   public void b(com.finalshell.ui.model.Ck4 var1) {
      long var3 = 287959232878030326L;
      Ref.s(287959232878030326L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 5378886281743865981L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "UZÊ\u0089\u001e\u0090\u0098\u0018N\u007fz´\u001e\u0090\u0098\u0019";
      int var6 = "UZÊ\u0089\u001e\u0090\u0098\u0018N\u007fz´\u001e\u0090\u0098\u0019".length();
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

      Registry.lookupField(451440066276164151L).setInt(null, (int)var0[1]);
      Registry.lookupField(532763949550214061L).setInt(null, (int)var0[0]);
   }
}





