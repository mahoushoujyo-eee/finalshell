package com.finalshell.ui.listener;

import com.finalshell.core.Y12_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LC3 implements MouseListener {
   final Y12_2 f;
   public static long a;

   LC3(Y12_2 var1) {
      this.f = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      label16: {
         com.finalshell.ui.panel.F8.y();
         long var10001 = System.currentTimeMillis();
         Object var5 = 175824513233244249L;
         long var3 = this - Registry.lookupField(126803268638211778L).getLong(Ref.g(175824513233244249L, var5));
         long var2 = var10001;
         if (var2 == null) {
            if (var3 <= a) {
               break label16;
            }

            Object var7 = 175824513233244249L;
            Registry.lookupField(436558571101672386L).setBoolean(Ref.g(175824513233244249L, var7), false);
         }

         if (var2 == null) {
            return;
         }
      }

      Object var9 = 175824513233244249L;
      Registry.lookupField(436558571101672386L).setBoolean(Ref.g(175824513233244249L, var9), true);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 7839792761209487226L;
      long var10002 = 7839792761209487232L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





