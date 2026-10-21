package com;

import java.awt.Component;
import java.awt.Graphics2D;

public abstract class aO {
   protected boolean h = true;
   protected Pt_2 D = Pt_2.unchecked;
   protected Pt_2 A = null;

   public boolean G() {
      return this.h;
   }

   public void a(boolean var1) {
      this.h = var1;
   }

   public Pt_2 H() {
      return this.D;
   }

   public void c(Pt_2 var1) {
      this.D = var1;
      this.A = null;
      this.F();
   }

   public Pt_2 m() {
      return this.A;
   }

   public void U(Pt_2 var1) {
      Pt_2 var3;
      label14: {
         boolean var2 = uE.Z();
         com.aO var10001 = this;
         if (!var2) {
            if (this.A != null) {
               var3 = this.A;
               break label14;
            }

            var10001 = this;
         }

         var3 = var10001.D;
      }

      this.D = var3;
      this.A = var1;
   }

   public abstract void G();

   public abstract void F();

   public abstract boolean B();

   public abstract void l();

   public abstract int L();

   public abstract int u();

   public abstract void O(Component var1, Graphics2D var2, int var3, int var4, int var5, int var6);
}





