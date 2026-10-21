package com.finalshell.ui.listener;

import com.finalshell.core.KC;
import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.ConnectionInfoPanel;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Yt4 implements FocusListener {
   public final KC x;

   public Yt4(KC var1) {
      this.x = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
   }

   @Override
   public void focusLost(FocusEvent var1) {
      Object var2 = 169243950586061429L;
      Ref.g(169243950586061429L, var2);
      Object var4 = 489572751534480599L;
      ((ConnectionInfoPanel)Ref.g(489572751534480599L, var4)).stopEditing();
   }
}





