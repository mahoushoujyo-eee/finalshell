package com.finalshell.ui.listener;

import com.finalshell.core.T32;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import com.finalshell.ui.panel.Bq2;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

public class BC3 implements MouseListener {
   public final AM B;
   public final T32 I;
   public final Bq2 l;

   public BC3(Bq2 var1, AM var2, T32 var3) {
      this.l = var1;
      this.B = var2;
      this.I = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (var1.getButton() == 1) {
         Object var2 = 469467548237991397L;
         Ref.g(469467548237991397L, var2);
         Object var4 = 266445943636381636L;
         Object[] var10003 = Registry.packArgs(Ref.g(266445943636381636L, var4));
         long var7 = 228917422408595458L;
         Object[] var6 = var10003;
         Ref.h(228917422408595458L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var8) {
            throw new RuntimeException(var8.getTargetException());
         }
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





