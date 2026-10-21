package com.finalshell.ui.listener;

import com.finalshell.core.LQ;
import com.finalshell.core.ZG_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Oa4;
import com.finalshell.ui.panel.SwitchTabCommand;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

public class JF implements MouseListener {
   public final Oa4 x;
   public final SwitchTabCommand K;
   public final LQ S;

   public JF(LQ var1, Oa4 var2, SwitchTabCommand var3) {
      this.S = var1;
      this.x = var2;
      this.K = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      SwitchTabCommand.B();
      Object var5 = 176164739172737231L;
      int var3 = ((LQ)Ref.g(176164739172737231L, var5)).rowAtPoint(var1.getPoint());
      JF var10001 = var1.getButton();
      byte var10002 = 3;
      if (this != null) {
         label44: {
            if (var10001 == null) {
               var10001 = this;
               Object var7 = 176164739172737231L;
               boolean var21 = ((LQ)Ref.g(176164739172737231L, var7)).isRowSelected(var3);
               if (this == null) {
                  break label44;
               }

               if (!var21) {
                  Object var9 = 176164739172737231L;
                  ((LQ)Ref.g(176164739172737231L, var9)).getSelectionModel().setSelectionInterval(var3, var3);
               }
            }

            var10001 = var1.getButton();
         }

         var10002 = 1;
      }

      if (this != null) {
         if (var10001 != var10002) {
            return;
         }

         var10001 = var1.getClickCount();
         var10002 = 2;
      }

      if (var10001 == var10002) {
         Object var11 = 152770326095145004L;
         Ref.g(152770326095145004L, var11);
         ZG_2 var10003 = (ZG_2)(Registry.packArgs(var3));
         long var14 = 274266531369243862L;
         Object[] var13 = var10003;
         var10003 = Ref.h(274266531369243862L, var13, var14);

         try {
            var10003 = (ZG_2)var10003;
         } catch (InvocationTargetException var20) {
            throw var20.getTargetException();
         }

         ZG_2 var4 = var10003;
         Object var15 = 530033461434861960L;
         Ref.g(530033461434861960L, var15);
         Object[] var10005 = Registry.packArgs(var4);
         long var18 = 536313935565337962L;
         Object[] var17 = var10005;
         Ref.h(536313935565337962L, var17, var18);

         try {
            ;
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
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





