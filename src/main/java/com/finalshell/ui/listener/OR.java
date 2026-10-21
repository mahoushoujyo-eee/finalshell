package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionContextMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class OR implements ActionListener {
   public final ConnectionContextMenu Y;

   public OR(ConnectionContextMenu var1) {
      this.Y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 272362718453817736L;
      Ref.g(272362718453817736L, var2);
      Object var4 = 131037384951395357L;
      Ref.g(131037384951395357L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 390638505757321329L;
      Object[] var6 = var10003;
      Ref.h(390638505757321329L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }
}





