package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import javax.swing.RowFilter.Entry;

public class Lj2 extends Entry {
   public int h;
   public final DM3 n;

   public Lj2(DM3 var1) {
      this.n = var1;
   }

   @Override
   public Object getModel() {
      Object var1 = 184860797152005685L;
      Ref.g(184860797152005685L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 566043907753096060L;
      Object[] var3 = var10002;
      Ref.h(566043907753096060L, var3, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 118919302056896338L;
      Object[] var5 = var10003;
      var10003 = Ref.h(118919302056896338L, var5, var6);

      try {
         return (Object)var10003;
      } catch (InvocationTargetException var7) {
         throw new RuntimeException(var7.getTargetException());
      }
   }

   @Override
   public int getValueCount() {
      Object var1 = 184860797152005685L;
      Ref.g(184860797152005685L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 566043907753096060L;
      Object[] var3 = var10002;
      Ref.h(566043907753096060L, var3, var4);
      Object var10003 = Registry.emptyArgs();
      long var6 = 401679078758232861L;
      Object var5 = var10003;
      var10003 = Ref.h(401679078758232861L, var5, var6);

      try {
         return (Integer)var10003;
      } catch (InvocationTargetException var7) {
         throw new RuntimeException(var7.getTargetException());
      }
   }

   @Override
   public Object getValue(int var1) {
      Object var2 = 184860797152005685L;
      Ref.g(184860797152005685L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 566043907753096060L;
      Object[] var4 = var10002;
      Ref.h(566043907753096060L, var4, var5);
      Object[] var10003 = Registry.packArgs(((Integer)Ref.g(238213257117654142L, this)).intValue(), var1);
      long var7 = 533716037937215783L;
      Object[] var6 = var10003;
      var10003 = Ref.h(533716037937215783L, var6, var7);

      try {
         return (Object)var10003;
      } catch (InvocationTargetException var8) {
         throw new RuntimeException(var8.getTargetException());
      }
   }

   @Override
   public String getStringValue(int var1) {
      Object var2 = 184860797152005685L;
      Ref.g(184860797152005685L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 566043907753096060L;
      Object[] var4 = var10002;
      Ref.h(566043907753096060L, var4, var5);
      Object var10003 = Registry.packArgs(((Integer)Ref.g(238213257117654142L, this)).intValue(), var1);
      long var7 = 607512343893312129L;
      Object var6 = var10003;
      var10003 = Ref.h(607512343893312129L, var6, var7);

      try {
         return (String)var10003;
      } catch (InvocationTargetException var8) {
         throw new RuntimeException(var8.getTargetException());
      }
   }

   @Override
   public Object getIdentifier() {
      Object var1 = 184860797152005685L;
      Ref.g(184860797152005685L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 566043907753096060L;
      Object[] var3 = var10002;
      Ref.h(566043907753096060L, var3, var4);
      Object[] var10003 = Registry.packArgs(((Integer)Ref.g(238213257117654142L, this)).intValue());
      long var6 = 535790739651468868L;
      Object[] var5 = var10003;
      var10003 = Ref.h(535790739651468868L, var5, var6);

      try {
         return (Object)var10003;
      } catch (InvocationTargetException var7) {
         throw new RuntimeException(var7.getTargetException());
      }
   }

   public Lj2(DM3 var1, Ut4 var2) {
      this(var1);
   }
}





