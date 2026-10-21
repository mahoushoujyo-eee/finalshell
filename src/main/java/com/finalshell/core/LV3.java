package com.finalshell.core;

import java.io.File;

public class LV3 implements C82 {
   public static int[] Y;

   public String z(File var1) {
      return var1.getName();
   }

   @Override
   public String C(Object var1) {
      return this.z((File)var1);
   }

   public static void Z(int[] var0) {
      Y = var0;
   }

   public static int[] Z() {
      return Y;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (Z() == null) {
         Z(new int[2]);
      }
   }
}





