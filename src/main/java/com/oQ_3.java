package com;

import java.awt.Dimension;
import java.io.File;
import java.io.FileFilter;
import javax.swing.ImageIcon;

public interface oQ_3 extends com.On_2, FileFilter {
   @Override
   boolean accept(File var1);

   ImageIcon Y(File var1, Dimension var2, boolean var3);

   @Override
   default boolean n(Object var1) {
      return this.accept((File)var1);
   }
}





