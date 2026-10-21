package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Fd4 implements ActionListener {
   public final com.finalshell.ui.frame.MainFrame O;

   public Fd4(com.finalshell.ui.frame.MainFrame var1) {
      this.O = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 524137627140263158L;
      Ref.g(524137627140263158L, var2);
      Object[] var10002 = Registry.packArgs(Registry.lookupField(613893959659572417L).get(null));
      long var5 = 510227890552392495L;
      Object[] var4 = var10002;
      Ref.h(510227890552392495L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





