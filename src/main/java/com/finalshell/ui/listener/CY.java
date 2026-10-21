package com.finalshell.ui.listener;

import com.finalshell.core.Tq4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class CY implements MouseMotionListener {
   public final Tq4 L;

   public CY(Tq4 var1) {
      this.L = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      String[] var10000 = ClearListDialog.i$arrString();
      Point var3 = var1.getPoint();
      String[] var2 = var10000;
      if (var3 != null) {
         Object var4 = 547565734661310786L;
         Ref.g(547565734661310786L, var4);
         Object var6 = 547565734661310786L;
         Registry.lookupField(458852233453534750L).setInt(this, ((Tq4)Ref.g(547565734661310786L, var6)).rowAtPoint(var3));
      }

      Object var8 = 547565734661310786L;
      Tq4 var10001 = (Tq4)Ref.g(547565734661310786L, var8);
      if (var2 == null) {
         Registry.lookupField(410066848429556838L).getInt(var10001);
         Object var10 = 547565734661310786L;
         if (this != Registry.lookupField(458852233453534750L).getInt(Ref.g(547565734661310786L, var10))) {
            Object var12 = 547565734661310786L;
            ((Tq4)Ref.g(547565734661310786L, var12)).repaint();
         }

         Object var14 = 547565734661310786L;
         Tq4 var10003 = (Tq4)Ref.g(547565734661310786L, var14);
      }

      Object var16 = 547565734661310786L;
      Registry.lookupField(410066848429556838L).setInt(this, Registry.lookupField(458852233453534750L).getInt(Ref.g(547565734661310786L, var16)));
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
   }
}





