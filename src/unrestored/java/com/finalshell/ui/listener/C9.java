package com.finalshell.ui.listener;

import com.finalshell.core.U62;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CompleteFullPathPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class C9 implements ActionListener {
   public final U62 q;
   public final int m;
   public final CompleteFullPathPanel t;

   public C9(CompleteFullPathPanel var1, U62 var2, int var3) {
      this.t = var1;
      this.q = var2;
      this.m = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 291041501170898130L;
      Ref.g(291041501170898130L, var2);
      Object[] var10002 = Registry.packArgs(((Integer)Ref.g(524579665746781176L, this)).intValue());
      long var5 = 521300695156736180L;
      Object[] var4 = var10002;
      Ref.h(521300695156736180L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw new RuntimeException(var11.getTargetException());
      }

      Registry.emptyArgs();
      long var6 = 270389152141252877L;
      Ref.h2(270389152141252877L, var6);
      Object[] var10004 = Registry.emptyArgs();
      long var9 = 578864097947885485L;
      Object[] var8 = var10004;
      Ref.h(578864097947885485L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw new RuntimeException(var10.getTargetException());
      }
   }
}





