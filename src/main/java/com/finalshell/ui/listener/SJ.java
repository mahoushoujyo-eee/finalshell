package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class SJ implements ActionListener {
   public final ConnectionProperty n;

   public SJ(ConnectionProperty var1) {
      this.n = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var28;
      int var2 = ConnectionProperty.M$int();
      Object[] var10001 = Registry.emptyArgs();
      long var5 = 483219322811206313L;
      Object[] var4 = var10001;
      Ref.h(483219322811206313L, var4, var5);
      Object var10002 = Registry.emptyArgs();
      long var7 = 571514335693873067L;
      Object var6 = var10002;
      var10002 = Ref.h(571514335693873067L, var6, var7);

      try {
         var28 = (Boolean)var10002;
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

      if (var2 != 0) {
         var28 = !var28;
      }

      boolean var3 = var28;
      Object[] var10003 = Registry.emptyArgs();
      long var9 = 483219322811206313L;
      Object[] var8 = var10003;
      Ref.h(483219322811206313L, var8, var9);
      Object[] var10004 = Registry.packArgs(var3);
      long var11 = 137024548965563513L;
      Object[] var10 = var10004;
      Ref.h(137024548965563513L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      Object[] var10005 = Registry.emptyArgs();
      long var13 = 503550115260388056L;
      Object[] var12 = var10005;
      Ref.h(503550115260388056L, var12, var13);
      Object[] var10006 = Registry.packArgs(var3);
      long var15 = 137024548965563513L;
      Object[] var14 = var10006;
      Ref.h(137024548965563513L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      Object[] var10007 = Registry.packArgs(this.n);
      long var17 = 182560589671772498L;
      Object[] var16 = var10007;
      Ref.h(182560589671772498L, var16, var17);

      try {
         ;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      Registry.emptyArgs();
      long var18 = 270389152141252877L;
      Ref.h2(270389152141252877L, var18);
      Object[] var10009 = Registry.emptyArgs();
      long var21 = 578864097947885485L;
      Object[] var20 = var10009;
      Ref.h(578864097947885485L, var20, var21);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      this.n.T$void();
   }
}





