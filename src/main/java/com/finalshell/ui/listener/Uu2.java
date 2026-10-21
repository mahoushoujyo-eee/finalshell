package com.finalshell.ui.listener;

import com.finalshell.core.JR;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

public class Uu2 extends MouseAdapter {
   final JR Z;

   Uu2(JR var1) {
      this.Z = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      Object var5 = 581801849132350805L;
      int var2 = ((JR)Ref.g(581801849132350805L, var5)).columnAtPoint(var1.getPoint());
      Object var7 = 581801849132350805L;
      String var3 = ((JR)Ref.g(581801849132350805L, var7)).getColumnName(var2);
      Registry.emptyArgs();
      long var9 = 270389152141252877L;
      Ref.h2(270389152141252877L, var9);
      Object[] var10004 = Registry.emptyArgs();
      long var12 = 634817973682994708L;
      Object[] var11 = var10004;
      Ref.h(634817973682994708L, var11, var12);
      Object[] var10005 = Registry.emptyArgs();
      long var14 = 240567170779145617L;
      Object[] var13 = var10005;
      Ref.h(240567170779145617L, var13, var14);
      Object[] var10006 = Registry.emptyArgs();
      long var16 = 226341449505323490L;
      Object[] var15 = var10006;
      Ref.h(226341449505323490L, var15, var16);
      Object[] var10007 = Registry.emptyArgs();
      long var18 = 153346140499032202L;
      Object[] var17 = var10007;
      Ref.h(153346140499032202L, var17, var18);
      Object[] var10008 = Registry.emptyArgs();
      long var20 = 588059759001940511L;
      Object[] var19 = var10008;
      Ref.h(588059759001940511L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }
   }
}





