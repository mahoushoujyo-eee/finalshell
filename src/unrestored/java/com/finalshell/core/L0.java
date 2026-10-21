package com.finalshell.core;

import com.finalshell.connection.FileTransferConnection;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.TW3;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Vector;

public class L0 {
   public long E;
   public long u;
   public Thread A;
   public int J;
   public Vector B;
   public QB Q;
   public int Y;
   public int L;

   public L0(int var1) {
   super();
      boolean var10000 = FileTransferConnection.d$boolean();
      Registry.lookupField(313681502140473979L).setInt(this, 0);
      boolean var2 = var10000;
      Registry.lookupField(587987719470651652L).setInt(this, 0);
      Registry.lookupField(208184117373149257L).setInt(this, var1);
      Vector var10001 = new Vector();
      long var6 = 200915860947377828L;
      Vector var5 = var10001;
      Ref.s(200915860947377828L, var5, var6);
      int var3 = 0;

      while (true) {
         if (var3 < var1) {
            QB var4 = new QB();
            if (var2) {
               break;
            }

            if (!var2) {
               if (var3 == 0) {
                  long var8 = 304026184918353025L;
                  Ref.s(304026184918353025L, var4, var8);
               }

               Object var9 = 200915860947377828L;
               ((Vector)Ref.g(200915860947377828L, var9)).add(var4);
            }

            var3++;
            if (!var2) {
               continue;
            }
         }

         TW3 var10002 = new TW3(this);
         long var12 = 328888399667795027L;
         TW3 var11 = var10002;
         Ref.s(328888399667795027L, var11, var12);
         Object var13 = 328888399667795027L;
         ((Thread)Ref.g(328888399667795027L, var13)).start();
         break;
      }
   }

   public void X() {
      Object var1 = 328888399667795027L;
      ((Thread)Ref.g(328888399667795027L, var1)).interrupt();
   }

   public int S$int() {
      return Registry.lookupField(313681502140473979L).getInt(this);
   }

   public void P(int var1) {
      Registry.lookupField(313681502140473979L).setInt(this, var1);
   }

   public int a() {
      return Registry.lookupField(587987719470651652L).getInt(this);
   }

   public void F(int var1) {
      Registry.lookupField(587987719470651652L).setInt(this, var1);
   }

   public void S$void() {
      boolean var10000 = FileTransferConnection.X();
      int var2 = 0;
      boolean var1 = var10000;
      int var3 = 0;
      Object var6 = 200915860947377828L;
      Iterator var4 = ((Vector)Ref.g(200915860947377828L, var6)).iterator();

      while (true) {
         if (var4.hasNext()) {
            QB var5 = (QB)var4.next();
            var2 += Registry.lookupField(634944541091262560L).getInt(var5);
            var3 += Registry.lookupField(291580733527856622L).getInt(var5);
            if (!var1) {
               break;
            }

            if (var1) {
               continue;
            }
         }

         Object var10002 = (float)var3;
         Object var8 = 200915860947377828L;
         Registry.lookupField(313681502140473979L).setInt(var10002, (int)(this / (float)((Vector)Ref.g(200915860947377828L, var8)).size()));
         Object var10003 = (int)((float)var2);
         Object var10 = 200915860947377828L;
         Registry.lookupField(587987719470651652L).setInt(var10003, this / ((Vector)Ref.g(200915860947377828L, var10)).size());
         Object var12 = 200915860947377828L;
         ((Vector)Ref.g(200915860947377828L, var12)).remove(0);
         break;
      }

      QB var18 = new QB();
      long var15 = 304026184918353025L;
      Ref.s(304026184918353025L, var18, var15);
      Object var16 = 200915860947377828L;
      ((Vector)Ref.g(200915860947377828L, var16)).add(var18);
   }

   public void T(int var1) {
      Registry.lookupField(436456179109857455L).setLong(this, Registry.lookupField(436456179109857455L).getLong(this) + (long)var1);
      Object var2 = 304026184918353025L;
      Ref.g(304026184918353025L, var2);
      Object[] var10002 = Registry.packArgs(var1);
      long var5 = 322521174366635584L;
      Object[] var4 = var10002;
      Ref.h(322521174366635584L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void N(int var1) {
      Registry.lookupField(313231035437214097L).setLong(this, Registry.lookupField(313231035437214097L).getLong(this) + (long)var1);
      Object var2 = 304026184918353025L;
      Ref.g(304026184918353025L, var2);
      Object[] var10002 = Registry.packArgs(var1);
      long var5 = 364751476035821007L;
      Object[] var4 = var10002;
      Ref.h(364751476035821007L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void v() {
   }

   public void V() {
   }

   public void c(int var1) {
   }

   public void Z(int var1) {
   }
}





