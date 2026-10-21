package com.finalshell.task;

import com.finalshell.core.Km2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.ConnectionInfoPanel;
import java.lang.reflect.InvocationTargetException;

public class Ni2 implements Runnable {
   public final Tf4 G;
   public final String p;
   public final ConnectionInfoPanel O;

   public Ni2(ConnectionInfoPanel var1, Tf4 var2, String var3) {
      this.O = var1;
      this.G = var2;
      this.p = var3;
   }

   @Override
   public void run() {
      Object var2 = 603836458999646755L;
      Ref.g(603836458999646755L, var2);
      Object var4 = 608688273536518013L;
      Ref.g(608688273536518013L, var4);
      Object var6 = 605151501817846112L;
      Object[] var10004 = Registry.packArgs(Ref.g(605151501817846112L, var6));
      long var9 = 217942201414471271L;
      Object[] var8 = var10004;
      Ref.h(217942201414471271L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw new RuntimeException(var30.getTargetException());
      }

      Object var10 = 603836458999646755L;
      Ref.g(603836458999646755L, var10);
      Object var12 = 285663222664681848L;
      Ref.g(285663222664681848L, var12);
      Object var14 = 603711447625071769L;
      Object[] var10008 = Registry.packArgs(Ref.g(603711447625071769L, var14));
      long var17 = 287767492579901085L;
      Object[] var16 = var10008;
      Ref.h(287767492579901085L, var16, var17);

      try {
         ;
      } catch (InvocationTargetException var29) {
         throw new RuntimeException(var29.getTargetException());
      }

      Object var18 = 603836458999646755L;
      Ref.g(603836458999646755L, var18);
      Object var20 = 285663222664681848L;
      int var1 = ((Km2)Ref.g(285663222664681848L, var20)).getSelectedRow();
      if (var1 > -1) {
         Object var22 = 603836458999646755L;
         Ref.g(603836458999646755L, var22);
         Object var24 = 285663222664681848L;
         Ref.g(285663222664681848L, var24);
         Object[] var10013 = Registry.packArgs(var1);
         long var27 = 442091497690345581L;
         Object[] var26 = var10013;
         Ref.h(442091497690345581L, var26, var27);

         try {
            ;
         } catch (InvocationTargetException var28) {
            throw new RuntimeException(var28.getTargetException());
         }
      }
   }
}





