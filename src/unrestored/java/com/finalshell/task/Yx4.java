package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import com.finalshell.ui.panel.Bq2;
import com.finalshell.ui.panel.Yg2;
import java.awt.Point;
import java.lang.reflect.InvocationTargetException;

public class Yx4 implements Runnable {
   public final int U;
   public final Di2 M;

   public Yx4(Di2 var1, int var2) {
      this.M = var1;
      this.U = var2;
   }

   @Override
   public void run() {
      Object var1;
      Bq2 var10004;
      label59: {
         label58: {
            AM.s$arrString();
            Object var3 = 554051037585710089L;
            Object var10002 = Ref.g(554051037585710089L, var3);
            Object var5 = 128810952447237716L;
            Point var2 = ((Bq2)Ref.g(128810952447237716L, var5)).getMousePosition();
            var1 = var10002;
            var10002 = var2;
            if (var1 == null) {
               if (var2 != null) {
                  break label58;
               }

               var10002 = this;
               Object var7 = 554051037585710089L;
               Ref.g(554051037585710089L, var7);
               Object var9 = 128810952447237716L;
               var10004 = (Bq2)Ref.g(128810952447237716L, var9);
               if (var1 != null) {
                  break label59;
               }

               Object var11 = 275545539772972982L;
               ((Yg2)Ref.g(275545539772972982L, var11)).getMousePosition();
            }

            if (var10002 == null) {
               return;
            }
         }

         Object var13 = 554051037585710089L;
         Ref.g(554051037585710089L, var13);
         Object var15 = 128810952447237716L;
         var10004 = (Bq2)Ref.g(128810952447237716L, var15);
      }

      Object var44 = Registry.lookupField(515313227049281099L).getBoolean(var10004);
      if (var1 == null) {
         if (var44 == null) {
            return;
         }

         var44 = Registry.emptyArgs();
         long var17 = 270389152141252877L;
         Ref.h2(270389152141252877L, var17);
         Object[] var10006 = Registry.emptyArgs();
         long var20 = 306266403902896148L;
         Object[] var19 = var10006;
         Ref.h(306266403902896148L, var19, var20);
         Object[] var10007 = Registry.emptyArgs();
         long var22 = 623727123785142657L;
         Object[] var21 = var10007;
         var10007 = Ref.h(623727123785142657L, var21, var22);

         try {
         } catch (InvocationTargetException var42) {
            throw var42.getTargetException();
         }
      }

      if (var1 == null) {
         if (var44 == null) {
            return;
         }

         var44 = System.currentTimeMillis();
         Object var23 = 554051037585710089L;
         Object var45 = Ref.g(554051037585710089L, var23);
         Object var25 = 128810952447237716L;
         long var48;
         int var46 = (
                  var48 = var45
                     - Registry.lookupField(444246150125769098L).getLong(Ref.g(128810952447237716L, var25))
                     - (long)Registry.lookupField(151333549214908663L).getInt(this)
               )
               == 0L
            ? 0
            : (var48 < 0L ? -1 : 1);
      }

      if (var44 >= 0) {
         Object var27 = 554051037585710089L;
         Ref.g(554051037585710089L, var27);
         Object var29 = 128810952447237716L;
         Ref.g(128810952447237716L, var29);
         Object var31 = 293938313616336078L;
         Ref.g(293938313616336078L, var31);
         Object var33 = 554051037585710089L;
         Ref.g(554051037585710089L, var33);
         Object var35 = 128810952447237716L;
         Ref.g(128810952447237716L, var35);
         Object var37 = 162955545315895464L;
         Object[] var10011 = Registry.packArgs(Ref.g(162955545315895464L, var37));
         long var40 = 176011466134249595L;
         Object[] var39 = var10011;
         Ref.h(176011466134249595L, var39, var40);

         try {
            ;
         } catch (InvocationTargetException var41) {
            throw var41.getTargetException();
         }
      }
   }
}





