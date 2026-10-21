package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.SelectPrivateKeyDialog;
import java.lang.reflect.InvocationTargetException;

public class Ji2 implements Fb2 {
   public final SelectPrivateKeyDialog n;

   public Ji2(SelectPrivateKeyDialog var1) {
      this.n = var1;
   }

   @Override
   public void O(Ty4 var1) {
      Object[] var10001 = Registry.emptyArgs();
      long var3 = 542590257020999358L;
      Object[] var2 = var10001;
      var10001 = Ref.h(542590257020999358L, var2, var3);

      try {
         var11 = (Integer)var10001;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      if (var11 == Registry.lookupField(456349507517882113L).getInt(null)) {
         Object var4 = 288226878283328067L;
         Ref.g(288226878283328067L, var4);
         Object[] var10003 = Registry.emptyArgs();
         long var7 = 558869847402561022L;
         Object[] var6 = var10003;
         Ref.h(558869847402561022L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }
      }
   }
}





