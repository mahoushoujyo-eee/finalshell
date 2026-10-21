package com;

import java.awt.Component;

public class OU implements Cloneable {
   public Component S;
   public int[] x;
   public int[] G;
   public int[] b;
   private static final String a;

   public OU(Component var1, w4_2 var2) {
      int[] var3 = new int[]{var2.T, var2.H};
      int[] var4 = new int[]{var2.r, var2.u};
      int[] var5 = new int[]{var2.L, var2.P};
      this.x = var3;
      this.G = var4;
      this.b = var5;
      this.S = var1;
   }

   public Object x() throws CloneNotSupportedException {
      return this.clone();
   }

   @Override
   public String toString() {
      w4_2 var1 = new w4_2(this.x[0], this.x[1], this.G[0], this.G[1], this.b[0], this.b[1]);
      return "(" + var1 + a + this.S;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u0001Z".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 75;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 75;
         var10006 = var0;
      } else {
         var6 = 75;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 75;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 99;
               break;
            case 1:
               var23 = 49;
               break;
            case 2:
               var23 = 35;
               break;
            case 3:
               var23 = 70;
               break;
            case 4:
               var23 = 17;
               break;
            case 5:
               var23 = 73;
               break;
            default:
               var23 = 16;
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





