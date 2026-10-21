package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.NetworkMonitorPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

public class Y32 extends MouseAdapter {
   public final NetworkMonitorPanel R;

   public Y32(NetworkMonitorPanel var1) {
      this.R = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      super.mouseClicked(var1);
      Registry.emptyArgs();
      long var2 = 270389152141252877L;
      Ref.h2(270389152141252877L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 579658074404235868L;
      Object[] var4 = var10002;
      Ref.h(579658074404235868L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }
}





