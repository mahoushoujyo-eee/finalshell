package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.lang.ref.WeakReference;
import javax.swing.JComponent;

public class AS {
   public WeakReference D;
   public String p;
   public String Q;
   public Object G;
   public boolean I;
   public boolean v;

   public AS() {
   }

   public AS(JComponent var1, String var2, String var3, Object var4, boolean var5, boolean var6) {
   super();
      Cl4_2.I();
      this.p(var1);
      this.b(var2);
      this.h(var3);
      this.M(var4);
      this.O(var5);
      this.e(var6);
      if (Ky4.F$arrString() != null) {
         Cl4_2.A$void("Zjt7g");
      }
   }

   public JComponent l() {
      return (JComponent)this.D.get();
   }

   public void p(JComponent var1) {
      this.D = new WeakReference<>(var1);
   }

   public String d() {
      return this.p;
   }

   public void b(String var1) {
      this.p = var1;
   }

   public String N() {
      return this.Q;
   }

   public void h(String var1) {
      this.Q = var1;
   }

   public Object L() {
      return this.G;
   }

   public void M(Object var1) {
      this.G = var1;
   }

   public boolean G() {
      return this.I;
   }

   public void O(boolean var1) {
      this.I = var1;
   }

   public boolean V() {
      return this.v;
   }

   public void e(boolean var1) {
      this.v = var1;
   }
}





