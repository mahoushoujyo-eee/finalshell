package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Zn2;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Gf2 implements ListSelectionListener {
   final Zn2 B;

   Gf2(Zn2 var1) {
      this.B = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      Zn2.g();
      Object var7 = 146602892415704347L;
      Object var10002 = Ref.g(146602892415704347L, var7);
      Object var9 = 610095513804326521L;
      Object var3 = ((JTable)Ref.g(610095513804326521L, var9)).getSelectedRow();
      Object var2 = var10002;
      var10002 = var3;
      if (var2 == null) {
         if (!(var3 > -1)) {
            return;
         }

         var10002 = this;
         Object var11 = 146602892415704347L;
         Ref.g(146602892415704347L, var11);
         Object var13 = 610095513804326521L;
         ((JTable)Ref.g(610095513804326521L, var13)).convertRowIndexToModel((int)var3);
      }

      Gf2 var4 = (Gf2)var10002;
      Object var15 = 146602892415704347L;
      Ref.g(146602892415704347L, var15);
      Object var17 = 237503863821638476L;
      Ref.g(237503863821638476L, var17);
      Object[] var10005 = Registry.packArgs((int)var4, 0);
      long var20 = 385417986641683923L;
      Object[] var19 = var10005;
      String var5 = (String)Ref.h(385417986641683923L, var19, var20);
      Object var21 = 146602892415704347L;
      Ref.g(146602892415704347L, var21);
      Object var23 = 329000354706190097L;
      String var6 = (String)((HashMap)Ref.g(329000354706190097L, var23)).get(var5);
      Object var25 = 146602892415704347L;
      Ref.g(146602892415704347L, var25);
      long var28 = 162058560421645924L;
      Ref.s(162058560421645924L, var6, var28);
      Object var29 = 146602892415704347L;
      Ref.g(146602892415704347L, var29);
      Object[] var10011 = Registry.emptyArgs();
      long var32 = 450058049632895301L;
      Object[] var31 = var10011;
      Ref.h(450058049632895301L, var31, var32);

      try {
         ;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }
   }
}





