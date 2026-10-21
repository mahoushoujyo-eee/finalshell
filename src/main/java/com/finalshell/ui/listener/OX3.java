package com.finalshell.ui.listener;

import com.finalshell.core.Fl4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Oj2;
import com.finalshell.ui.dialog.UpdateDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class OX3 implements ActionListener {
   final Fl4 A;
   final UpdateDialog k;

   OX3(UpdateDialog var1, Fl4 var2) {
      this.k = var1;
      this.A = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new Oj2(this));
      long var3 = 434592463220957006L;
      Object[] var2 = var10001;
      Ref.h(434592463220957006L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }
}





