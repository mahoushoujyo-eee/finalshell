package com.finalshell.ui.listener;

import com.finalshell.core.L1;
import com.finalshell.core.Tq4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.FT;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class KN implements ActionListener {
   public final FT B;
   public final Tq4 X;

   public KN(Tq4 var1, FT var2) {
      this.X = var1;
      this.B = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var5 = 199473169607852121L;
      int var2 = Ref.getInt(458852233453534750L, Ref.g(199473169607852121L, var5));
      Object var7 = 199473169607852121L;
      int var3 = ((Tq4)Ref.g(199473169607852121L, var7)).convertRowIndexToModel(var2);
      Object var9 = 128034187141345338L;
      Ref.g(128034187141345338L, var9);
      Object[] var10004 = Registry.packArgs(var3, var3);
      long var12 = 130061847059020450L;
      Object[] var11 = var10004;
      L1 var4 = (L1)Ref.h(130061847059020450L, var11, var12);
      Object[] var10005 = Registry.emptyArgs();
      long var14 = 542058094445767607L;
      Object[] var13 = var10005;
      Registry.packArgs(Ref.h(542058094445767607L, var13, var14));
      long var15 = 396962080382410298L;
      Ref.h2(396962080382410298L, var15);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw new RuntimeException(var17.getTargetException());
      }
   }
}





