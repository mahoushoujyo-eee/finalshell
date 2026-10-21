package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.NetworkMonitorPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

public class TU3 implements ActionListener {
   final NetworkMonitorPanel R;

   TU3(NetworkMonitorPanel var1) {
      this.R = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 324902839999849235L;
      Ref.g(324902839999849235L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 221034384446077256L;
      Object[] var4 = var10002;
      Ref.h(221034384446077256L, var4, var5);
      Object var6 = 324902839999849235L;
      Ref.g(324902839999849235L, var6);
      Object var8 = 119949875613775635L;
      Ref.g(119949875613775635L, var8);
      JLabel var10006 = Registry.emptyArgs();
      long var11 = 454489789944584533L;
      Object[] var10 = var10006;
      var10006 = Ref.h(454489789944584533L, var10, var11);

      try {
         var10006 = (JLabel)var10006;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      var10006.getText();
      Object var12 = 324902839999849235L;
      Ref.g(324902839999849235L, var12);
      Object var14 = 377738841635939563L;
      Object var10009 = Ref.g(377738841635939563L, var14);
      Object[] var10010 = Registry.emptyArgs();
      long var17 = 612402923891880410L;
      Object[] var16 = var10010;
      var10009 = Registry.packArgs(var10009, Ref.h(612402923891880410L, var16, var17));
      long var19 = 407547220859876749L;
      Object[] var18 = (Object[])var10009;
      Ref.h(407547220859876749L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }
   }
}





