package com.finalshell.core;

import com.finalshell.ui.model.Pt2;
import java.awt.Component;
import java.awt.Graphics2D;

public abstract class AO_2 {
   public boolean h = true;
   public Pt2 D = Pt2.unchecked;
   public Pt2 A = null;

   public boolean G$boolean() {
      return this.h;
   }

   public void a(boolean var1) {
      this.h = var1;
   }

   public Pt2 H() {
      return this.D;
   }

   public void c(Pt2 var1) {
      this.D = var1;
      this.A = null;
      this.F();
   }

   public Pt2 m() {
      return this.A;
   }

   public void U(Pt2 var1) {
      Pt2 var3;
      label14: {
         boolean var2 = UE.Z();
         AO_2 var10001 = this;
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

   public abstract void G$void();

   public abstract void F();

   public abstract boolean B();

   public abstract void l();

   public abstract int L();

   public abstract int u();

   public abstract void O(Component var1, Graphics2D var2, int var3, int var4, int var5, int var6);
}





