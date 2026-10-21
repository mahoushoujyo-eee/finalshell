package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SetExternalEditorPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class AZ implements ActionListener {
   final SetExternalEditorPanel H;

   AZ(SetExternalEditorPanel var1) {
      this.H = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var4 = 238068443595657962L;
      Object var10003 = Ref.g(238068443595657962L, var4);
      Object var6 = 450156560726681374L;
      Object var10004 = Ref.g(450156560726681374L, var6);
      String var10005 = (String)(Registry.emptyArgs());
      long var9 = 605430732347023634L;
      Object[] var8 = var10005;
      var10005 = Ref.h(605430732347023634L, var8, var9);

      try {
         var10005 = (String)var10005;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

new AZ(var10005);
      Registry.packArgs(var10003.getName());
      long var10 = 353935338506646766L;
      var10004 = Ref.h2(353935338506646766L, var10);

      try {
         var36 = (String)var10004;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      String var2 = var36;
      Object var12 = 238068443595657962L;
      Ref.g(238068443595657962L, var12);
      Object var14 = 571912682165835448L;
      Ref.g(571912682165835448L, var14);
      ArrayList var10007 = (ArrayList)(Registry.emptyArgs());
      long var17 = 339037510611298074L;
      Object[] var16 = var10007;
      var10007 = Ref.h(339037510611298074L, var16, var17);

      try {
         var10007 = (ArrayList)var10007;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      ArrayList var3 = var10007;
      var3.add(var2);
      Registry.emptyArgs();
      long var18 = 270389152141252877L;
      Ref.h2(270389152141252877L, var18);
      Object[] var10009 = Registry.emptyArgs();
      long var21 = 578864097947885485L;
      Object[] var20 = var10009;
      Ref.h(578864097947885485L, var20, var21);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      Object var22 = 238068443595657962L;
      Ref.g(238068443595657962L, var22);
      Object var24 = 166731455568463101L;
      Ref.g(166731455568463101L, var24);
      Object[] var10012 = Registry.emptyArgs();
      long var27 = 386440316720074980L;
      Object[] var26 = var10012;
      Ref.h(386440316720074980L, var26, var27);
      Object[] var10013 = Registry.packArgs(true);
      long var29 = 238680660514778174L;
      Object[] var28 = var10013;
      Ref.h(238680660514778174L, var28, var29);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }
   }
}





