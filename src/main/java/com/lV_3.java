package com;

import java.io.File;

public class lV_3 implements com.c8_2 {
   private static int[] Y;

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
      if (Z() == null) {
         Z(new int[2]);
      }
   }
}





