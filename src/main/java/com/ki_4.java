package com;

import java.awt.Component;
import java.awt.LayoutManager;

public class ki_4 extends com.ky_4 implements ND {
   protected boolean q;
   protected float H;
   private static final String a;

   public ki_4() {
      this.v();
   }

   public ki_4(boolean var1) {
      super(var1);
      this.v();
   }

   public ki_4(boolean var1, LayoutManager var2) {
      super(var1, var2);
      this.v();
   }

   public ki_4(boolean var1, Component var2) {
      super(var1, var2);
      this.v();
   }

   public ki_4(Component var1) {
      super(var1);
      this.v();
   }

   public ki_4(com.og_4 var1) {
      super(var1);
      this.v();
   }

   public ki_4(com.og_4 var1, Component var2) {
      super(var1, var2);
      this.v();
   }

   public ki_4(LayoutManager var1) {
      super(var1);
      this.v();
   }

   public ki_4(LayoutManager var1, boolean var2) {
      super(var1, var2);
      this.v();
   }

   private void v() {
      this.S(a);
   }

   @Override
   public void o(boolean var1) {
      this.q = var1;
      this.repaint();
   }

   @Override
   public boolean D() {
      return this.q;
   }

   @Override
   public void w(float var1) {
      this.H = var1;
      this.repaint();
   }

   @Override
   public float D$float() {
      return this.H;
   }

   @Override
   public boolean contains(int var1, int var2) {
      return com.QC.q(this, var1, var2);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u001eALyA\u0003`\t^K5@\fw\u0011VGl".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 114;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 114;
         var10006 = var0;
      } else {
         var6 = 114;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 114;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 14;
               break;
            case 1:
               var23 = 65;
               break;
            case 2:
               var23 = 91;
               break;
            case 3:
               var23 = 106;
               break;
            case 4:
               var23 = 87;
               break;
            case 5:
               var23 = 18;
               break;
            default:
               var23 = 96;
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





