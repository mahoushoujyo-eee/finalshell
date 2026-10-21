package com.finalshell.task;

import com.finalshell.core.MT;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class TI3 implements Runnable {
   final String n;
   final String W;
   final String E;
   final MT g;

   TI3(MT var1, String var2, String var3, String var4) {
      this.g = var1;
      this.n = var2;
      this.W = var3;
      this.E = var4;
   }

   @Override
   public void run() {
      try {
         Object var2 = 139637220479988407L;
         Ref.g(139637220479988407L, var2);
         Object var4 = 219976392524080121L;
         Ref.g(219976392524080121L, var4);
         Object[] var10003 = Registry.emptyArgs();
         long var7 = 622340890791521181L;
         Object[] var6 = var10003;
         Ref.h(622340890791521181L, var6, var7);
         Object var8 = 513731305386934069L;
         Ref.g(513731305386934069L, var8);
         Object var10 = 337966207493126884L;
         Object[] var10006 = Registry.packArgs(this, Ref.g(337966207493126884L, var10));
         long var13 = 247777483328047393L;
         Object[] var12 = var10006;
         Ref.h(247777483328047393L, var12, var13);

         try {
            ;
         } catch (InvocationTargetException var27) {
            throw var27.getTargetException();
         }

         Object var14 = 139637220479988407L;
         Ref.g(139637220479988407L, var14);
         Object var16 = 400471378487267832L;
         Ref.g(400471378487267832L, var16);
         Object var18 = 513731305386934069L;
         Ref.g(513731305386934069L, var18);
         Object var20 = 337966207493126884L;
         Object var10012 = Ref.g(337966207493126884L, var20);
         Object var22 = 582886898373027813L;
         var10012 = Registry.packArgs(var10012, this, Ref.g(582886898373027813L, var22));
         long var25 = 191848618899962223L;
         Object[] var24 = (Object[])var10012;
         Ref.h(191848618899962223L, var24, var25);

         try {
            ;
         } catch (InvocationTargetException var26) {
            throw var26.getTargetException();
         }
      } catch (Exception var28) {
         var28.printStackTrace();
      }
   }
}





