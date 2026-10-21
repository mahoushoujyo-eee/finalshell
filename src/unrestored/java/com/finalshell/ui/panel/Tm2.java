package com.finalshell.ui.panel;

import javax.swing.JPanel;

public class Tm2 extends JPanel {
   public static int c;

   public static void R(int var0) {
      c = var0;
   }

   public static int o() {
      return c;
   }

   public static int r() {
      int var0 = o();
      return var0 == 0 ? 89 : 0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (o() == 0) {
         R(62);
      }
   }
}





