package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.image.BufferedImage;

public class Kj4 {
   public BufferedImage W;
   public int p;
   public static Ky4[] P;

   public Kj4(BufferedImage var1, int var2) {
      this.W = var1;
      this.p = var2;
   }

   public static void C(Ky4[] var0) {
      P = var0;
   }

   public static Ky4[] d() {
      return P;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (d() == null) {
         C(new Ky4[4]);
      }
   }
}





