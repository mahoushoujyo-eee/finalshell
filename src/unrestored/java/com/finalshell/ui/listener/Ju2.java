package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.SyncPasswordDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Ju2 implements ActionListener {
   public final SyncPasswordDialog e;

   public Ju2(SyncPasswordDialog var1) {
      this.e = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 261859577846792101L;
      Ref.g(261859577846792101L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 409215763224146997L;
      Object[] var4 = var10002;
      Ref.h(409215763224146997L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw new RuntimeException(var8.getTargetException());
      }

      Object var6 = 261859577846792101L;
      ((SyncPasswordDialog)Ref.g(261859577846792101L, var6)).setVisible(false);
   }
}





