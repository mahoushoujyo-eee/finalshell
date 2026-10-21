package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.ConnectionInfoPanel;
import com.finalshell.ui.panel.FilePermissionPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class UK3 implements ActionListener {
   public final FilePermissionPanel B;

   public UK3(FilePermissionPanel var1) {
      this.B = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = ConnectionInfoPanel.I();
      Object var4 = 469519602226110268L;
      Ref.g(469519602226110268L, var4);
      Object var6 = 515525013030853953L;
      Tf4 var10002 = (Tf4)Ref.g(515525013030853953L, var6);
      if (var2 != null) {
         if (var10002 == null) {
            return;
         }

         Object var8 = 469519602226110268L;
         Ref.g(469519602226110268L, var8);
         Object var10 = 515525013030853953L;
         Tf4 var10004 = (Tf4)Ref.g(515525013030853953L, var10);
      }

      String var10003 = (String)(Registry.emptyArgs());
      long var13 = 498856411508641826L;
      Object var12 = var10003;
      var10003 = Ref.h(498856411508641826L, var12, var13);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      String var3 = var10003;
      var10003 = var3;
      label35:
      if (var2 != null) {
         if (!var3.equals("/")) {
            var10003 = var3;
            if (var2 == null) {
               break label35;
            }

            if (!var3.endsWith("/")) {
               var3 = var3 + "/";
            }
         }

         var10003 = var3;
      }

      Registry.packArgs(var10003);
      long var14 = 396962080382410298L;
      Ref.h2(396962080382410298L, var14);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }
   }
}





