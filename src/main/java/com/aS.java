package com;

import java.lang.ref.WeakReference;
import javax.swing.JComponent;

public class aS {
   private WeakReference D;
   private String p;
   private String Q;
   private Object G;
   private boolean I;
   private boolean v;

   public aS() {
   }

   public aS(JComponent var1, String var2, String var3, Object var4, boolean var5, boolean var6) {
      com.cl_4.I();
      super();
      this.p(var1);
      this.b(var2);
      this.h(var3);
      this.M(var4);
      this.O(var5);
      this.e(var6);
      if (com.ky_4.F() != null) {
         com.cl_4.A("Zjt7g");
      }
   }

   public JComponent l() {
      return (JComponent)this.D.get();
   }

   public void p(JComponent var1) {
      this.D = new WeakReference(var1);
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





