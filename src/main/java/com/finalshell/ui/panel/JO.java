package com.finalshell.ui.panel;

import com.finalshell.core.D2;
import com.finalshell.core.Lt4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Graphics;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

public class JO extends JLabel implements D2 {
   public Lt4 D;
   public static int[] p;

   public JO() {
   super();
      z();
      Lt4 var10002 = new Lt4(this, this);
      long var3 = 143260386411168928L;
      Lt4 var2 = var10002;
      Ref.s(143260386411168928L, var2, var3);
      this.setOpaque(false);
      if (Ky4.F$arrString() != null) {
         X(new int[4]);
      }
   }

   public JO(String var1) {
   super(var1);
      int[] var10000 = z();
      int[] var2 = var10000;
      Lt4 var10001 = new Lt4(this, this);
      long var4 = 143260386411168928L;
      Lt4 var3 = var10001;
      Ref.s(143260386411168928L, var3, var4);
      this.setOpaque(false);
      if (var2 == null) {
         Ky4.K(new String[4]);
      }
   }

   @Override
   public void paintComponent(Graphics var1) {
      label29: {
         int[] var2 = z();
         if (var2 != null) {
            if (!Registry.lookupField(413132319533195410L).getBoolean(null)) {
               break label29;
            }

            Object var3 = 143260386411168928L;
            Ref.g(143260386411168928L, var3);
            Object[] var10002 = Registry.packArgs(var1);
            long var6 = 478374544918577864L;
            Object[] var5 = var10002;
            Ref.h(478374544918577864L, var5, var6);

            try {
               ;
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }
         }

         if (var2 != null) {
            return;
         }
      }

      Object[] var10001 = Registry.packArgs(var1);
      long var8 = 518428765726666319L;
      Object[] var7 = var10001;
      Ref.h(518428765726666319L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   @Override
   public void h(Graphics var1) {
      super.paintComponent(var1);
   }

   public static void X(int[] var0) {
      p = var0;
   }

   public static int[] z() {
      return p;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (z() == null) {
         X(new int[2]);
      }
   }
}





