package com.finalshell.core;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;

public final class WO {
   public static Map W;
   public static String a;

   public static void t(JComponent var0, Og4 var1) {
      int[] var2 = Lz2_2.M();
      if (var0 != null) {
         Object var10000 = var1;
         if (var2 == null) {
            if (var1 == null) {
               return;
            }

            var10000 = W.get(var0);
         }

         Object var3 = (Map)var10000;
         var10000 = var3;
         if (var2 == null) {
            if (var3 == null) {
               var3 = new WeakHashMap(1);
               W.put(var0, var3);
            }

            var10000 = W;
         }

         if (!var10000.containsKey(var1)) {
            var1.A(var0);
            Boolean var4 = var1.d$Boolean(var0);
            if (var2 == null) {
               if (var4 != null) {
                  Boolean var10002 = var4;
                  if (var2 == null) {
                     var10002 = var4 ? Boolean.TRUE : Boolean.FALSE;
                  }

                  LookAndFeel.installProperty(var0, a, var10002);
               }

               GA.i(var0);
            }

            WeakReference var5 = new WeakReference<>(var0);
            WeakReference var6 = new WeakReference<>(var1);
            IW var7 = new IW(var5, var6);
            var1.A(var7);
            var3.put(var1, var7);
         }
      }
   }

   public static void C(JComponent var0, Og4 var1) {
      int[] var2 = Lz2_2.M();
      if (var0 != null) {
         Object var10000 = var1;
         if (var2 == null) {
            if (var1 == null) {
               return;
            }

            var10000 = W.get(var0);
         }

         Map var3 = (Map)var10000;
         if (var2 == null && var3 != null) {
            var1.X(var0);
            var3.remove(var1);
         }
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "!u\u0014om}".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 80;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 80;
         var10006 = var0;
      } else {
         var6 = 80;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            W = new WeakHashMap();
            return;
         }

         var10005 = var10003;
         var10 = 80;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 30;
               break;
            case 1:
               var23 = 85;
               break;
            case 2:
               var23 = 37;
               break;
            case 3:
               var23 = 78;
               break;
            case 4:
               var23 = 72;
               break;
            case 5:
               var23 = 72;
               break;
            default:
               var23 = 9;
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
               W = new WeakHashMap();
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





