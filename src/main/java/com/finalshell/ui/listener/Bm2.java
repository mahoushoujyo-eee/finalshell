package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.SyncPasswordDialog2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Bm2 implements ActionListener {
   final SyncPasswordDialog2 g;

   Bm2(SyncPasswordDialog2 var1) {
      this.g = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 134467010412844833L;
      Ref.g(134467010412844833L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 249566416557987503L;
      Object[] var4 = var10002;
      Ref.h(249566416557987503L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      Object var6 = 134467010412844833L;
      Ref.g(134467010412844833L, var6);
      Object[] var10004 = Registry.packArgs(false);
      long var9 = 392410176539816794L;
      Object[] var8 = var10004;
      Ref.h(392410176539816794L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }
}





