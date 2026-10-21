package com;

import java.awt.Component;
import java.awt.Insets;

public class kP_3 extends com.ky_4 {
   private static final String a;

   public kP_3(Component var1) {
      this(var1, 0);
   }

   public kP_3(Component var1, int var2) {
      this(var1, var2, var2, var2, var2);
   }

   public kP_3(Component var1, int var2, int var3, int var4, int var5) {
      this(var1, new Insets(var2, var3, var4, var5));
   }

   public kP_3(Component var1, Insets var2) {
      int[] var10000 = com.k3_2.L();
      super();
      int[] var3 = var10000;
      this.b(var2);
      if (var3 != null) {
         if (var1 != null) {
            this.setOpaque(var1.isOpaque());
            this.setBackground(var1.getBackground());
            this.add(var1, a);
            if (var3 != null) {
               return;
            }
         }

         this.setOpaque(true);
      }

      this.setBackground(GO.R);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "(\u001fW^<d".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 4;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 4;
         var10006 = var0;
      } else {
         var6 = 4;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 4;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 111;
               break;
            case 1:
               var23 = 126;
               break;
            case 2:
               var23 = 61;
               break;
            case 3:
               var23 = 46;
               break;
            case 4:
               var23 = 93;
               break;
            case 5:
               var23 = 18;
               break;
            default:
               var23 = 23;
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





