package com.finalshell.ui.listener;

import com.finalshell.core.T32;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import com.finalshell.ui.panel.CopyMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Lp_4 implements ActionListener {
   public final AM w;
   public final T32 I;
   public final CopyMenu P;

   public Lp_4(CopyMenu var1, AM var2, T32 var3) {
      this.P = var1;
      this.w = var2;
      this.I = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 544996552895680695L;
      Ref.g(544996552895680695L, var2);
      Object var4 = 365315904702362553L;
      Object[] var10003 = Registry.packArgs(Ref.g(365315904702362553L, var4));
      long var7 = 367055708446946697L;
      Object[] var6 = var10003;
      Ref.h(367055708446946697L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw new RuntimeException(var8.getTargetException());
      }
   }
}





