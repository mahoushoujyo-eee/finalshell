package com.finalshell.core;

import java.awt.Color;

public class Go2 implements Cloneable {
   int T = 0;
   Od4 j;
   Od4 r;
   O_3 H = new O_3();
   int Y = -1;
   float L;
   float D;
   float F;
   float w = 0.5F;
   float V = 0.5F;
   float u = 0.5F;
   float v = (float) (Math.PI / 6);
   float X;
   float k = 100.0F;
   public static String a;

   public Go2() {
      this((float) (Math.PI * 3.0 / 2.0), (float) (Math.PI / 6), 1.0F);
   }

   public Go2(float var1, float var2, float var3) {
      this.D = var1;
      this.F = var2;
      this.L = var3;
   }

   public void p(float var1) {
      this.D = var1;
   }

   public float S() {
      return this.D;
   }

   public void d(float var1) {
      this.F = var1;
   }

   public float L() {
      return this.F;
   }

   public void W(float var1) {
      this.k = var1;
   }

   public float X() {
      return this.k;
   }

   public void j(float var1) {
      this.L = var1;
   }

   public float q() {
      return this.L;
   }

   public void U(float var1) {
      this.v = var1;
   }

   public float s() {
      return this.v;
   }

   public void o(float var1) {
      this.w = var1;
   }

   public float Q() {
      return this.w;
   }

   public void j(int var1) {
      this.Y = var1;
   }

   public int U() {
      return this.Y;
   }

   public void h(float var1) {
      this.V = var1;
   }

   public float M() {
      return this.V;
   }

   public void Z(float var1) {
      this.u = var1;
   }

   public float o() {
      return this.u;
   }

   public void j(int var1, int var2) {
      String[] var10000 = W5.q();
      float var4 = (float)(Math.cos((double)this.D) * Math.cos((double)this.F));
      float var5 = (float)(Math.sin((double)this.D) * Math.cos((double)this.F));
      String[] var3 = var10000;
      float var6 = (float)Math.sin((double)this.F);
      this.r = new Od4(var4, var5, var6);
      this.r.E();
      Go2 var9 = this;
      if (var3 != null) {
         if (this.T != 1) {
            var4 *= this.k;
            var5 *= this.k;
            var6 *= this.k;
            var4 += (float)var1 * this.V;
            var5 += (float)var2 * this.u;
         }

         this.j = new Od4(var4, var5, var6);
         this.H.x(new Color(this.Y));
         this.H.K(this.L);
         var9 = this;
      }

      var9.X = (float)Math.cos((double)this.v);
   }

   @Override
   public Object clone() {
      try {
         return (Go2)super.clone();
      } catch (CloneNotSupportedException var2) {
         return null;
      }
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u001eqk7c".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 119;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 119;
         var10006 = var0;
      } else {
         var6 = 119;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 119;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 37;
               break;
            case 1:
               var23 = 111;
               break;
            case 2:
               var23 = 123;
               break;
            case 3:
               var23 = 40;
               break;
            case 4:
               var23 = 96;
               break;
            case 5:
               var23 = 43;
               break;
            default:
               var23 = 124;
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





