package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Connection4;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;

public class Qy2 implements MouseListener {
   public final Connection4 n;
   public static long a;

   public Qy2(Connection4 var1) {
      this.n = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int[] var2 = Connection4.I();
      if (var1.getButton() == 1) {
         Object var6 = 170719139226265942L;
         Ref.g(170719139226265942L, var6);
         DefaultMutableTreeNode var10002 = (DefaultMutableTreeNode)(Registry.packArgs(var1.getPoint()));
         long var9 = 229190360333115919L;
         Object[] var8 = var10002;
         var10002 = Ref.h(229190360333115919L, var8, var9);

         try {
            var10002 = (DefaultMutableTreeNode)var10002;
         } catch (InvocationTargetException var21) {
            throw var21.getTargetException();
         }

         DefaultMutableTreeNode var3 = var10002;
         if (var3 != null) {
            label44: {
               System.currentTimeMillis();
               Object var10 = 170719139226265942L;
               long var4 = this - Registry.lookupField(415368146415028056L).getLong(Ref.g(170719139226265942L, var10));
               long var26;
               Qy2 var10003 = (var26 = var4 - a) == 0L ? 0 : (var26 < 0L ? -1 : 1);
               if (var2 != null) {
                  if (!(var10003 > 0)) {
                     return;
                  }

                  var10003 = this;
                  Object var12 = 170719139226265942L;
                  Connection4 var10004 = (Connection4)Ref.g(170719139226265942L, var12);
                  if (var2 == null) {
                     break label44;
                  }

                  Object[] var10005 = Registry.packArgs(var3);
                  long var15 = 273277141783199649L;
                  Object[] var14 = var10005;
                  var10005 = Ref.h(273277141783199649L, var14, var15);

                  try {
                  } catch (InvocationTargetException var20) {
                     throw var20.getTargetException();
                  }
               }

               if (var10003 == null) {
                  return;
               }

               Object var16 = 170719139226265942L;
               Connection4 var24 = (Connection4)Ref.g(170719139226265942L, var16);
            }

            Object var18 = 285663222664681848L;
            ((com.finalshell.core.Km2)Ref.g(285663222664681848L, var18)).clearSelection();
         }
      }
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

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 4099623915440704107L;
      long var10002 = 4099623915440704415L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





