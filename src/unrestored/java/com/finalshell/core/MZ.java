package com.finalshell.core;

import java.io.File;
import javax.swing.Icon;
import javax.swing.filechooser.FileView;

public class MZ extends FileView {
   public final A4_2 b;

   public MZ(A4_2 var1) {
      this.b = var1;
   }

   @Override
   public String getName(File var1) {
      return Cz2.X(var1);
   }

   @Override
   public String getDescription(File var1) {
      return this.getTypeDescription(var1);
   }

   @Override
   public String getTypeDescription(File var1) {
      return Cz2.T(var1);
   }

   @Override
   public Icon getIcon(File var1) {
      return Cz2.B(var1);
   }
}





