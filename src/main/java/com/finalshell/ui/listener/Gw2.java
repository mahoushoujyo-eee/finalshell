package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Zn2;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Gw2 implements ListSelectionListener {
   final Zn2 e;

   Gw2(Zn2 var1) {
      this.e = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      Zn2.g();
      Object var7 = 243378328671600383L;
      Object var10002 = Ref.g(243378328671600383L, var7);
      Object var9 = 589348336963751296L;
      Object var3 = ((JTable)Ref.g(589348336963751296L, var9)).getSelectedRow();
      Object var2 = var10002;
      var10002 = var3;
      if (var2 == null) {
         if (!(var3 > -1)) {
            return;
         }

         var10002 = this;
         Object var11 = 243378328671600383L;
         Ref.g(243378328671600383L, var11);
         Object var13 = 589348336963751296L;
         ((JTable)Ref.g(589348336963751296L, var13)).convertRowIndexToModel((int)var3);
      }

      Gw2 var4 = (Gw2)var10002;
      Object var15 = 243378328671600383L;
      Ref.g(243378328671600383L, var15);
      Object var17 = 589348336963751296L;
      String var5 = (String)((JTable)Ref.g(589348336963751296L, var17)).getValueAt((int)var4, 0);
      Object var19 = 243378328671600383L;
      Ref.g(243378328671600383L, var19);
      Object var21 = 329000354706190097L;
      String var6 = (String)((HashMap)Ref.g(329000354706190097L, var21)).get(var5);
      Object var23 = 243378328671600383L;
      Ref.g(243378328671600383L, var23);
      long var26 = 155460610212598962L;
      Ref.s(155460610212598962L, var6, var26);
      Object var27 = 243378328671600383L;
      Ref.g(243378328671600383L, var27);
      Object[] var10010 = Registry.emptyArgs();
      long var30 = 450058049632895301L;
      Object[] var29 = var10010;
      Ref.h(450058049632895301L, var29, var30);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }
   }
}





