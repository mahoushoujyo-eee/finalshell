package com.finalshell.ui.listener;

import com.finalshell.core.Yy2;
import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.Edit;
import com.finalshell.ui.panel.Ky4;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LU extends MouseAdapter {
   final Edit K;

   LU(Edit var1) {
      this.K = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      Ky4[] var2 = Edit.t();
      if (var2 == null) {
         super.mouseReleased(var1);
         if (var1.getButton() != 1) {
            return;
         }
      }

      Object var3 = 393319315918218150L;
      Ref.g(393319315918218150L, var3);
      Object var5 = 155517873227409293L;
      ((Yy2)Ref.g(155517873227409293L, var5)).clearSelection();
   }
}





