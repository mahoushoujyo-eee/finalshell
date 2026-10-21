package com.finalshell.ui.listener;

import com.finalshell.connection.Copy;
import com.finalshell.core.Y62_2;
import com.finalshell.core.YA3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class K82 implements ActionListener {
   public final Copy p;

   public K82(Copy var1) {
      this.p = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var5 = 218033707988579152L;
      Ref.g(218033707988579152L, var5);
      Object var7 = 406455305964270214L;
      int var2 = ((Y62_2)Ref.g(406455305964270214L, var7)).getSelectedRow();
      Object var9 = 218033707988579152L;
      Ref.g(218033707988579152L, var9);
      Object var11 = 406455305964270214L;
      int var3 = ((Y62_2)Ref.g(406455305964270214L, var11)).convertRowIndexToModel(var2);
      Object var13 = 218033707988579152L;
      Ref.g(218033707988579152L, var13);
      Object var15 = 347284645451059683L;
      Ref.g(347284645451059683L, var15);
      ArrayList var10007 = Registry.emptyArgs();
      long var18 = 530247999995353660L;
      Object[] var17 = var10007;
      var10007 = Ref.h(530247999995353660L, var17, var18);

      try {
         var10007 = (ArrayList)var10007;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      YA3_2 var4 = (YA3_2)var10007.get(var3);
      new StringBuilder();
      Object[] var10009 = Registry.emptyArgs();
      long var20 = 567652193651101967L;
      Object[] var19 = var10009;
      var10009 = Ref.h(567652193651101967L, var19, var20);

      try {
         var29 = (Integer)var10009;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      Registry.packArgs(var4.append(var29).append("").toString());
      long var21 = 396962080382410298L;
      Ref.h2(396962080382410298L, var21);

      try {
         ;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }
   }
}





