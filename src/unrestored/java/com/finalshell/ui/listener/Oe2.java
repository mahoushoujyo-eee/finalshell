package com.finalshell.ui.listener;

import com.finalshell.core.Nd2_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.PortForwardEditDialog;
import com.finalshell.ui.model.BS;
import com.finalshell.ui.panel.AccelerateRdpHelpPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Oe2 implements ActionListener {
   public final AccelerateRdpHelpPanel s;

   public Oe2(AccelerateRdpHelpPanel var1) {
      this.s = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var5 = 159909307450376995L;
      Ref.g(159909307450376995L, var5);
      Object var7 = 201212363654675019L;
      int var2 = ((Nd2_2)Ref.g(201212363654675019L, var7)).getSelectedRow();
      if (var2 > -1) {
         Object var9 = 159909307450376995L;
         Ref.g(159909307450376995L, var9);
         Object var11 = 365946612787058696L;
         Ref.g(365946612787058696L, var11);
         BS var10005 = (BS)(Registry.packArgs(var2));
         long var14 = 397133340990525366L;
         Object var13 = var10005;
         var10005 = Ref.h(397133340990525366L, var13, var14);

         try {
            var10005 = (BS)var10005;
         } catch (InvocationTargetException var17) {
            throw new RuntimeException(var17.getTargetException());
         }

         BS var3 = var10005;
         Object var15 = 159909307450376995L;
         // [VF-super] super((AccelerateRdpHelpPanel)Ref.g(159909307450376995L, var15), var3, true);
      }
   }
}





