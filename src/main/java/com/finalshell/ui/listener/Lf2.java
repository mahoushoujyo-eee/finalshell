package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBoxMenuItem;

public class Lf2 implements ActionListener {
   final JCheckBoxMenuItem C;
   final com.finalshell.core.Kj2 L;
   final com.finalshell.ui.frame.U J;

   Lf2(com.finalshell.ui.frame.U var1, JCheckBoxMenuItem var2, com.finalshell.core.Kj2 var3) {
      this.J = var1;
      this.C = var2;
      this.L = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var3 = 438571043727846030L;
      boolean var2 = ((JCheckBoxMenuItem)Ref.g(438571043727846030L, var3)).isSelected();
      Object var5 = 294388469702703610L;
      Ref.g(294388469702703610L, var5);
      Object[] var10003 = Registry.packArgs(var2);
      long var8 = 137024548965563513L;
      Object[] var7 = var10003;
      Ref.h(137024548965563513L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      Object var9 = 238850161964236737L;
      Ref.g(238850161964236737L, var9);
      Object var11 = 208444474277099894L;
      Ref.g(208444474277099894L, var11);
      Object[] var10006 = Registry.emptyArgs();
      long var14 = 483219322811206313L;
      Object[] var13 = var10006;
      Ref.h(483219322811206313L, var13, var14);
      Object var15 = 438571043727846030L;
      Object[] var10008 = Registry.packArgs(((JCheckBoxMenuItem)Ref.g(438571043727846030L, var15)).isSelected());
      long var18 = 137024548965563513L;
      Object[] var17 = var10008;
      Ref.h(137024548965563513L, var17, var18);

      try {
         ;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      Registry.emptyArgs();
      long var19 = 270389152141252877L;
      Ref.h2(270389152141252877L, var19);
      Object[] var10010 = Registry.emptyArgs();
      long var22 = 578864097947885485L;
      Object[] var21 = var10010;
      Ref.h(578864097947885485L, var21, var22);

      try {
         ;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      Object var23 = 238850161964236737L;
      Ref.g(238850161964236737L, var23);
      Object var25 = 238850161964236737L;
      Ref.g(238850161964236737L, var25);
      Object var27 = 208444474277099894L;
      Object[] var10014 = Registry.packArgs(Ref.g(208444474277099894L, var27));
      long var30 = 182560589671772498L;
      Object[] var29 = var10014;
      Ref.h(182560589671772498L, var29, var30);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }
   }
}





