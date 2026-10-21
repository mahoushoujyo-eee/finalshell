package com.b;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileFilter;

public abstract class V extends FileFilter implements java.io.FileFilter, com.On_2 {
   private static com.ky_4[] W;

   public abstract ImageIcon b();

   @Override
   public abstract String getDescription();

   @Override
   public abstract boolean accept(File var1);

   @Override
   public boolean n(Object var1) {
      return this.accept((File)var1);
   }

   public static void Q(com.ky_4[] var0) {
      W = var0;
   }

   public static com.ky_4[] L() {
      return W;
   }

   static {
      if (L() == null) {
         Q(new com.ky_4[1]);
      }
   }
}





