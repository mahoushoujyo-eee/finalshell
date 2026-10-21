package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.ClearListDialog;
import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class KT3 implements AWTEventListener {
   final ClearListDialog F;
   public static long a;

   KT3(ClearListDialog var1) {
      this.F = var1;
   }

   @Override
   public void eventDispatched(AWTEvent var1) {
      String[] var2 = ClearListDialog.i$arrString();
      AWTEvent var10000 = var1;
      if (var2 == null) {
         if (!(var1 instanceof MouseEvent)) {
            return;
         }

         var10000 = var1;
      }

      label50: {
         MouseEvent var3 = (MouseEvent)var10000;
         int var15 = var3.getID();
         if (var2 == null) {
            if (var15 != (int)a) {
               return;
            }

            var10000 = (AWTEvent)var1.getSource();
            if (var2 != null) {
               break label50;
            }

            var15 = (var10000 instanceof Component) ? 1 : 0;
         }

         if (var15 == 0) {
            return;
         }

         var10000 = (AWTEvent)var3.getSource();
      }

      Component var4 = (Component)var10000;
      Window var5 = SwingUtilities.getWindowAncestor(var4);
      Object var7 = 578836127842838180L;
      Ref.g(578836127842838180L, var7);
      Object var9 = 618427502576624312L;
      Window var6 = SwingUtilities.getWindowAncestor((Tq4)Ref.g(618427502576624312L, var9));
      if (var2 != null || var5 != null) {
         Object var11 = 578836127842838180L;
         Object var10004 = Ref.g(578836127842838180L, var11);
         Object var13 = 334241381080505095L;
         boolean var17 = var10004.equals((Dv2)Ref.g(334241381080505095L, var13));
         if (var2 == null) {
            if (var17) {
               return;
            }

            var17 = var5.equals(var6);
         }

         if (!var17) {
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 1894109234482483448L;
      long var10002 = 6868018269075116301L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





