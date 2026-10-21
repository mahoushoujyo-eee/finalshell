package com;

import java.awt.Insets;

public class kE_3 extends com.ky_4 {
   private int q = com.oT_3.U;
   private Insets a = com.oT_3.o;
   private boolean M = com.oT_3.F;
   private boolean C = true;
   private static String r;

   public kE_3() {
      this(true);
   }

   public kE_3(boolean var1) {
      super(var1, C());
      this.i(true);
   }

   protected boolean u() {
      return this.C;
   }

   protected void U(boolean var1) {
      this.C = var1;
   }

   public int j() {
      return this.q;
   }

   public com.kE_3 g(int var1) {
      this.q = var1;
      this.F().j(var1 + com.oT_3.E);
      return this;
   }

   public Insets U() {
      return this.a;
   }

   public com.kE_3 S(int var1) {
      return this.o(var1, var1, var1, var1);
   }

   public com.kE_3 o(int var1, int var2, int var3, int var4) {
      return this.t(new Insets(var1, var2, var3, var4));
   }

   public com.kE_3 t(Insets var1) {
      this.a = var1;
      return this;
   }

   public boolean z() {
      return this.M;
   }

   public void b(boolean var1) {
      this.M = var1;
   }

   public com.TD F() {
      return (com.TD)super.getLayout();
   }

   protected static com.TD C() {
      return new com.TD(com.oT_3.U + com.oT_3.E);
   }

   public static void O(String var0) {
      r = var0;
   }

   public static String v() {
      return r;
   }

   static {
      if (v() != null) {
         O("hhUHwc");
      }
   }
}





