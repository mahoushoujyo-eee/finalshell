package com.finalshell.ui.listener;

import com.finalshell.core.Qe2_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ShowDeletedPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MA implements ActionListener {
   public final Qe2_2 c;
   public final ShowDeletedPanel L;

   public MA(ShowDeletedPanel var1, Qe2_2 var2) {
      this.L = var1;
      this.c = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      label24: {
         String[] var2 = com.finalshell.ui.panel.F8.y();
         Object var3 = 390462967566602440L;
         boolean var10001 = ((Qe2_2)Ref.g(390462967566602440L, var3)).getModel().isSelected();
         if (var2 == null) {
            if (!var10001) {
               return;
            }

            Object var5 = 502923952788570949L;
            ShowDeletedPanel var10002 = (ShowDeletedPanel)Ref.g(502923952788570949L, var5);
            if (var2 != null) {
               break label24;
            }

            Registry.lookupField(455118846627771080L).getInt(var10002);
         }

         Object var7 = 502923952788570949L;
         if (this == Registry.lookupField(181494556387054133L).getInt(Ref.g(502923952788570949L, var7))) {
            return;
         }

         Object var9 = 502923952788570949L;
         ShowDeletedPanel var10003 = (ShowDeletedPanel)Ref.g(502923952788570949L, var9);
      }

      Object var11 = 502923952788570949L;
      Registry.lookupField(455118846627771080L).setInt(this, Registry.lookupField(181494556387054133L).getInt(Ref.g(502923952788570949L, var11)));
   }
}





