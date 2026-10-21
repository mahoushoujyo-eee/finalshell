package com;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

public class a extends JComponent implements SwingConstants {
   private int O;
   private int P;

   public a() {
      this(GO.FJ);
   }

   public a(int var1) {
      this(var1, -1);
   }

   public a(int var1, int var2) {
      com.FN.Y(this);
      this.M(var1);
      this.o(var2);
   }

   public int l() {
      return this.P;
   }

   public void o(int var1) {
      this.P = var1;
   }

   public int H() {
      return this.O;
   }

   public void M(int var1) {
      this.O = var1;
   }

   @Override
   public Dimension getPreferredSize() {
      String var10000 = xT_3.l();
      Container var2 = this.getParent();
      String var1 = var10000;
      Container var4 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return new Dimension(this.P != 1 ? this.O : 0, this.P != 0 ? this.O : 0);
         }

         var4 = var2;
      }

      LayoutManager var5 = var4.getLayout();
      if (var1 != null) {
         if (!(var5 instanceof com.TA)) {
            return new Dimension(this.P != 1 ? this.O : 0, this.P != 0 ? this.O : 0);
         }

         var5 = var2.getLayout();
      }

      com.TA var3 = (com.TA)var5;
      return new Dimension(var3.N() != 1 ? this.O : 0, var3.N() != 0 ? this.O : 0);
   }
}





