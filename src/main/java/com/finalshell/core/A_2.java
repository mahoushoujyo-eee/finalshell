package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

public class A_2 implements Fb4 {
   public final File b;
   public final CK e;
   public final SelectUploadFile k;

   public A_2(SelectUploadFile var1, File var2, CK var3) {
      this.k = var1;
      this.b = var2;
      this.e = var3;
   }

   @Override
   public void a(int var1) {
      Object[] var10001 = Registry.emptyArgs();
      long var3 = 571070361007830286L;
      Object[] var2 = var10001;
      Ref.h(571070361007830286L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   @Override
   public void q(int var1, long var2, int var4) {
      Object[] var10001 = Registry.e((long)var4);
      long var6 = 349985227491593793L;
      Object[] var5 = var10001;
      Ref.h(349985227491593793L, var5, var6);
   }

   @Override
   public void d(int var1, String var2, long var3) {
      SelectUploadFile.r$String();
      String var6 = this.b.getAbsolutePath() + File.separator + var2;
      this.k.c = new YI(Registry.lookupField(183482007281545121L).getInt(null), var1, var6, null, var3, true);
      Object[] var10002 = Registry.packArgs(this.e);
      long var8 = 200446375758088289L;
      Object[] var7 = var10002;
      Ref.h(200446375758088289L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      Object[] var10003 = Registry.e(var3);
      long var10 = 119264357941005086L;
      Object[] var9 = var10003;
      Ref.h(119264357941005086L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      Object[] var10004 = Registry.packArgs(var2);
      long var12 = 266762783168573723L;
      Object[] var11 = var10004;
      Ref.h(266762783168573723L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      Object[] var10005 = Registry.emptyArgs();
      long var14 = 605799167049228581L;
      Object[] var13 = var10005;
      Ref.h(605799167049228581L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      Registry.emptyArgs();
      long var15 = 270389152141252877L;
      Ref.h2(270389152141252877L, var15);
      Object[] var10006 = Registry.emptyArgs();
      long var18 = 377280722715900564L;
      Object[] var17 = var10006;
      Ref.h(377280722715900564L, var17, var18);
      Object[] var10007 = Registry.packArgs(this.k.c);
      long var20 = 118191003152152827L;
      Object[] var19 = var10007;
      Ref.h(118191003152152827L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      if (Ky4.F$arrString() != null) {
         SelectUploadFile.Y("QxLumc");
      }
   }
}





