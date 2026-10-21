package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.Km4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class YW3 implements ActionListener {
   final Km4 K;

   YW3(Km4 var1) {
      this.K = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      try {
         Object var3 = 635225043359504505L;
         Ref.g(635225043359504505L, var3);
         Object var5 = 635225043359504505L;
         Ref.g(635225043359504505L, var5);
         Object var7 = 193644890840143673L;
         Object[] var10004 = Registry.packArgs(Ref.g(193644890840143673L, var7), true);
         long var10 = 628885630814220039L;
         Object[] var9 = var10004;
         Ref.h(628885630814220039L, var9, var10);

         try {
            ;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }
      } catch (Exception var12) {
         var12.printStackTrace();
      }
   }
}





