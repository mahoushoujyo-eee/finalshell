package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

public class T__2 implements Zv2_2 {
   public static String a;

   @Override
   public boolean l(Object var1) {
      Km2.U$String();
      com.finalshell.ui.model.Ck4 var3 = (com.finalshell.ui.model.Ck4)var1;
      File var10001;
      String var10004 = (String)(Registry.emptyArgs());
      long var8 = 605430732347023634L;
      Object[] var7 = var10004;
      var10004 = Ref.h(605430732347023634L, var7, var8);

      try {
         var10004 = (String)var10004;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

var3 = new String(var10004);
      File var4 = var10001;
      File var2 = var10001;
      boolean var5 = false;
      boolean var16 = var4.exists();
      if (var2 == null) {
         if (var16) {
            Object[] var22 = Registry.packArgs(var4.getName());
            long var9 = 353935338506646766L;
            Object var10002 = Ref.h2(353935338506646766L, var9);

            try {
               var10002 = (String)var10002;
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            String var6 = (String)var10002;
            Registry.emptyArgs();
            long var11 = 253808553645062345L;
            Object var10003 = Ref.h2(253808553645062345L, var11);

            try {
               var18 = (Boolean)var10003;
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }

            if (var2 != null) {
               return var18;
            }

            if (!var18) {
               return true;
            }

            boolean var19 = var6.toLowerCase().equals(a);
            if (var2 != null) {
               return (boolean)var22;
            }

            if (var19) {
               var5 = true;
               if (var2 != null) {
                  return true;
               }
            }
         }

         return var5;
      } else {
         return var16;
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "h\u0017\u007f".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 106;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 106;
         var10006 = var0;
      } else {
         var6 = 106;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 106;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 103;
               break;
            case 1:
               var23 = 5;
               break;
            case 2:
               var23 = 112;
               break;
            case 3:
               var23 = 15;
               break;
            case 4:
               var23 = 63;
               break;
            case 5:
               var23 = 120;
               break;
            default:
               var23 = 43;
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





