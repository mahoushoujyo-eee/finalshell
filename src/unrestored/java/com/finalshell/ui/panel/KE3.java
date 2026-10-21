package com.finalshell.ui.panel;

import com.finalshell.core.OT3;
import com.finalshell.core.TD_2;
import java.awt.Insets;

public class KE3 extends Ky4 {
   public int q = OT3.U;
   public Insets a = OT3.o;
   public boolean M = OT3.F;
   public boolean C = true;
   public static String r;

   public KE3() {
      this(true);
   }

   public KE3(boolean var1) {
      super(var1, C());
      this.i(true);
   }

   public boolean u() {
      return this.C;
   }

   public void U(boolean var1) {
      this.C = var1;
   }

   public int j() {
      return this.q;
   }

   public KE3 g(int var1) {
      this.q = var1;
      this.F().j(var1 + OT3.E);
      return this;
   }

   public Insets U() {
      return this.a;
   }

   public KE3 S(int var1) {
      return this.o(var1, var1, var1, var1);
   }

   public KE3 o(int var1, int var2, int var3, int var4) {
      return this.t(new Insets(var1, var2, var3, var4));
   }

   public KE3 t(Insets var1) {
      this.a = var1;
      return this;
   }

   public boolean z() {
      return this.M;
   }

   public void b(boolean var1) {
      this.M = var1;
   }

   public TD_2 F() {
      return (TD_2)super.getLayout();
   }

   public static TD_2 C() {
      return new TD_2(OT3.U + OT3.E);
   }

   public static void O(String var0) {
      r = var0;
   }

   public static String v() {
      return r;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (v() != null) {
         O("hhUHwc");
      }
   }
}





