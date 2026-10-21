package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import com.finalshell.ui.panel.CopyMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Gy2_2 implements ActionListener {
   public final AM J;
   public final CopyMenu W;

   public Gy2_2(CopyMenu var1, AM var2) {
      this.W = var1;
      this.J = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 256956778913808031L;
      Ref.g(256956778913808031L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 561671179548957929L;
      Object[] var4 = var10002;
      Ref.h(561671179548957929L, var4, var5);
      Object var6 = 545773353728529344L;
      Ref.g(545773353728529344L, var6);
      Object var8 = 272626629694387105L;
      Object[] var10005 = Registry.packArgs(Ref.g(272626629694387105L, var8));
      long var11 = 185296114512803953L;
      Object[] var10 = var10005;
      Ref.h(185296114512803953L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }
}





