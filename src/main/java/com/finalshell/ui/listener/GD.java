package com.finalshell.ui.listener;

import com.finalshell.core.KO3;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import com.finalshell.ui.panel.Yg2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GD extends MouseAdapter {
   final Yg2 H;
   public static long a;

   public GD(Yg2 var1) {
      this.H = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      String[] var2 = AM.s$arrString();
      if (var2 == null) {
         if (var1.getModifiers() != (int)a) {
            Object var3 = 394340410247477610L;
            Registry.lookupField(580065085137498223L).setBoolean(Ref.g(394340410247477610L, var3), true);
         }

         Object var5 = 394340410247477610L;
         ((Yg2)Ref.g(394340410247477610L, var5)).repaint();
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      Object var2 = 394340410247477610L;
      Registry.lookupField(580065085137498223L).setBoolean(Ref.g(394340410247477610L, var2), false);
      Object var4 = 394340410247477610L;
      ((Yg2)Ref.g(394340410247477610L, var4)).repaint();
   }

   GD(Yg2 var1, KO3 var2) {
      this(var1);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 7755986918984966462L;
      long var10002 = 574520850945728814L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





