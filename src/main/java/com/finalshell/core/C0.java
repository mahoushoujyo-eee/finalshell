package com.finalshell.core;

// $VF: synthetic class
public class C0 {
   static int[] k;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      k = new int[com.finalshell.ui.model.GV.values().length];

      try {
         k[com.finalshell.ui.model.GV.HEADER.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         k[com.finalshell.ui.model.GV.DATA.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         k[com.finalshell.ui.model.GV.CANCEL.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}





