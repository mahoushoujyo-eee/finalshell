package com;

import java.util.Map;
import java.util.WeakHashMap;
import javax.swing.JComponent;

public abstract class eF_3 extends e1_2 {
   private static final Map J = new WeakHashMap();

   protected static void t(JComponent var0, com.DN var1) {
      J.put(var0, var1);
   }

   protected static boolean T(JComponent var0) {
      return J.containsKey(var0);
   }

   protected static com.DN G(JComponent var0) {
      return (com.DN)J.get(var0);
   }
}





