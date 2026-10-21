package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

public class Dv4 implements Zv2_2 {
   public static String a;

   @Override
   public boolean l(Object var1) {
      com.finalshell.ui.model.Ck4 var3 = (com.finalshell.ui.model.Ck4)var1;
      File var10001;
      String var10003 = (String)(Registry.emptyArgs());
      long var8 = 605430732347023634L;
      Object[] var7 = var10003;
      var10003 = Ref.h(605430732347023634L, var7, var8);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

new String(var10003);
      File var4 = var10001;
      Ky4[] var13 = Vk2.y();
      boolean var5 = false;
      Ky4[] var2 = var13;
      boolean var14 = var4.exists();
      if (var2 != null) {
         if (var14) {
            Registry.packArgs(var4.getName());
            long var9 = 353935338506646766L;
            Object var10002 = Ref.h2(353935338506646766L, var9);

            try {
               var10002 = (String)var10002;
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }

            String var6 = (String)var10002;
            boolean var16 = var6.toLowerCase().equals(a);
            if (var2 == null) {
               return var16;
            }

            if (!var16) {
               return false;
            }

            var5 = true;
            if (var2 == null) {
               return false;
            }
         }

         return var5;
      } else {
         return var14;
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "l\u001b\u0003?".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 124;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 124;
         var10006 = var0;
      } else {
         var6 = 124;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 124;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 122;
               break;
            case 1:
               var23 = 20;
               break;
            case 2:
               var23 = 16;
               break;
            case 3:
               var23 = 45;
               break;
            case 4:
               var23 = 67;
               break;
            case 5:
               var23 = 52;
               break;
            default:
               var23 = 125;
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





