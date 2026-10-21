package com.finalshell.ui.listener;

import com.finalshell.core.KV;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SystemInfoPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

public class R implements ActionListener {
   final SystemInfoPanel N;

   R(SystemInfoPanel var1) {
      this.N = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      KV.b$arrString();
      Object var4 = 444956171457752336L;
      Object var10002 = Ref.g(444956171457752336L, var4);
      Object var6 = 138927541502642713L;
      String var3 = ((JLabel)Ref.g(138927541502642713L, var6)).getText();
      Object var2 = var10002;
      var10002 = var3;
      if (var2 == null) {
         if (var3.equals("-")) {
            return;
         }

         var10002 = var3;
      }

      Registry.packArgs(var10002);
      long var8 = 396962080382410298L;
      Ref.h2(396962080382410298L, var8);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }
}





