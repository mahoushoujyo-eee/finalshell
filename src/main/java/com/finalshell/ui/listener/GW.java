package com.finalshell.ui.listener;

import com.finalshell.core.L1;
import com.finalshell.core.Tq4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GW implements ListSelectionListener {
   public final ClearListDialog n;

   public GW(ClearListDialog var1) {
      this.n = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      int var10004;
      label35: {
         ClearListDialog.i$arrString();
         Object var6 = 366138084933061716L;
         Object var10002 = Ref.g(366138084933061716L, var6);
         Object var8 = 618427502576624312L;
         Object var3 = ((Tq4)Ref.g(618427502576624312L, var8)).getSelectedRow();
         Object var2 = var10002;
         var10002 = var3;
         Object var10003 = -1;
         if (var2 == null) {
            if (!(var3 > -1)) {
               return;
            }

            var10002 = this;
            Object var10 = 366138084933061716L;
            var10003 = Ref.g(366138084933061716L, var10);
            Object var12 = 618427502576624312L;
            var10004 = ((Tq4)Ref.g(618427502576624312L, var12)).getModel().getRowCount();
            if (var2 != null) {
               break label35;
            }
         }

         if (var10002 <= var10003) {
            return;
         }

         Object var14 = 366138084933061716L;
         Ref.g(366138084933061716L, var14);
         Object var16 = 618427502576624312L;
         var10004 = ((Tq4)Ref.g(618427502576624312L, var16)).convertRowIndexToModel((int)var3);
      }

      int var4 = var10004;
      Object var18 = 366138084933061716L;
      Ref.g(366138084933061716L, var18);
      Object var20 = 598800499692003827L;
      Ref.g(598800499692003827L, var20);
      Object[] var10007 = Registry.packArgs(var4, 0);
      long var23 = 130061847059020450L;
      Object[] var22 = var10007;
      L1 var5 = (L1)Ref.h(130061847059020450L, var22, var23);
      Object var24 = 366138084933061716L;
      Ref.g(366138084933061716L, var24);
      Object var26 = 308394982418497131L;
      Ref.g(308394982418497131L, var26);
      Object[] var10010 = Registry.emptyArgs();
      long var29 = 348033953102046715L;
      Object[] var28 = var10010;
      Ref.h(348033953102046715L, var28, var29);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }
   }
}





