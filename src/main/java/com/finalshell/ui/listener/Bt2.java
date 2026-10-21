package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.Km4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Bt2 implements ActionListener {
   public final Km4 r;

   public Bt2(Km4 var1) {
      this.r = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      try {
         Object var3 = 288129705126756315L;
         Ref.g(288129705126756315L, var3);
         Object var5 = 288129705126756315L;
         Ref.g(288129705126756315L, var5);
         Object var7 = 193644890840143673L;
         Object[] var10004 = Registry.packArgs(Ref.g(193644890840143673L, var7), false);
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





