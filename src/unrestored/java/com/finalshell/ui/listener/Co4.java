package com.finalshell.ui.listener;

import com.finalshell.core.LD3_2;
import com.finalshell.core.Yy2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ProxySelectionPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Co4 implements ActionListener {
   public final ProxySelectionPanel I;

   public Co4(ProxySelectionPanel var1) {
      this.I = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var4 = 228699318299904884L;
      Ref.g(228699318299904884L, var4);
      Object var6 = 155517873227409293L;
      int var2 = ((Yy2)Ref.g(155517873227409293L, var6)).getSelectedRow();
      if (var2 > -1) {
         Object var8 = 228699318299904884L;
         Ref.g(228699318299904884L, var8);
         Object var10 = 318973214616786715L;
         Ref.g(318973214616786715L, var10);
         LD3_2 var10005 = (LD3_2)(Registry.packArgs(var2));
         long var13 = 548405852497465390L;
         Object var12 = var10005;
         var10005 = Ref.h(548405852497465390L, var12, var13);

         try {
            var10005 = (LD3_2)var10005;
         } catch (InvocationTargetException var19) {
            throw new RuntimeException(var19.getTargetException());
         }

         LD3_2 var3 = var10005;
         Object var14 = 228699318299904884L;
         Ref.g(228699318299904884L, var14);
         Object[] var10007 = Registry.packArgs(var3);
         long var17 = 293809111816395161L;
         Object[] var16 = var10007;
         Ref.h(293809111816395161L, var16, var17);

         try {
            ;
         } catch (InvocationTargetException var18) {
            throw new RuntimeException(var18.getTargetException());
         }
      }
   }
}





