package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.SyncPasswordDialog2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Vx2 implements ActionListener {
   public final SyncPasswordDialog2 N;

   public Vx2(SyncPasswordDialog2 var1) {
      this.N = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 501610548039822751L;
      Ref.g(501610548039822751L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 186467677013912124L;
      Object[] var4 = var10002;
      Ref.h(186467677013912124L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





