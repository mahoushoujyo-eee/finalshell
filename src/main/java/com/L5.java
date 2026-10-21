package com;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class L5 extends com.Lz_2 {
   protected boolean p = true;
   protected int E = GO.Fx;
   protected boolean A = false;
   protected int Q = GO.FG;
   protected boolean f = true;
   protected boolean v = true;

   public boolean h() {
      return this.p;
   }

   public void R(boolean var1) {
      this.p = var1;
      this.l();
   }

   public int R() {
      return this.E;
   }

   public void e(int var1) {
      this.E = var1;
      this.l();
   }

   public boolean k() {
      return this.A;
   }

   public void r(boolean var1) {
      this.A = var1;
      this.l();
   }

   public int q() {
      return this.Q;
   }

   public void u(int var1) {
      this.Q = var1;
      this.Z();
   }

   public boolean O() {
      return this.f;
   }

   public void E(boolean var1) {
      this.f = var1;
      this.l();
   }

   public boolean X() {
      return this.v;
   }

   public void l(boolean var1) {
      this.v = var1;
      this.l();
   }

   @Override
   public Insets B(JComponent var1) {
      return new Insets(this.Q + 1, this.Q + 1, this.Q + 1, this.Q + 1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      int[] var4 = com.Lz_2.M();
      if (this.p) {
         Color var5;
         label20: {
            label19: {
               boolean var10002 = this.A;
               if (var4 == null) {
                  if (!this.A) {
                     break label19;
                  }

                  var10002 = var3.isFocusOwner();
               }

               if (var10002) {
                  var5 = GO.c;
                  break label20;
               }
            }

            var5 = GO.r;
         }

         GA.r(var1, var3, var5, this.Q, this.E, this.f, this.v);
      }
   }
}





