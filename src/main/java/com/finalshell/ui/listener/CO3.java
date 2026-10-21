package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionContextMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class CO3 implements ActionListener {
   public final ConnectionContextMenu s;

   public CO3(ConnectionContextMenu var1) {
      this.s = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 332441495899066156L;
      Ref.g(332441495899066156L, var2);
      Object var4 = 270550610354043937L;
      Ref.g(270550610354043937L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 283087596964075372L;
      Object[] var6 = var10003;
      Ref.h(283087596964075372L, var6, var7);
      Object[] var10004 = Registry.emptyArgs();
      long var9 = 378734658016285263L;
      Object[] var8 = var10004;
      Ref.h(378734658016285263L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }
}





