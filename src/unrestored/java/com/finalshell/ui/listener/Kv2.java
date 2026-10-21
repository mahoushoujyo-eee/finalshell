package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionContextMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Kv2 implements ActionListener {
   public final ConnectionContextMenu C;

   public Kv2(ConnectionContextMenu var1) {
      this.C = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 237415961875190828L;
      Ref.g(237415961875190828L, var2);
      Object var4 = 131037384951395357L;
      Ref.g(131037384951395357L, var4);
      Object[] var10003 = Registry.packArgs(true);
      long var7 = 330853429046648426L;
      Object[] var6 = var10003;
      Ref.h(330853429046648426L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw new RuntimeException(var8.getTargetException());
      }
   }
}





