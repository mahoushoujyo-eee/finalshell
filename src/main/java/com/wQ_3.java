package com;

import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

public class wQ_3 extends TransferHandler {
   private static final DataFlavor[] M = new DataFlavor[]{DataFlavor.imageFlavor};
   private BufferedImage H;
   private boolean m = true;

   public wQ_3(JComponent var1, ImageIcon var2) {
      this(var1, Xg_2.Z(var2));
   }

   public wQ_3(JComponent var1, Image var2) {
      this(var1, Xg_2.v(var2));
   }

   public wQ_3(JComponent var1, BufferedImage var2) {
      this.f(var2);
      int var10000 = EY.P();
      var1.addMouseListener(new com.BL(this, var1));
      int var3 = var10000;
      if (com.ky_4.F() != null) {
         EY.U(++var3);
      }
   }

   public BufferedImage l() {
      return this.H;
   }

   public void f(BufferedImage var1) {
      this.H = var1;
   }

   public boolean l$boolean() {
      return this.m;
   }

   public void k(boolean var1) {
      this.m = var1;
   }

   @Override
   public int getSourceActions(JComponent var1) {
      return 1;
   }

   @Override
   protected Transferable createTransferable(JComponent var1) {
      return new EB(this);
   }

   static DataFlavor[] r() {
      return M;
   }

   static BufferedImage Y(wQ_3 var0) {
      return var0.H;
   }
}





