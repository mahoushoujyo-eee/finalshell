package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

public class Ft4 implements MouseListener {
   public final AM j;

   public Ft4(AM var1) {
      this.j = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      String[] var2 = AM.s$arrString();
      Registry.emptyArgs();
      long var3 = 299368763907830673L;
      Ref.h2(299368763907830673L, var3);
      Boolean var10002 = (Boolean)(Registry.emptyArgs());
      long var6 = 400084338690857485L;
      Object var5 = var10002;
      var10002 = Ref.h(400084338690857485L, var5, var6);

      try {
         var10002 = (Boolean)var10002;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      if (var2 == null) {
         if (var10002 == null) {
            return;
         }

         var10002 = (Boolean)(this);
         Object var7 = 276917056825011926L;
         Ref.g(276917056825011926L, var7);
         Object var9 = 142536030060271800L;
         Ref.g(142536030060271800L, var9);
         Object[] var10005 = Registry.emptyArgs();
         long var12 = 193033702979442502L;
         Object[] var11 = var10005;
         var10005 = Ref.h(193033702979442502L, var11, var12);

         try {
         } catch (InvocationTargetException var27) {
            throw var27.getTargetException();
         }
      }

      if (var10002 == null) {
         Registry.emptyArgs();
         long var13 = 299368763907830673L;
         Ref.h2(299368763907830673L, var13);
         Object[] var10004 = Registry.packArgs(true);
         long var16 = 271429106917420594L;
         Object[] var15 = var10004;
         Ref.h(271429106917420594L, var15, var16);

         try {
            ;
         } catch (InvocationTargetException var26) {
            throw var26.getTargetException();
         }

         Registry.emptyArgs();
         long var17 = 299368763907830673L;
         Ref.h2(299368763907830673L, var17);
         Object var19 = 276917056825011926L;
         Ref.g(276917056825011926L, var19);
         Object var21 = 142536030060271800L;
         Object[] var10008 = Registry.packArgs(Ref.g(142536030060271800L, var21));
         long var24 = 588837842234789414L;
         Object[] var23 = var10008;
         Ref.h(588837842234789414L, var23, var24);

         try {
            ;
         } catch (InvocationTargetException var25) {
            throw var25.getTargetException();
         }
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





