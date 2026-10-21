package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBoxMenuItem;

public class Tw4 implements ActionListener {
   final JCheckBoxMenuItem u;
   final com.finalshell.ui.frame.U d;

   Tw4(com.finalshell.ui.frame.U var1, JCheckBoxMenuItem var2) {
      this.d = var1;
      this.u = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var3 = 320499158333428503L;
      boolean var2 = ((JCheckBoxMenuItem)Ref.g(320499158333428503L, var3)).isSelected();
      Registry.emptyArgs();
      long var5 = 270389152141252877L;
      Ref.h2(270389152141252877L, var5);
      Object[] var10003 = Registry.emptyArgs();
      long var8 = 306266403902896148L;
      Object[] var7 = var10003;
      Ref.h(306266403902896148L, var7, var8);
      Object[] var10004 = Registry.packArgs(var2);
      long var10 = 542391450237137501L;
      Object[] var9 = var10004;
      Ref.h(542391450237137501L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      Registry.emptyArgs();
      long var11 = 270389152141252877L;
      Ref.h2(270389152141252877L, var11);
      Object[] var10006 = Registry.emptyArgs();
      long var14 = 578864097947885485L;
      Object[] var13 = var10006;
      Ref.h(578864097947885485L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      Object var15 = 478820766842959448L;
      Ref.g(478820766842959448L, var15);
      Object[] var10008 = Registry.packArgs(var2);
      long var18 = 555658123259816064L;
      Object[] var17 = var10008;
      Ref.h(555658123259816064L, var17, var18);

      try {
         ;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }
   }
}





