package com.finalshell.ui.listener;

import com.finalshell.core.T32;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import com.finalshell.ui.panel.CopyMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class ZL implements ActionListener {
   public final AM X;
   public final T32 n;
   public final CopyMenu I;

   public ZL(CopyMenu var1, AM var2, T32 var3) {
      this.I = var1;
      this.X = var2;
      this.n = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 636140995249180411L;
      Ref.g(636140995249180411L, var2);
      Object var4 = 470677802895763455L;
      Object[] var10003 = Registry.packArgs(Ref.g(470677802895763455L, var4));
      long var7 = 228917422408595458L;
      Object[] var6 = var10003;
      Ref.h(228917422408595458L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }
}





