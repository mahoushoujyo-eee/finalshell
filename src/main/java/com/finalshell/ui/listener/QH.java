package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

public class QH extends MouseAdapter {
   public final ClearListDialog w;

   public QH(ClearListDialog var1) {
      this.w = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (var1.getButton() == 3) {
         Object var2 = 312692875209881956L;
         Ref.g(312692875209881956L, var2);
         Object[] var10002 = Registry.emptyArgs();
         long var5 = 261923787966152983L;
         Object[] var4 = var10002;
         Ref.h(261923787966152983L, var4, var5);

         try {
            ;
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }
      }
   }
}





