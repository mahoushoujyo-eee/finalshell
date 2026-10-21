package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.QA;
import com.finalshell.ui.dialog.UpdateDialog;
import java.lang.reflect.InvocationTargetException;
import org.apache.hc.client5.http.classic.HttpClient;

public class UR3 {
   UpdateDialog b;
   Fl4 l;
   long x;
   U52 G;
   public static long a;

   public UR3() {
      String[] var10000 = UpdateDialog.y();
      super();
      String[] var1 = var10000;
      if (var1 == null) {
         if ((String)Registry.lookupField(168719389020873220L).get(null) == null) {
            Registry.emptyArgs();
            long var3 = 472519974839574640L;
            Ref.h2(472519974839574640L, var3);

            try {
               ;
            } catch (InvocationTargetException var37) {
               throw var37.getTargetException();
            }
         }

         U52 var10001 = new U52();
         long var6 = 426183702342174078L;
         U52 var5 = var10001;
         Ref.s(426183702342174078L, var5, var6);
      }

      Object var7 = 426183702342174078L;
      Ref.g(426183702342174078L, var7);
      HttpClient var10002 = (HttpClient)(Registry.emptyArgs());
      long var10 = 288542378533398431L;
      Object[] var9 = var10002;
      var10002 = Ref.h(288542378533398431L, var9, var10);

      try {
         var10002 = (HttpClient)var10002;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      HttpClient var2 = var10002;
      Object var11 = 426183702342174078L;
      Ref.g(426183702342174078L, var11);
      Object[] var10004 = Registry.packArgs(var2);
      long var14 = 239107349030330982L;
      Object[] var13 = var10004;
      Ref.h(239107349030330982L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      Fl4 var10005 = new Fl4();
      long var16 = 609415999077358020L;
      Fl4 var15 = var10005;
      Ref.s(609415999077358020L, var15, var16);
      Object var17 = 609415999077358020L;
      Ref.g(609415999077358020L, var17);
      Object var19 = 426183702342174078L;
      Object[] var10008 = Registry.packArgs(Ref.g(426183702342174078L, var19));
      long var22 = 541244432942272416L;
      Object[] var21 = var10008;
      Ref.h(541244432942272416L, var21, var22);

      try {
         ;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      UpdateDialog var10010;
      Object var23 = 609415999077358020L;
new UR3(this, (Fl4)Ref.g(609415999077358020L, var23));
      long var26 = 434677565278618930L;
      UpdateDialog var25 = var10010;
      Ref.s(434677565278618930L, var25, var26);
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10011 = Registry.packArgs(new QA(this), (int)a);
      long var28 = 201859364639460244L;
      Object[] var27 = var10011;
      Ref.h(201859364639460244L, var27, var28);
      Object var29 = 434677565278618930L;
      Ref.g(434677565278618930L, var29);
      Object[] var10013 = Registry.emptyArgs();
      long var32 = 180191510188721772L;
      Object[] var31 = var10013;
      Ref.h(180191510188721772L, var31, var32);

      try {
         ;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }
   }

   public Fl4 u() {
      Object var1 = 609415999077358020L;
      return (Fl4)Ref.g(609415999077358020L, var1);
   }

   public void w(Fl4 var1) {
      long var3 = 609415999077358020L;
      Ref.s(609415999077358020L, var1, var3);
   }

   public U52 x() {
      Object var1 = 426183702342174078L;
      return (U52)Ref.g(426183702342174078L, var1);
   }

   public void Q(U52 var1) {
      long var3 = 426183702342174078L;
      Ref.s(426183702342174078L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6138861530632153997L;
      long var10002 = -6040079082595293083L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





