package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.LocalMachinePanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Wj2 implements ActionListener {
   public final LocalMachinePanel d;

   public Wj2(LocalMachinePanel var1) {
      this.d = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var3 = 167008028615401489L;
      Ref.g(167008028615401489L, var3);
      Object var5 = 412103333330765630L;
      Ref.g(412103333330765630L, var5);
      String var10003 = (String)(Registry.emptyArgs());
      long var8 = 445746235927917450L;
      Object var7 = var10003;
      var10003 = Ref.h(445746235927917450L, var7, var8);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      String var2 = var10003;
      Object var9 = 167008028615401489L;
      Ref.g(167008028615401489L, var9);
      Object var11 = 412103333330765630L;
      Ref.g(412103333330765630L, var11);
      Object[] var10006 = Registry.emptyArgs();
      long var14 = 559196035657690421L;
      Object[] var13 = var10006;
      Ref.h(559196035657690421L, var13, var14);
      Object[] var10007 = Registry.packArgs(var2);
      long var16 = 564089453921198425L;
      Object[] var15 = var10007;
      Ref.h(564089453921198425L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }
   }
}





