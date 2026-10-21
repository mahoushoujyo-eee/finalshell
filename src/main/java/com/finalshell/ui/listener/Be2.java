package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import com.finalshell.ui.panel.CopyMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Be2 implements ActionListener {
   final AM y;
   final CopyMenu M;

   Be2(CopyMenu var1, AM var2) {
      this.M = var1;
      this.y = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 132578091704227005L;
      Ref.g(132578091704227005L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 561671179548957929L;
      Object[] var4 = var10002;
      Ref.h(561671179548957929L, var4, var5);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 216593732539740255L;
      Object[] var6 = var10003;
      Ref.h(216593732539740255L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }
}





