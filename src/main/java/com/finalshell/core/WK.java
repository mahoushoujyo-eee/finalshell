package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.Icon;

public class WK extends W2 {
   public static String a;

   public WK() {
      Object[] var10001 = Registry.packArgs(a);
      long var2 = 241374024532053562L;
      Object[] var1 = var10001;
      Ref.h(241374024532053562L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   @Override
   public void O() {
      W2.F();
      Object var11 = 254384586786323749L;
      Object var10002 = Ref.g(254384586786323749L, var11);
      ArrayList var10003 = Registry.emptyArgs();
      long var14 = 463836399714355767L;
      Object[] var13 = var10003;
      var10003 = Ref.h(463836399714355767L, var13, var14);

      try {
         var10003 = (ArrayList)var10003;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      var10003.clear();
      Object var1 = var10002;
      Object var15 = 372236004790213499L;
      var10003 = (String)Ref.g(372236004790213499L, var15);
      if (var1 != null) {
         if (var10003 == null) {
            return;
         }

         var10003 = this;
         Object var17 = 372236004790213499L;
         String var10004 = (String)Ref.g(372236004790213499L, var17);
      }

      Registry.packArgs(var10003);
      long var19 = 492930666611970668L;
      Object var37 = Ref.h2(492930666611970668L, var19);

      try {
         var37 = (String[])var37;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      String[] var2 = (String[])var37;
      boolean var3 = false;
      HashSet var4 = new HashSet();
      int var5 = 0;

      while (var5 < var2.length) {
         String var6 = var2[var5].trim();
         String var7 = var6.trim();
         if (var1 != null) {
            if (!var7.contains("*") && !var4.contains(var7)) {
               L1 var8 = new L1("", var7);
               Object var21 = 254384586786323749L;
               Ref.g(254384586786323749L, var21);
               ArrayList var10006 = Registry.emptyArgs();
               long var24 = 463836399714355767L;
               Object[] var23 = var10006;
               var10006 = Ref.h(463836399714355767L, var23, var24);

               try {
                  var10006 = (ArrayList)var10006;
               } catch (InvocationTargetException var31) {
                  throw var31.getTargetException();
               }

               var10006.add(var8);
               var4.add(var7);
               Bo4 var9 = new Bo4(var7, var7, "-", null);
               Registry.packArgs(var9);
               long var25 = 488188427062992088L;
               Object var10007 = Ref.h2(488188427062992088L, var25);

               try {
                  var10007 = (Icon)var10007;
               } catch (InvocationTargetException var30) {
                  throw var30.getTargetException();
               }

               Icon var10 = (Icon)var10007;
               Object[] var10008 = Registry.packArgs(var10);
               long var28 = 377795955767356198L;
               Object[] var27 = var10008;
               Ref.h(377795955767356198L, var27, var28);

               try {
                  ;
               } catch (InvocationTargetException var29) {
                  throw var29.getTargetException();
               }
            }

            var5++;
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
      char[] var10003 = "<aQITZ$8}QI,~\u0013\u00182\rM\bMgw(VM[\u001f`y2\rM\u001bM\" 2\\\u001b\\\u0018hw2\rM\u001bM\" 2_M\u0000\u001f4?`\u0005".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 121;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 121;
         var10006 = var0;
      } else {
         var6 = 121;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 121;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 41;
               break;
            case 1:
               var23 = 107;
               break;
            case 2:
               var23 = 8;
               break;
            case 3:
               var23 = 20;
               break;
            case 4:
               var23 = 5;
               break;
            case 5:
               var23 = 70;
               break;
            default:
               var23 = 62;
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





