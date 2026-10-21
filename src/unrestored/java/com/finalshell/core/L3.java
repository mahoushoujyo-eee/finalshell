package com.finalshell.core;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class L3 extends Lz2_2 {
   public PF3 t;

   public L3() {
      this((PF3)null);
   }

   public L3(URL var1) {
      this(new PF3(var1));
   }

   public L3(String var1) {
      this(new PF3(var1));
   }

   public L3(ImageIcon var1) {
      this(new PF3(var1));
   }

   public L3(Image var1) {
      this(new PF3(var1));
   }

   public L3(BufferedImage var1) {
      this(new PF3(var1));
   }

   public L3(PF3 var1) {
      this.t = var1;
   }

   public PF3 X() {
      return this.t;
   }

   public void P(PF3 var1) {
      this.t = var1;
      this.Z();
   }

   @Override
   public Dimension d$Dimension(JComponent var1) {
      int[] var2 = Lz2_2.M();
      L3 var10000 = this;
      if (var2 == null) {
         if (this.t != null) {
            this.t.k(var1);
            return this.t.R();
         }

         var10000 = this;
      }

      return var10000.d$Dimension(var1);
   }

   @Override
   public Insets B(JComponent var1) {
      int[] var10000 = Lz2_2.M();
      Insets var3 = super.B(var1);
      int[] var2 = var10000;
      PF3 var4 = this.t;
      if (var2 == null) {
         if (this.t == null) {
            return var3;
         }

         var4 = this.t;
      }

      var4.k(var1);
      return FN.Z(var3, this.t.U$Insets());
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      int[] var4 = Lz2_2.M();
      PF3 var10000 = this.t;
      if (var4 == null) {
         if (this.t == null) {
            return;
         }

         this.t.k(var3);
         var10000 = this.t;
      }

      var10000.T(var3, var1);
   }
}





