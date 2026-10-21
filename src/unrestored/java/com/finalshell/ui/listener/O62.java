package com.finalshell.ui.listener;

import com.finalshell.core.T32;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import com.finalshell.ui.panel.Bq2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

public class O62 extends MouseAdapter {
   public final T32 s;
   public final AM W;
   public final Bq2 e;

   public O62(Bq2 var1, T32 var2, AM var3) {
      this.e = var1;
      this.s = var2;
      this.W = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String[] var10000 = AM.s$arrString();
      super.mouseReleased(var1);
      String[] var2 = var10000;
      if (var2 == null) {
         if (SwingUtilities.isRightMouseButton(var1)) {
            com.finalshell.core.Y9 var10001;
            Object var4 = 387610970704879223L;
            // [VF-super] super((T32)Ref.g(387610970704879223L, var4), ((Integer)Ref.g(454291477903395804L, null)).intValue());
            com.finalshell.core.Y9 var3 = var10001;
            Object[] var10002 = Registry.packArgs(var1);
            long var7 = 236847225442494468L;
            Object[] var6 = var10002;
            Ref.h(236847225442494468L, var6, var7);

            try {
               ;
            } catch (InvocationTargetException var20) {
               throw new RuntimeException(var20.getTargetException());
            }

            Object var8 = 342651914901974595L;
            Ref.g(342651914901974595L, var8);
            Object[] var10004 = Registry.packArgs(var3);
            long var11 = 484591085759846041L;
            Object[] var10 = var10004;
            Ref.h(484591085759846041L, var10, var11);

            try {
               ;
            } catch (InvocationTargetException var19) {
               throw new RuntimeException(var19.getTargetException());
            }
         }

         Object var12 = 342651914901974595L;
         Ref.g(342651914901974595L, var12);
         Object var14 = 387610970704879223L;
         Object[] var10003 = Registry.packArgs(Ref.g(387610970704879223L, var14));
         long var17 = 176011466134249595L;
         Object[] var16 = var10003;
         Ref.h(176011466134249595L, var16, var17);

         try {
            ;
         } catch (InvocationTargetException var18) {
            throw new RuntimeException(var18.getTargetException());
         }
      }
   }
}





