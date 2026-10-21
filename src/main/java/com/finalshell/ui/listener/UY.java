package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.AA;
import com.finalshell.ui.panel.RouteTracePanel2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;

public class UY implements ActionListener {
   public final RouteTracePanel2 b;

   public UY(RouteTracePanel2 var1) {
      this.b = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      AA.z();
      Object var4 = 167792870332698444L;
      Object var10002 = Ref.g(167792870332698444L, var4);
      Object var6 = 520858298081292913L;
      Object var3 = ((DefaultMutableTreeNode)Ref.g(520858298081292913L, var6)).getUserObject();
      Object var2 = var10002;
      boolean var30 = var3.getClass().equals(Ck4.class);
      if (var2 == null) {
         if (var30) {
            Object var8 = 167792870332698444L;
            Ref.g(167792870332698444L, var8);
            Object var10 = 131037384951395357L;
            Ref.g(131037384951395357L, var10);
            Object var12 = 167792870332698444L;
            Ref.g(167792870332698444L, var12);
            Object var14 = 520858298081292913L;
            Object[] var10007 = Registry.packArgs((DefaultMutableTreeNode)((DefaultMutableTreeNode)Ref.g(520858298081292913L, var14)).getParent());
            long var17 = 276002133797788160L;
            Object[] var16 = var10007;
            Ref.h(276002133797788160L, var16, var17);

            try {
               ;
            } catch (InvocationTargetException var29) {
               throw var29.getTargetException();
            }

            if (var2 == null) {
               return;
            }
         }

         var30 = var3.getClass().equals(Tf4.class);
      }

      if (var30) {
         Object var18 = 167792870332698444L;
         Ref.g(167792870332698444L, var18);
         Object var20 = 131037384951395357L;
         Ref.g(131037384951395357L, var20);
         Object var22 = 167792870332698444L;
         Ref.g(167792870332698444L, var22);
         Object var24 = 520858298081292913L;
         Object[] var31 = Registry.packArgs(Ref.g(520858298081292913L, var24));
         long var27 = 276002133797788160L;
         Object[] var26 = var31;
         Ref.h(276002133797788160L, var26, var27);

         try {
            ;
         } catch (InvocationTargetException var28) {
            throw var28.getTargetException();
         }
      }
   }
}





