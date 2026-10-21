package com.finalshell.ui.listener;

import com.finalshell.core.Lj4_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CommandListPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Bd4 implements ActionListener {
   public final String W;
   public final CommandListPanel z;

   public Bd4(CommandListPanel var1, String var2) {
      this.z = var1;
      this.W = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var5 = 161079799752425796L;
      Ref.g(161079799752425796L, var5);
      Object var7 = 601657008259262484L;
      Ref.g(601657008259262484L, var7);
      Object[] var10003 = Registry.emptyArgs();
      long var10 = 194560825135347400L;
      Object[] var9 = var10003;
      Ref.h(194560825135347400L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      Object[] var10004 = Registry.emptyArgs();
      long var12 = 348047003824927685L;
      Object[] var11 = var10004;
      Lj4_2 var3 = (Lj4_2)Ref.h(348047003824927685L, var11, var12);
      Registry.emptyArgs();
      long var13 = 270389152141252877L;
      Ref.h2(270389152141252877L, var13);
      Object[] var10006 = Registry.emptyArgs();
      long var16 = 306266403902896148L;
      Object[] var15 = var10006;
      Ref.h(306266403902896148L, var15, var16);
      Object var17 = 606727952009104367L;
      Object var10008 = Registry.packArgs(Ref.g(606727952009104367L, var17));
      long var20 = 534852582493690392L;
      Object var19 = var10008;
      var10008 = Ref.h(534852582493690392L, var19, var20);

      try {
         var10008 = (com.finalshell.core.Li4)var10008;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      com.finalshell.core.Li4 var4 = var10008;
      Object var21 = 161079799752425796L;
      Ref.g(161079799752425796L, var21);
      Object var23 = 161079799752425796L;
      Object var10013 = Ref.g(161079799752425796L, var23);
      Object var25 = 597736782183485260L;
      Object[] var10012 = Registry.packArgs(this, var10013, Ref.g(597736782183485260L, var25), var4);
      long var28 = 471138128756400074L;
      Object[] var27 = var10012;
      Ref.h(471138128756400074L, var27, var28);

      try {
         ;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }
   }
}





