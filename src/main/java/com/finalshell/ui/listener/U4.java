package com.finalshell.ui.listener;

import com.finalshell.core.KV;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SystemInfoPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class U4 implements ActionListener {
   public final SystemInfoPanel w;

   public U4(SystemInfoPanel var1) {
      this.w = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = KV.b$arrString();
      Object var3 = 546998639759791835L;
      Ref.g(546998639759791835L, var3);
      Object var5 = 487595327584450503L;
      Ref.g(487595327584450503L, var5);
      String var10003 = (String)(Registry.emptyArgs());
      long var8 = 292557478156152530L;
      Object[] var7 = var10003;
      var10003 = Ref.h(292557478156152530L, var7, var8);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      if (var2 != null) {
         Registry.packArgs(var10003);
         long var15 = 486102265744107756L;
         Ref.h2(486102265744107756L, var15);

         try {
            ;
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }
      } else if (var10003 != null) {
         var10003 = this;
         Object var9 = 546998639759791835L;
         Ref.g(546998639759791835L, var9);
         Object var11 = 487595327584450503L;
         Ref.g(487595327584450503L, var11);
         Object[] var10006 = Registry.emptyArgs();
         long var14 = 292557478156152530L;
         Object[] var13 = var10006;
         Ref.h(292557478156152530L, var13, var14);

         label25:
         try {
            break label25;
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }
      }
   }
}





