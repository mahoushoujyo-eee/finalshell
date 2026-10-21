package com.finalshell.core;

public class Cy2 extends Exception {
   public static long serialVersionUID;
   public static int[] i;

   @Override
   public void printStackTrace() {
   }

   public static void c(int[] var0) {
      i = var0;
   }

   public static int[] u() {
      return i;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (u() == null) {
         c(new int[4]);
      }

      long var2 = 1033888976259585596L;
      long var10002 = 6193453239112299938L ^ var2;
      byte var10001 = -1;
      long var0 = var10002;
      serialVersionUID = var0;
   }
}





