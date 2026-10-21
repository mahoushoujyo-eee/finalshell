package com.Z;

import java.io.File;
import javax.swing.Icon;
import javax.swing.filechooser.FileView;

public class MZ extends FileView {
   final com.Z.A b;

   public MZ(com.Z.A var1) {
      this.b = var1;
   }

   @Override
   public String getName(File var1) {
      return com.Cz_2.X(var1);
   }

   @Override
   public String getDescription(File var1) {
      return this.getTypeDescription(var1);
   }

   @Override
   public String getTypeDescription(File var1) {
      return com.Cz_2.T(var1);
   }

   @Override
   public Icon getIcon(File var1) {
      return com.Cz_2.B(var1);
   }
}





