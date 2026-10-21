package com.finalshell.task;

import com.finalshell.core.Lv4_2;
import com.finalshell.core.Yl4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.MainFrame;
import com.finalshell.ui.panel.FileCommandPanel;
import java.lang.reflect.InvocationTargetException;

public class OZ3 implements Runnable {
   public final FileCommandPanel h;
   public final Yl4 M;
   public final Lv4_2 MainFrame;
   public final MainFrame E;

   public OZ3(MainFrame var1, FileCommandPanel var2, Yl4 var3, Lv4_2 var4) {
      this.E = var1;
      this.h = var2;
      this.M = var3;
      this.U = var4;
   }

   @Override
   public void run() {
      Object var1 = 542785260238654605L;
      Ref.g(542785260238654605L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 239393919034688200L;
      Object[] var3 = var10002;
      Ref.h(239393919034688200L, var3, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 363759879239066771L;
      Object[] var5 = var10003;
      Ref.h(363759879239066771L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      Object var7 = 542785260238654605L;
      Ref.g(542785260238654605L, var7);
      Object[] var10005 = Registry.emptyArgs();
      long var10 = 239393919034688200L;
      Object[] var9 = var10005;
      Ref.h(239393919034688200L, var9, var10);
      Object var11 = 320880767863788237L;
      Ref.g(320880767863788237L, var11);
      Object[] var10008 = Registry.emptyArgs();
      long var14 = 323168880566913665L;
      Object[] var13 = var10008;
      Ref.h(323168880566913665L, var13, var14);
      Object var15 = 305562707889565747L;
      Object[] var10009 = Registry.packArgs(this, Ref.g(305562707889565747L, var15));
      long var18 = 142884213810215617L;
      Object[] var17 = var10009;
      Ref.h(142884213810215617L, var17, var18);

      try {
         ;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }
   }
   private static Object U;
}





