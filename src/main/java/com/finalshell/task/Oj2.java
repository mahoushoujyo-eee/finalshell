package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.OX3;
import java.lang.reflect.InvocationTargetException;

public class Oj2 implements Runnable {
   public final OX3 U;

   public Oj2(OX3 var1) {
      this.U = var1;
   }

   @Override
   public void run() {
      Object var1 = 133173071882973546L;
      Ref.g(133173071882973546L, var1);
      Object var3 = 581062571413896186L;
      Ref.g(581062571413896186L, var3);
      Object var5 = 133173071882973546L;
      Ref.g(133173071882973546L, var5);
      Object var7 = 353004286530058057L;
      Ref.g(353004286530058057L, var7);
      Object var9 = 133173071882973546L;
      Object var10007 = Ref.g(133173071882973546L, var9);
      Object var11 = 353004286530058057L;
      var10007 = Registry.packArgs(var10007, Ref.g(353004286530058057L, var11));
      long var14 = 621461495980468759L;
      Object[] var13 = (Object[])var10007;
      Ref.h(621461495980468759L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }
   }
}





