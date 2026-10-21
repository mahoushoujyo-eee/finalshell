package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.SyncPasswordDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class CV3 implements ActionListener {
   final SyncPasswordDialog G;

   CV3(SyncPasswordDialog var1) {
      this.G = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 375587986114607423L;
      Ref.g(375587986114607423L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 593800601517963284L;
      Object[] var4 = var10002;
      Ref.h(593800601517963284L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





