package com.finalshell.ui.listener;

import com.finalshell.core.Kn2;
import com.finalshell.core.L1;
import com.finalshell.core.Tq4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import com.finalshell.ui.model.FT;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Ls4 implements ActionListener {
   public final FT A;
   public final Tq4 K;

   public Ls4(Tq4 var1, FT var2) {
      this.K = var1;
      this.A = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      ClearListDialog.i$arrString();
      Object var6 = 227955166530258715L;
      int var3 = Registry.lookupField(458852233453534750L).getInt(Ref.g(227955166530258715L, var6));
      Object var8 = 227955166530258715L;
      int var4 = ((Tq4)Ref.g(227955166530258715L, var8)).convertRowIndexToModel(var3);
      Object var10 = 366436206562462036L;
      Ref.g(366436206562462036L, var10);
      Object[] var10004 = Registry.packArgs(var4, var4);
      long var13 = 130061847059020450L;
      Object[] var12 = var10004;
      L1 var5 = (L1)Ref.h(130061847059020450L, var12, var13);
      Object var14 = 227955166530258715L;
      Ref.g(227955166530258715L, var14);
      Object var16 = 381104070567601967L;
      Kn2 var10006 = (Kn2)Ref.g(381104070567601967L, var16);
      if (this == null) {
         if (var10006 == null) {
            return;
         }

         Object var18 = 227955166530258715L;
         Ref.g(227955166530258715L, var18);
         Object var20 = 381104070567601967L;
         Kn2 var10008 = (Kn2)Ref.g(381104070567601967L, var20);
      }

      Object[] var10007 = Registry.packArgs(var5, var4);
      long var23 = 414178159384947080L;
      Object[] var22 = var10007;
      Ref.h(414178159384947080L, var22, var23);

      try {
         ;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }
   }
}





