package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class Wt2 extends W2 {
   HashMap D;
   HashMap A;
   public static String a;

   public Wt2() {
      Object[] var10001 = Registry.packArgs(a);
      long var2 = 241374024532053562L;
      Object[] var1 = var10001;
      Ref.h(241374024532053562L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      HashMap var10002 = new HashMap();
      long var4 = 581222953681728588L;
      HashMap var3 = var10002;
      Ref.s(581222953681728588L, var3, var4);
      HashMap var10003 = new HashMap();
      long var6 = 592026883457058334L;
      HashMap var5 = var10003;
      Ref.s(592026883457058334L, var5, var6);
   }

   @Override
   public void O() {
      String var1 = W2.F();

      try {
         Object var9 = 372236004790213499L;
         Registry.packArgs(Ref.g(372236004790213499L, var9));
         long var11 = 492930666611970668L;
         Object var10002 = Ref.h2(492930666611970668L, var11);

         try {
            var10002 = (String[])var10002;
         } catch (InvocationTargetException var31) {
            throw var31.getTargetException();
         }

         String[] var2 = (String[])var10002;
         int var3 = 0;

         while (var3 < var2.length) {
            String var4 = var2[var3].trim();
            String[] var5 = var4.split(":");
            String var6 = var5[0];
            int var7 = Integer.parseInt(var5[2]);
            int var8 = Integer.parseInt(var5[2]);

            try {
               Object var13 = 581222953681728588L;
               ((HashMap)Ref.g(581222953681728588L, var13)).put(var7, var6);
               Object var15 = 592026883457058334L;
               ((HashMap)Ref.g(592026883457058334L, var15)).put(var8, var6);
               Object var17 = 254384586786323749L;
               Ref.g(254384586786323749L, var17);
               Object var19 = 581222953681728588L;
               Object[] var10007 = Registry.packArgs(Ref.g(581222953681728588L, var19));
               long var22 = 616120388513155293L;
               Object[] var21 = var10007;
               Ref.h(616120388513155293L, var21, var22);

               try {
                  ;
               } catch (InvocationTargetException var30) {
                  throw var30.getTargetException();
               }

               Object var23 = 254384586786323749L;
               Ref.g(254384586786323749L, var23);
               Object var25 = 592026883457058334L;
               Object[] var10010 = Registry.packArgs(Ref.g(592026883457058334L, var25));
               long var28 = 604464958059400445L;
               Object[] var27 = var10010;
               Ref.h(604464958059400445L, var27, var28);

               try {
                  ;
               } catch (InvocationTargetException var29) {
                  throw var29.getTargetException();
               }

               var3++;
               if (var1 == null || var1 == null) {
                  break;
               }
            } catch (Exception var32) {
               throw a(var32);
            }
         }
      } catch (Exception var33) {
      }
   }

   public HashMap j() {
      Object var1 = 581222953681728588L;
      return (HashMap)Ref.g(581222953681728588L, var1);
   }

   public void o(HashMap var1) {
      long var3 = 581222953681728588L;
      Ref.s(581222953681728588L, var1, var3);
   }

   public HashMap q() {
      Object var1 = 592026883457058334L;
      return (HashMap)Ref.g(592026883457058334L, var1);
   }

   public void k(HashMap var1) {
      long var3 = 592026883457058334L;
      Ref.s(592026883457058334L, var1, var3);
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "fV=5k<9f\u00189t7*:a".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 100;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 100;
         var10006 = var0;
      } else {
         var6 = 100;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 100;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 97;
               break;
            case 1:
               var23 = 83;
               break;
            case 2:
               var23 = 45;
               break;
            case 3:
               var23 = 113;
               break;
            case 4:
               var23 = 32;
               break;
            case 5:
               var23 = 61;
               break;
            default:
               var23 = 41;
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





