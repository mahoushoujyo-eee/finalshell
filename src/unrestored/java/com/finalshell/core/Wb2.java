package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Wb2 extends W2 {
   public static String a;

   public Wb2() {
      Object[] var10001 = Registry.packArgs(a);
      long var2 = 241374024532053562L;
      Object[] var1 = var10001;
      Ref.h(241374024532053562L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw new RuntimeException(var3.getTargetException());
      }
   }

   @Override
   public void O() {
      Object var7 = 372236004790213499L;
      Registry.packArgs(Ref.g(372236004790213499L, var7));
      long var9 = 492930666611970668L;
      Object var10002 = Ref.h2(492930666611970668L, var9);

      try {
         var10002 = (String[])var10002;
      } catch (InvocationTargetException var15) {
         throw new RuntimeException(var15.getTargetException());
      }

      String[] var2 = (String[])var10002;
      var10002 = W2.F();
      int var3 = 0;
      String var1 = (String)var10002;

      while (var3 < var2.length) {
         String var4 = var2[var3].trim();
         if (var1 != null) {
            if (!var4.startsWith("\\")) {
               String var5 = var4;
               int var6 = var4.indexOf("\\");
               if (var1 != null) {
                  if (var6 > -1) {
                     var5 = var4.substring(0, var6).trim();
                  }

                  Object var11 = 254384586786323749L;
                  Ref.g(254384586786323749L, var11);
                  long var14 = 426585214678858813L;
                  Ref.s(426585214678858813L, var5, var14);
               }

               if (var1 != null) {
                  break;
               }
            }

            var3++;
         }

         if (var1 == null) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "8sPgtP,8=W>(A=6?V\"7P9(w\u001f$:AxtwP$t\\+(gA".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 39;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 39;
         var10006 = var0;
      } else {
         var6 = 39;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 39;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 124;
               break;
            case 1:
               var23 = 53;
               break;
            case 2:
               var23 = 3;
               break;
            case 3:
               var23 = 96;
               break;
            case 4:
               var23 = 124;
               break;
            case 5:
               var23 = 18;
               break;
            default:
               var23 = 127;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





