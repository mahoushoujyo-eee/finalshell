package com.finalshell.core;

import java.util.Map;
import java.util.WeakHashMap;
import javax.swing.JComponent;

public abstract class EF3 extends E12 {
   public static Map J;

   protected static void t(JComponent var0, DN_2 var1) {
      J.put(var0, var1);
   }

   protected static boolean T(JComponent var0) {
      return J.containsKey(var0);
   }

   protected static DN_2 G(JComponent var0) {
      return (DN_2)J.get(var0);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      J = new WeakHashMap();
   }
}





