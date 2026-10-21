package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

public class JT {
   public static Map U;

   public ImageIcon P(String var1) {
      Object[] var10001 = Registry.packArgs(this.getClass(), var1);
      long var3 = 250722249728895787L;
      Object[] var2 = var10001;
      var10001 = Ref.h(250722249728895787L, var2, var3);

      try {
         return (ImageIcon)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public ImageIcon l(java.lang.Class var1, String var2) {
      String var3 = var1.getCanonicalName() + ":" + var2;
      if (!((Map)Registry.lookupField(536270001736964625L).get(null)).containsKey(var3)) {
         ((Map)Registry.lookupField(536270001736964625L).get(null)).put(var3, new ImageIcon(var1.getResource("/" + var2)));
      }

      return (ImageIcon)((Map)Registry.lookupField(536270001736964625L).get(null)).get(var3);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      U = new HashMap();
   }
}





