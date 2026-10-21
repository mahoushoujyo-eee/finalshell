package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.DU;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Cq4 implements ActionListener {
   public final DU v;

   public Cq4(DU var1) {
      this.v = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 166071252229081328L;
      Ref.g(166071252229081328L, var2);
      Object[] var10002 = Registry.packArgs(false);
      long var5 = 428799125269163538L;
      Object[] var4 = var10002;
      Ref.h(428799125269163538L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





