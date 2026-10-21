package com.finalshell.task;

import com.finalshell.core.T32;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import com.finalshell.ui.panel.Bq2;
import java.awt.Dimension;
import java.awt.Insets;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JComponent;

public class YS implements Runnable {
   public final GE C;
   public static long a;

   public YS(GE var1) {
      this.C = var1;
   }

   @Override
   public void run() {
      AM.s$arrString();
      Object var9 = 328471596695417534L;
      Object var10002 = Ref.g(328471596695417534L, var9);
      Object var11 = 360214337880907660L;
      JComponent var2 = (JComponent)((AM)Ref.g(360214337880907660L, var11)).getParent();
      Object var1 = var10002;
      if (var2 != null) {
         Dimension var3;
         int var61;
         label32: {
            Object var13 = 328471596695417534L;
            Ref.g(328471596695417534L, var13);
            Object var15 = 360214337880907660L;
            var3 = ((AM)Ref.g(360214337880907660L, var15)).getPreferredSize();
            Object var17 = 328471596695417534L;
            Ref.g(328471596695417534L, var17);
            Object var19 = 360214337880907660L;
            Dimension var4 = ((AM)Ref.g(360214337880907660L, var19)).getSize();
            Object var21 = 328471596695417534L;
            Ref.g(328471596695417534L, var21);
            Object var23 = 360214337880907660L;
            ((AM)Ref.g(360214337880907660L, var23)).getBorder();
            Object var25 = 328471596695417534L;
            Object var10010 = Ref.g(328471596695417534L, var25);
            Object var27 = 360214337880907660L;
            Insets var5 = var10010.getBorderInsets((AM)Ref.g(360214337880907660L, var27));
            var61 = var5.bottom + var5.top;
            Object var29 = 328471596695417534L;
            Ref.g(328471596695417534L, var29);
            Object var31 = 360214337880907660L;
            Ref.g(360214337880907660L, var31);
            Object var33 = 417119238929760524L;
            int var10013 = ((ArrayList)Ref.g(417119238929760524L, var33)).size();
            if (var1 == null) {
               if (var10013 > 0) {
                  Object var35 = 328471596695417534L;
                  Ref.g(328471596695417534L, var35);
                  Object var37 = 360214337880907660L;
                  Ref.g(360214337880907660L, var37);
                  Object var39 = 417119238929760524L;
                  ArrayList var10016 = (ArrayList)Ref.g(417119238929760524L, var39);
                  Object var41 = 328471596695417534L;
                  Ref.g(328471596695417534L, var41);
                  Object var43 = 360214337880907660L;
                  Object var10019 = Ref.g(360214337880907660L, var43);
                  Object var45 = 417119238929760524L;
                  T32 var7 = (T32)var10019.get(((ArrayList)Ref.g(417119238929760524L, var45)).size() - 1);
                  Bq2 var10020 = (Bq2)(Registry.emptyArgs());
                  long var48 = 584096728105558414L;
                  Object[] var47 = var10020;
                  var10020 = Ref.h(584096728105558414L, var47, var48);

                  try {
                     var10020 = (Bq2)var10020;
                  } catch (InvocationTargetException var60) {
                     throw var60.getTargetException();
                  }

                  Bq2 var8 = var10020;
                  var61 = (int)((double)var61 + var8.getLocation().getY() + (double)var8.getHeight());
                  if (var1 == null) {
                     break label32;
                  }
               }

               var10013 = (int)var3.getHeight();
            }

            var61 = var10013;
         }

         Dimension var62 = new Dimension((int)var3.getWidth(), (int)a);
         var62.setSize((int)var3.getWidth(), var61);
         Object var49 = 328471596695417534L;
         Ref.g(328471596695417534L, var49);
         Object var51 = 360214337880907660L;
         ((AM)Ref.g(360214337880907660L, var51)).setMinimumSize(var62);
         var2.validate();
         var2.revalidate();
         var2.doLayout();
         var2.repaint();
         Object var53 = 328471596695417534L;
         Ref.g(328471596695417534L, var53);
         Object var55 = 360214337880907660L;
         Ref.g(360214337880907660L, var55);
         Object[] var10018 = Registry.emptyArgs();
         long var58 = 174626021968043090L;
         Object[] var57 = var10018;
         Ref.h(174626021968043090L, var57, var58);

         try {
            ;
         } catch (InvocationTargetException var59) {
            throw var59.getTargetException();
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 1129047837595683427L;
      long var10002 = 1341826856811252305L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





