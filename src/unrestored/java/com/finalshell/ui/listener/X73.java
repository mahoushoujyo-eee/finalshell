package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ShowDeletedPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class X73 implements ActionListener {
   public final ShowDeletedPanel Y;

   public X73(ShowDeletedPanel var1) {
      this.Y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 609757617502681735L;
      Ref.g(609757617502681735L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 223159779086534801L;
      Object[] var4 = var10002;
      Ref.h(223159779086534801L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }
}





