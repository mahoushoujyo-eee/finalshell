package com.finalshell.ui.listener;

import com.finalshell.core.T32;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Copy3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Mf2 implements ActionListener {
   public final Copy3 o;

   public Mf2(Copy3 var1) {
      this.o = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var3 = 136093787869739022L;
      Ref.g(136093787869739022L, var3);
      Object var5 = 601657008259262484L;
      Ref.g(601657008259262484L, var5);
      T32 var10003 = (T32)(Registry.emptyArgs());
      long var8 = 194560825135347400L;
      Object[] var7 = var10003;
      var10003 = Ref.h(194560825135347400L, var7, var8);

      try {
         var10003 = (T32)var10003;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      T32 var2 = var10003;
      Object var9 = 136093787869739022L;
      Ref.g(136093787869739022L, var9);
      Object[] var10005 = Registry.packArgs(var2);
      long var12 = 402779243641663397L;
      Object[] var11 = var10005;
      Ref.h(402779243641663397L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }
   }
}





