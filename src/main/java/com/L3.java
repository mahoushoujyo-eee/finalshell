package com;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class L3 extends com.Lz_2 {
   protected pF_3 t;

   public L3() {
      this((pF_3)null);
   }

   public L3(URL var1) {
      this(new pF_3(var1));
   }

   public L3(String var1) {
      this(new pF_3(var1));
   }

   public L3(ImageIcon var1) {
      this(new pF_3(var1));
   }

   public L3(Image var1) {
      this(new pF_3(var1));
   }

   public L3(BufferedImage var1) {
      this(new pF_3(var1));
   }

   public L3(pF_3 var1) {
      this.t = var1;
   }

   public pF_3 X() {
      return this.t;
   }

   public void P(pF_3 var1) {
      this.t = var1;
      this.Z();
   }

   @Override
   public Dimension d(JComponent var1) {
      int[] var2 = com.Lz_2.M();
      com.L3 var10000 = this;
      if (var2 == null) {
         if (this.t != null) {
            this.t.k(var1);
            return this.t.R();
         }

         var10000 = this;
      }

      return var10000.d(var1);
   }

   @Override
   public Insets B(JComponent var1) {
      int[] var10000 = com.Lz_2.M();
      Insets var3 = super.B(var1);
      int[] var2 = var10000;
      pF_3 var4 = this.t;
      if (var2 == null) {
         if (this.t == null) {
            return var3;
         }

         var4 = this.t;
      }

      var4.k(var1);
      return com.FN.Z(var3, this.t.U());
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      int[] var4 = com.Lz_2.M();
      pF_3 var10000 = this.t;
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





