package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Bp2;
import com.finalshell.ui.panel.PathPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class TA implements ActionListener {
   public final com.finalshell.core.C Z;
   public final PathPanel N;

   public TA(PathPanel var1, com.finalshell.core.C var2) {
      this.N = var1;
      this.Z = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Ref.g(388376917454860932L, null);
      Object[] var10001 = Registry.packArgs(new Bp2(this));
      long var3 = 434592463220957006L;
      Object[] var2 = var10001;
      Ref.h(434592463220957006L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw new RuntimeException(var4.getTargetException());
      }
   }
}





