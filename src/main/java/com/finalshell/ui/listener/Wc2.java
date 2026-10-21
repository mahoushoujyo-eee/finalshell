package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Address;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Wc2 implements ActionListener {
   final Address n;

   Wc2(Address var1) {
      this.n = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 515824492026471648L;
      Ref.g(515824492026471648L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 553191921490783868L;
      Object[] var4 = var10002;
      Ref.h(553191921490783868L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





