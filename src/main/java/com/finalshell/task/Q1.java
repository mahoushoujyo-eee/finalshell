package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Nq2;
import com.finalshell.ui.panel.Address;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class Q1 implements Runnable {
   public final Nq2 S;
   public final ArrayList f;
   public final String D;
   public final String d;
   public final String h;
   public final Address q;

   public Q1(Address var1, Nq2 var2, ArrayList var3, String var4, String var5, String var6) {
      this.q = var1;
      this.S = var2;
      this.f = var3;
      this.D = var4;
      this.d = var5;
      this.h = var6;
   }

   @Override
   public void run() {
      Object var1 = 397847941350605539L;
      Ref.g(397847941350605539L, var1);
      Object var3 = 573780545002942372L;
      Ref.g(573780545002942372L, var3);
      Object var5 = 284499839281730180L;
      Ref.g(284499839281730180L, var5);
      Object var7 = 302280156894978009L;
      Object var10007 = Ref.g(302280156894978009L, var7);
      Object var9 = 500672424769647067L;
      Object[] var10006 = Registry.packArgs(this, var10007, this, Ref.g(500672424769647067L, var9));
      long var12 = 566104538227199671L;
      Object[] var11 = var10006;
      Ref.h(566104538227199671L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }
   }
}





