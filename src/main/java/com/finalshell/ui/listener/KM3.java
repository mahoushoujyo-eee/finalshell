package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.SelectPrivateKeyDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class KM3 implements ActionListener {
   public final SelectPrivateKeyDialog e;

   public KM3(SelectPrivateKeyDialog var1) {
      this.e = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 605048723702345762L;
      Ref.g(605048723702345762L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 271888329314383012L;
      Object[] var4 = var10002;
      Ref.h(271888329314383012L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





