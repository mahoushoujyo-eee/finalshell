package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import com.finalshell.ui.panel.CopyMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Kc2 implements ActionListener {
   public final AM H;
   public final CopyMenu F;

   public Kc2(CopyMenu var1, AM var2) {
      this.F = var1;
      this.H = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 389935200192627445L;
      Ref.g(389935200192627445L, var2);
      Object[] var10002 = Registry.packArgs(true);
      long var5 = 328322194154687590L;
      Object[] var4 = var10002;
      Ref.h(328322194154687590L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }
}





