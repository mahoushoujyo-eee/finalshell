package com.finalshell.core;

import com.finalshell.reflect.Registry;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

public class Yr4_2 {
   public static Unsafe E;

   public static void s(Field var0, Object var1) throws Exception {
      Object var2 = ((Unsafe)Registry.lookupField(489346355620835549L).get(null)).staticFieldBase(var0);
      long var3 = ((Unsafe)Registry.lookupField(489346355620835549L).get(null)).staticFieldOffset(var0);
      ((Unsafe)Registry.lookupField(489346355620835549L).get(null)).putObject(var2, var3, var1);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "e(p2.\u0011<w%".toCharArray();
      int var10004 = var10003.length;
      int var1 = 0;
      byte var12 = 9;
      char[] var10002 = var10003;
      int var7 = var10004;
      char[] var16;
      byte var20;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var16 = var10003;
         var10005 = var1;
         char var10008 = var10003[var1];
         var10007 = 9;
         var10006 = var10008;
         switch (var1 % 7) {
            case 0:
               var20 = 24;
               break;
            case 1:
               var20 = 73;
               break;
            case 2:
               var20 = 28;
               break;
            case 3:
               var20 = 110;
               break;
            case 4:
               var20 = 73;
               break;
            case 5:
               var20 = 107;
               break;
            default:
               var20 = 84;
         }
      } else {
         var12 = 9;
         var7 = var10004;
         if (var10004 <= var1) {
            String var15 = new String(var10003).intern();
            byte var10 = -1;
            String var5 = var15;

            try {
               Field var6 = Unsafe.class.getDeclaredField(var5);
               var6.setAccessible(true);
               Registry.lookupField(489346355620835549L).set(null, (Unsafe)var6.get(null));
            } catch (Exception var4) {
               var4.printStackTrace();
            }

            return;
         }

         var16 = var10003;
         var10005 = var1;
         char var21 = var10003[var1];
         var10007 = 9;
         var10006 = var21;
         switch (var1 % 7) {
            case 0:
               var20 = 24;
               break;
            case 1:
               var20 = 73;
               break;
            case 2:
               var20 = 28;
               break;
            case 3:
               var20 = 110;
               break;
            case 4:
               var20 = 73;
               break;
            case 5:
               var20 = 107;
               break;
            default:
               var20 = 84;
         }
      }

      while (true) {
         var16[var10005] = (char)(var10006 ^ var10007 ^ var20);
         var1++;
         if (var12 == 0) {
            var16 = var10002;
            var10005 = var12;
            char var23 = var10002[var12];
            var10007 = var12;
            var10006 = var23;
            switch (var1 % 7) {
               case 0:
                  var20 = 24;
                  break;
               case 1:
                  var20 = 73;
                  break;
               case 2:
                  var20 = 28;
                  break;
               case 3:
                  var20 = 110;
                  break;
               case 4:
                  var20 = 73;
                  break;
               case 5:
                  var20 = 107;
                  break;
               default:
                  var20 = 84;
            }
         } else {
            if (var7 <= var1) {
               String var14 = new String(var10002).intern();
               byte var9 = -1;
               String var0 = var14;

               try {
                  Field var2 = Unsafe.class.getDeclaredField(var0);
                  var2.setAccessible(true);
                  Registry.lookupField(489346355620835549L).set(null, (Unsafe)var2.get(null));
               } catch (Exception var3) {
                  var3.printStackTrace();
               }

               return;
            }

            var16 = var10002;
            var10005 = var1;
            char var22 = var10002[var1];
            var10007 = var12;
            var10006 = var22;
            switch (var1 % 7) {
               case 0:
                  var20 = 24;
                  break;
               case 1:
                  var20 = 73;
                  break;
               case 2:
                  var20 = 28;
                  break;
               case 3:
                  var20 = 110;
                  break;
               case 4:
                  var20 = 73;
                  break;
               case 5:
                  var20 = 107;
                  break;
               default:
                  var20 = 84;
            }
         }
      }
   }
}





