package com.finalshell.core;

import com.finalshell.ui.model.On4;

// $VF: synthetic class
public class Iu2 {
   public static int[] P;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      P = new int[On4.values().length];

      try {
         P[On4.MOUSE_FORMAT_XTERM_EXT.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         P[On4.MOUSE_FORMAT_URXVT.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         P[On4.MOUSE_FORMAT_SGR.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      try {
         P[On4.MOUSE_FORMAT_XTERM.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
      }
   }
}





