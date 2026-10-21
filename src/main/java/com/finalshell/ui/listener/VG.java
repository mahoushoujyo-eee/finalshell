package com.finalshell.ui.listener;

import com.finalshell.core.T32;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AppendCarriageReturnCRPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class VG implements ActionListener {
   public final AppendCarriageReturnCRPanel p;

   public VG(AppendCarriageReturnCRPanel var1) {
      this.p = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var3 = 580916639675388688L;
      Ref.g(580916639675388688L, var3);
      Object var5 = 220282364724549275L;
      Ref.g(220282364724549275L, var5);
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
      Object var9 = 580916639675388688L;
      Ref.g(580916639675388688L, var9);
      Object[] var10005 = Registry.packArgs(var2);
      long var12 = 453881667189302194L;
      Object[] var11 = var10005;
      Ref.h(453881667189302194L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }
   }
}





