package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.ClearListDialog;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import org.jdesktop.swingx.JXList;

public class UF extends ComponentAdapter {
   public final ClearListDialog l;
   public static long a;

   public UF(ClearListDialog var1) {
      this.l = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      Object var4 = 513954246938583342L;
      Ref.g(513954246938583342L, var4);
      Object var6 = 369475678680292668L;
      int var2 = ((JXList)Ref.g(369475678680292668L, var6)).getCellBounds(0, 0).height;
      Object var8 = 513954246938583342L;
      Ref.g(513954246938583342L, var8);
      Object var10 = 369475678680292668L;
      int var3 = ((JXList)Ref.g(369475678680292668L, var10)).getHeight() / var2;
      var3 = (int)a;
      Object var12 = 513954246938583342L;
      Ref.g(513954246938583342L, var12);
      Object var14 = 369475678680292668L;
      ((JXList)Ref.g(369475678680292668L, var14)).setVisibleRowCount(var3);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 4742410471088708704L;
      long var10002 = -2686463112112645004L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





