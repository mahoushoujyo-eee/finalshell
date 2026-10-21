package com.finalshell.ui.listener;

import com.finalshell.core.NH;
import com.finalshell.core.YE;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.C12;
import com.finalshell.ui.panel.TunnelList;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

public class L7 implements MouseListener {
   final C12 h;
   final TunnelList B;
   final NH d;

   L7(NH var1, C12 var2, TunnelList var3) {
      this.d = var1;
      this.h = var2;
      this.B = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      TunnelList.V();
      Object var5 = 541009193423060093L;
      Object var3 = ((NH)Ref.g(541009193423060093L, var5)).rowAtPoint(var1.getPoint());
      L7 var10001 = var1.getButton();
      byte var10002 = 3;
      if (this != null) {
         label52: {
            if (var10001 == 3) {
               var10001 = this;
               Object var7 = 541009193423060093L;
               boolean var21 = ((NH)Ref.g(541009193423060093L, var7)).isRowSelected((int)var3);
               if (this == null) {
                  break label52;
               }

               if (!var21) {
                  Object var9 = 541009193423060093L;
                  ((NH)Ref.g(541009193423060093L, var9)).getSelectionModel().setSelectionInterval((int)var3, (int)var3);
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

      if (this != null) {
         if (var10001 != var10002) {
            return;
         }

         var10001 = (L7)var3;
         var10002 = -1;
      }

      if (var10001 > var10002) {
         Object var11 = 320906538225821202L;
         Ref.g(320906538225821202L, var11);
         YE var10003 = (YE)(Registry.packArgs((int)var3));
         long var14 = 619629146278140254L;
         Object[] var13 = var10003;
         var10003 = Ref.h(619629146278140254L, var13, var14);

         try {
            var10003 = (YE)var10003;
         } catch (InvocationTargetException var20) {
            throw var20.getTargetException();
         }

         YE var4 = var10003;
         Object var15 = 523481248465454277L;
         Ref.g(523481248465454277L, var15);
         Object[] var10005 = Registry.packArgs(var4);
         long var18 = 359557313276269404L;
         Object[] var17 = var10005;
         Ref.h(359557313276269404L, var17, var18);

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





