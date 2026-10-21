package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ShowDeletedPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Qs2 implements ActionListener {
   public final ShowDeletedPanel D;

   public Qs2(ShowDeletedPanel var1) {
      this.D = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 602772271279738308L;
      Ref.g(602772271279738308L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 258873058137482580L;
      Object[] var4 = var10002;
      Ref.h(258873058137482580L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }
}





