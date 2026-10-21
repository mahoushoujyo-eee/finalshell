package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileFilter;

public abstract class V3 extends FileFilter implements java.io.FileFilter, On2 {
   public static Ky4[] W;

   public abstract ImageIcon b();

   @Override
   public abstract String getDescription();

   @Override
   public abstract boolean accept(File var1);

   @Override
   public boolean n(Object var1) {
      return this.accept((File)var1);
   }

   public static void Q(Ky4[] var0) {
      W = var0;
   }

   public static Ky4[] L() {
      return W;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (L() == null) {
         Q(new Ky4[1]);
      }
   }
}





