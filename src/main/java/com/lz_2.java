package com;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;

public abstract class Lz_2 implements com.og_4 {
   protected Boolean d = false;
   protected Dimension H = new Dimension(0, 0);
   protected Insets U = new Insets(0, 0, 0, 0);
   protected List c = new ArrayList(1);
   private static int[] V;

   @Override
   public void A(JComponent var1) {
   }

   @Override
   public void X(JComponent var1) {
   }

   @Override
   public Boolean d(JComponent var1) {
      return this.d;
   }

   public void g(Boolean var1) {
      this.d = var1;
      this.l();
   }

   @Override
   public Dimension d$Dimension(JComponent var1) {
      return this.H;
   }

   public void M(Dimension var1) {
      this.H = var1;
      this.x();
   }

   @Override
   public Insets B(JComponent var1) {
      return this.U;
   }

   public void Q(Insets var1) {
      this.U = var1;
      this.x();
   }

   public void X(int var1, int var2, int var3, int var4) {
      this.Q(new Insets(var1, var2, var3, var4));
   }

   public void z(int var1) {
      this.X(var1, var1, var1, var1);
   }

   @Override
   public void A(p5_2 var1) {
      this.c.add(var1);
   }

   @Override
   public void E(p5_2 var1) {
      this.c.remove(var1);
   }

   public void l() {
      int[] var10000 = M();
      Iterator var2 = com.aL.J((Collection)this.c).iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         p5_2 var3 = (p5_2)var2.next();
         var3.r();
         if (var1 != null) {
            break;
         }
      }
   }

   public void M(Rectangle var1) {
      this.u(var1.x, var1.y, var1.width, var1.height);
   }

   public void u(int var1, int var2, int var3, int var4) {
      int[] var10000 = M();
      Iterator var6 = com.aL.J((Collection)this.c).iterator();
      int[] var5 = var10000;

      while (var6.hasNext()) {
         p5_2 var7 = (p5_2)var6.next();
         var7.M(var1, var2, var3, var4);
         if (var5 != null) {
            break;
         }
      }
   }

   public void x() {
      int[] var10000 = M();
      Iterator var2 = com.aL.J((Collection)this.c).iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         p5_2 var3 = (p5_2)var2.next();
         var3.J();
         if (var1 != null) {
            break;
         }
      }
   }

   public void g() {
      int[] var10000 = M();
      Iterator var2 = com.aL.J((Collection)this.c).iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         p5_2 var3 = (p5_2)var2.next();
         var3.p();
         if (var1 != null) {
            break;
         }
      }
   }

   public void Z() {
      int[] var10000 = M();
      Iterator var2 = com.aL.J((Collection)this.c).iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         p5_2 var3 = (p5_2)var2.next();
         var3.p();
         var3.J();
         var3.r();
         if (var1 != null) {
            break;
         }
      }
   }

   protected Point J(int var1, int var2) {
      return new Point(var1, var2);
   }

   public static void d(int[] var0) {
      V = var0;
   }

   public static int[] M() {
      return V;
   }

   static {
      if (M() != null) {
         d(new int[1]);
      }
   }
}





