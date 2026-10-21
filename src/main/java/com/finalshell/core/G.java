package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class G implements Fb4 {
   final CK e;
   final SelectUploadFile N;

   G(SelectUploadFile var1, CK var2) {
      this.N = var1;
      this.e = var2;
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
      this.N.c = new YI(Registry.lookupField(183482007281545121L).getInt(null), var1, var2, var2, var3, false);
      Object[] var10001 = Registry.packArgs(this.e);
      long var7 = 200446375758088289L;
      Object[] var6 = var10001;
      Ref.h(200446375758088289L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      Object[] var10002 = Registry.e(var3);
      long var9 = 119264357941005086L;
      Object[] var8 = var10002;
      Ref.h(119264357941005086L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      Object[] var10003 = Registry.emptyArgs();
      long var11 = 605799167049228581L;
      Object[] var10 = var10003;
      Ref.h(605799167049228581L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      Registry.emptyArgs();
      long var12 = 270389152141252877L;
      Ref.h2(270389152141252877L, var12);
      Object[] var10005 = Registry.emptyArgs();
      long var15 = 377280722715900564L;
      Object[] var14 = var10005;
      Ref.h(377280722715900564L, var14, var15);
      Object[] var10006 = Registry.packArgs(this.N.c);
      long var17 = 118191003152152827L;
      Object[] var16 = var10006;
      Ref.h(118191003152152827L, var16, var17);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }
   }
}





