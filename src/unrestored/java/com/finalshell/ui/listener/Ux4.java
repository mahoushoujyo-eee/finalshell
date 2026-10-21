package com.finalshell.ui.listener;

import com.finalshell.core.Fl4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.UpdateDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Ux4 implements ActionListener {
   public final Fl4 y;
   public final UpdateDialog i;

   public Ux4(UpdateDialog var1, Fl4 var2) {
      this.i = var1;
      this.y = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Ref.g(388376917454860932L, null);
      Object[] var10001 = Registry.packArgs(new com.finalshell.task.F1(this));
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





