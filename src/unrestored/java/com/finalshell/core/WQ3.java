package com.finalshell.core;

import com.finalshell.ui.listener.BL;
import com.finalshell.ui.panel.Ky4;
import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

public class WQ3 extends TransferHandler {
   public static DataFlavor[] M;
   public BufferedImage H;
   public boolean m = true;

   public WQ3(JComponent var1, ImageIcon var2) {
      this(var1, Xg2.Z(var2));
   }

   public WQ3(JComponent var1, Image var2) {
      this(var1, Xg2.v(var2));
   }

   public WQ3(JComponent var1, BufferedImage var2) {
      this.f(var2);
      int var10000 = EY.P$int();
      var1.addMouseListener(new BL(this, var1));
      int var3 = var10000;
      if (Ky4.F$arrString() != null) {
         EY.U(++var3);
      }
   }

   public BufferedImage l$BufferedImage() {
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
   public Transferable createTransferable(JComponent var1) {
      return new EB(this);
   }

   public static DataFlavor[] r() {
      return M;
   }

   public static BufferedImage Y(WQ3 var0) {
      return var0.H;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      M = new DataFlavor[]{DataFlavor.imageFlavor};
   }
}





