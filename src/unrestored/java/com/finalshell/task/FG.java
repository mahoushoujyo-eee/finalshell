package com.finalshell.task;

import com.finalshell.core.MT;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Tf4;
import java.lang.reflect.InvocationTargetException;

public class FG implements Runnable {
   public final String X;
   public final String T;
   public final String K;
   public final Tf4 x;
   public final MT z;

   public FG(MT var1, String var2, String var3, String var4, Tf4 var5) {
      this.z = var1;
      this.X = var2;
      this.T = var3;
      this.K = var4;
      this.x = var5;
   }

   @Override
   public void run() {
      try {
         Object var2 = 319034145398702008L;
         Ref.g(319034145398702008L, var2);
         Object var4 = 219976392524080121L;
         Ref.g(219976392524080121L, var4);
         Object[] var10003 = Registry.emptyArgs();
         long var7 = 622340890791521181L;
         Object[] var6 = var10003;
         Ref.h(622340890791521181L, var6, var7);
         Object var8 = 172513830479908398L;
         Ref.g(172513830479908398L, var8);
         Object var10 = 142338921408466909L;
         Object[] var10006 = Registry.packArgs(this, Ref.g(142338921408466909L, var10));
         long var13 = 247777483328047393L;
         Object[] var12 = var10006;
         Ref.h(247777483328047393L, var12, var13);

         try {
            ;
         } catch (InvocationTargetException var29) {
            throw var29.getTargetException();
         }

         Object var14 = 319034145398702008L;
         Ref.g(319034145398702008L, var14);
         Object var16 = 400471378487267832L;
         Ref.g(400471378487267832L, var16);
         Object var18 = 172513830479908398L;
         Ref.g(172513830479908398L, var18);
         Object var20 = 142338921408466909L;
         Ref.g(142338921408466909L, var20);
         Object var22 = 605821607350219874L;
         Object var10014 = Ref.g(605821607350219874L, var22);
         Object var24 = 524368014565337208L;
         Object[] var10013 = Registry.packArgs(this, var10014, false, (boolean)this, Ref.g(524368014565337208L, var24), null);
         long var27 = 599514589999069238L;
         Object[] var26 = var10013;
         Ref.h(599514589999069238L, var26, var27);

         try {
            ;
         } catch (InvocationTargetException var28) {
            throw var28.getTargetException();
         }
      } catch (Exception var30) {
         var30.printStackTrace();
      }
   }
}





