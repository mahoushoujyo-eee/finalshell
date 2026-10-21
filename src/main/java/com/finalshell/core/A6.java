package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.util.ArrayList;
import java.util.HashMap;

public class A6 {
   public int r;
   public String B;
   public int a;
   public String m;
   public String j;
   B22 g;
   HashMap G;
   boolean U;
   public String Z;
   public ArrayList k;
   public ArrayList E;
   public ArrayList w;
   public static Ky4[] V;
   public static long b;

   public A6() {
      this.a = (int)b;
      this.G = new HashMap();
      this.U = false;
      this.k = new ArrayList();
      this.E = new ArrayList();
      this.w = new ArrayList();
   }

   void g(String var1, B22 var2) {
      this.G.put(var1, var2);
   }

   void h(ND_2 var1) {
      this.w.add(var1);
      var1.F = this;
   }

   public ArrayList k() {
      return this.w;
   }

   public void d(ArrayList var1) {
      this.w = var1;
   }

   public static void i(Ky4[] var0) {
      V = var0;
   }

   public static Ky4[] P() {
      return V;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (P() == null) {
         i(new Ky4[2]);
      }

      long var0 = 7002487834923142730L;
      long var10002 = 332468740234317484L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





