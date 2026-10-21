package com;

import java.awt.image.BufferedImage;

public class gu_4 extends gy_4 {
   private int Q;
   private int Z;
   private int W;
   private int l;
   private boolean i;
   private static final String a;

   public gu_4() {
      this(0, 0, true);
   }

   public gu_4(int var1, int var2, boolean var3) {
      this.W = var1;
      this.l = var2;
      this.i = var3;
      this.Y(0);
   }

   public void g(int var1) {
      this.W = var1;
   }

   public int q() {
      return this.W;
   }

   public void b(int var1) {
      this.l = var1;
   }

   public int M() {
      return this.l;
   }

   public void J(boolean var1) {
      this.i = var1;
   }

   public boolean V() {
      return this.i;
   }

   @Override
   protected void h(int var1, int var2, float[] var3) {
      String[] var4 = com.W5.q();
      if (var4 != null) {
         if (this.i) {
            var3[0] = (float)((var1 + this.Q - this.W) % this.Q);
            var3[1] = (float)((var2 + this.Z - this.l) % this.Z);
            if (var4 != null) {
               return;
            }
         }

         var3[0] = (float)(var1 - this.W);
      }

      var3[1] = (float)(var2 - this.l);
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var10000 = com.W5.q();
      this.Q = var1.getWidth();
      String[] var3 = var10000;
      this.Z = var1.getHeight();
      gu_4 var4 = this;
      if (var3 != null) {
         if (this.i) {
            label32:
            while (true) {
               if (this.W < 0) {
                  this.W = this.W + this.Q;
                  if (var3 == null) {
                     break;
                  }

                  if (var3 != null) {
                     continue;
                  }
               }

               while (this.l < 0) {
                  this.l = this.l + this.Z;
                  if (var3 == null) {
                     break label32;
                  }

                  if (var3 == null) {
                     break;
                  }
               }

               this.W = this.W % this.Q;
               break;
            }

            this.l = this.l % this.Z;
         }

         var4 = this;
      }

      return var4.filter(var1, var2);
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = ";}6C\u001cU\u0010P[#Q\u0000B\u0010Q:k".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 81;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 81;
         var10006 = var0;
      } else {
         var6 = 81;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 81;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 46;
               break;
            case 1:
               var23 = 69;
               break;
            case 2:
               var23 = 20;
               break;
            case 3:
               var23 = 102;
               break;
            case 4:
               var23 = 34;
               break;
            case 5:
               var23 = 118;
               break;
            default:
               var23 = 53;
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





