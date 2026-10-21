package com.finalshell.ui.listener;

import com.finalshell.core.KV;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SettingsResetPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class LU_3 implements ActionListener {
   public final SettingsResetPanel t;

   public LU_3(SettingsResetPanel var1) {
      this.t = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = KV.b$arrString();
      Object var3 = 433441373524080022L;
      Ref.g(433441373524080022L, var3);
      Object var5 = 586501992965272398L;
      KV var10002 = (KV)Ref.g(586501992965272398L, var5);
      if (var2 == null) {
         if (var10002 == null) {
            return;
         }

         Object var7 = 433441373524080022L;
         Ref.g(433441373524080022L, var7);
         Object var9 = 586501992965272398L;
         KV var10004 = (KV)Ref.g(586501992965272398L, var9);
      }

      Object[] var10003 = Registry.emptyArgs();
      long var12 = 136645563955095288L;
      Object[] var11 = var10003;
      Ref.h(136645563955095288L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }
   }
}





