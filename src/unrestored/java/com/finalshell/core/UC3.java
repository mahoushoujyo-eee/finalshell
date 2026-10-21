package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ImportExportPanel;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

public class UC3 implements UG {
   public final ImportExportPanel Z;

   public UC3(ImportExportPanel var1) {
      this.Z = var1;
   }

   @Override
   public void G(File var1) {
      Lv4_2 var2 = new Lv4_2();
      Object[] var10001 = Registry.packArgs(var1.getAbsolutePath());
      long var5 = 574053907803002361L;
      Object[] var4 = var10001;
      Ref.h(574053907803002361L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw new RuntimeException(var17.getTargetException());
      }

      try {
         Object[] var10002 = Registry.emptyArgs();
         long var7 = 540969864624467425L;
         Object[] var6 = var10002;
         Ref.h(540969864624467425L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var15) {
            throw new RuntimeException(var15.getTargetException());
         }

         Registry.emptyArgs();
         long var8 = 270389152141252877L;
         Ref.h2(270389152141252877L, var8);
         Object[] var10004 = Registry.emptyArgs();
         long var11 = 410905379772103887L;
         Object[] var10 = var10004;
         Ref.h(410905379772103887L, var10, var11);
         Object[] var10005 = Registry.packArgs(var1);
         long var13 = 426039508296790275L;
         Object[] var12 = var10005;
         Ref.h(426039508296790275L, var12, var13);

         try {
            ;
         } catch (InvocationTargetException var14) {
            throw new RuntimeException(var14.getTargetException());
         }
      } catch (Exception var16) {
         var16.printStackTrace();
      }
   }

   @Override
   public void U(File var1) {
      try {
         Registry.emptyArgs();
         long var3 = 270389152141252877L;
         Ref.h2(270389152141252877L, var3);
         Object[] var10002 = Registry.emptyArgs();
         long var6 = 410905379772103887L;
         Object[] var5 = var10002;
         Ref.h(410905379772103887L, var5, var6);
         Object[] var10003 = Registry.packArgs(var1);
         long var8 = 559611838312321344L;
         Object[] var7 = var10003;
         Ref.h(559611838312321344L, var7, var8);

         try {
            ;
         } catch (InvocationTargetException var9) {
            throw new RuntimeException(var9.getTargetException());
         }
      } catch (Exception var10) {
         var10.printStackTrace();
      }
   }

   @Override
   public void D(File var1) {
      Object var2 = 296068972390436422L;
      Ref.g(296068972390436422L, var2);
      Object[] var10002 = Registry.packArgs(var1.getAbsolutePath(), 0);
      long var5 = 295612812222941676L;
      Object[] var4 = var10002;
      Ref.h(295612812222941676L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }

   @Override
   public void d(File var1) {
   }

   @Override
   public void j(File var1) {
   }
}





