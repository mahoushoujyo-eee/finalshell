package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Uz4;
import com.finalshell.ui.panel.SendSyncMailPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Wy2 implements ActionListener {
   public final SendSyncMailPanel m;

   public Wy2(SendSyncMailPanel var1) {
      this.m = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Ref.g(388376917454860932L, null);
      Object[] var10001 = Registry.packArgs(new Uz4(this));
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





