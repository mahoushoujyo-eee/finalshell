package com.finalshell.ui.listener;

import com.finalshell.core.Y12_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.LocalMachinePanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPopupMenu;

public class NF implements ActionListener {
   public final Y12_2 b;
   public final com.finalshell.core.C M;
   public final LocalMachinePanel u;

   public NF(LocalMachinePanel var1, Y12_2 var2, com.finalshell.core.C var3) {
      this.u = var1;
      this.b = var2;
      this.M = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var25;
      int var2 = LocalMachinePanel.i();
      if (var2 == 0) {
         Object var3 = 234982775223540525L;
         Ref.g(234982775223540525L, var3);
         Object var10002 = Registry.emptyArgs();
         long var6 = 410760064034581011L;
         Object var5 = var10002;
         var10002 = Ref.h(410760064034581011L, var5, var6);

         try {
            var25 = (Boolean)var10002;
         } catch (InvocationTargetException var23) {
            throw var23.getTargetException();
         }

         if (!var25) {
            Object var7 = 400719048193878452L;
            Ref.g(400719048193878452L, var7);
            Object[] var10004 = Registry.emptyArgs();
            long var10 = 381833051543402638L;
            Object[] var9 = var10004;
            Ref.h(381833051543402638L, var9, var10);
            Object var11 = 400719048193878452L;
            Ref.g(400719048193878452L, var11);
            Object var13 = 533402787991075064L;
            JPopupMenu var10006 = (JPopupMenu)Ref.g(533402787991075064L, var13);
            Object var15 = 550036671749391890L;
            com.finalshell.core.C var10008 = (com.finalshell.core.C)Ref.g(550036671749391890L, var15);
            Object var17 = 550036671749391890L;
            var10008.show(2, (int)this, ((com.finalshell.core.C)Ref.g(550036671749391890L, var17)).getHeight());
            if (var2 == 0) {
               return;
            }
         }
      }

      Object var19 = 400719048193878452L;
      Ref.g(400719048193878452L, var19);
      Object var21 = 533402787991075064L;
      ((JPopupMenu)Ref.g(533402787991075064L, var21)).setVisible(false);
   }
}





