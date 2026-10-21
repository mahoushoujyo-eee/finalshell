package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

public class Dx4_2 {
   ArrayList T;
   BH n;

   public Dx4_2() {
      ArrayList var10001 = new ArrayList();
      long var2 = 620874131776678079L;
      ArrayList var1 = var10001;
      Ref.s(620874131776678079L, var1, var2);
   }

   public boolean B(String var1) {
      boolean var2 = false;
      Object var3 = 620874131776678079L;
      return ((ArrayList)Ref.g(620874131776678079L, var3)).contains(var1);
   }

   public int Q() {
      Object var1 = 620874131776678079L;
      return ((ArrayList)Ref.g(620874131776678079L, var1)).size();
   }

   public synchronized L1 o(L1 var1) {
      L1 var3 = null;
      ClearListDialog.i$arrString();
      Object var6 = 620874131776678079L;
      Iterator var4 = ((ArrayList)Ref.g(620874131776678079L, var6)).iterator();
      Dx4_2 var2 = this;

      while (var4.hasNext()) {
         L1 var5 = (L1)var4.next();
         if (var2 == null) {
            Object[] var10002 = Registry.emptyArgs();
            long var9 = 542058094445767607L;
            Object[] var8 = var10002;
            Ref.h(542058094445767607L, var8, var9);

            try {
               ;
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }

            String var10004 = (String)(Registry.emptyArgs());
            long var11 = 542058094445767607L;
            Object[] var10 = var10004;
            var10004 = Ref.h(542058094445767607L, var10, var11);

            try {
               var10004 = (String)var10004;
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            if (!var1.equals(var10004)) {
               continue;
            }
         }

         var3 = var5;
         break;
      }

      return var3;
   }

   public synchronized L1 a(String var1) {
      ClearListDialog.i$arrString();
      L1 var3 = null;
      Object var6 = 620874131776678079L;
      Iterator var4 = ((ArrayList)Ref.g(620874131776678079L, var6)).iterator();
      Dx4_2 var2 = this;

      while (var4.hasNext()) {
         L1 var5 = (L1)var4.next();
         if (var2 != null || var1 != null) {
            String var10003 = (String)(Registry.emptyArgs());
            long var9 = 542058094445767607L;
            Object[] var8 = var10003;
            var10003 = Ref.h(542058094445767607L, var8, var9);

            try {
               var10003 = (String)var10003;
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            if (var5.equals(var10003)) {
               var3 = var5;
               break;
            }
         }
      }

      return var3;
   }

   public synchronized void h(L1 var1) {
      String[] var2;
      label72: {
         var2 = ClearListDialog.i$arrString();
         L1 var10000 = var1;
         if (var2 == null) {
            if (var1 == null) {
               break label72;
            }

            var10000 = var1;
            Object[] var10001 = Registry.e(System.currentTimeMillis());
            long var7 = 250873246822364857L;
            Object[] var6 = var10001;
            Ref.h(250873246822364857L, var6, var7);

            try {
               ;
            } catch (InvocationTargetException var29) {
               throw var29.getTargetException();
            }

            Object[] var10003 = Registry.emptyArgs();
            long var9 = 542058094445767607L;
            Object[] var8 = var10003;
            var10003 = Registry.packArgs(Ref.h(542058094445767607L, var8, var9));
            long var11 = 200128008404143116L;
            Object[] var10 = var10003;
            Ref.h(200128008404143116L, var10, var11);

            try {
               ;
            } catch (InvocationTargetException var28) {
               throw var28.getTargetException();
            }
         }

         L1 var3 = var10000;
         if (var3 != null) {
            Object var12 = 620874131776678079L;
            ((ArrayList)Ref.g(620874131776678079L, var12)).remove(var3);
         }

         Object var14 = 620874131776678079L;
         ((ArrayList)Ref.g(620874131776678079L, var14)).add(0, var1);
      }

      int var30 = 0;
      Object var16 = 620874131776678079L;
      Iterator var4 = ((ArrayList)Ref.g(620874131776678079L, var16)).iterator();

      while (true) {
         if (var4.hasNext()) {
            L1 var5 = (L1)var4.next();
            Object[] var32 = Registry.packArgs(var30);
            long var19 = 124068231949608152L;
            Object[] var18 = var32;
            Ref.h(124068231949608152L, var18, var19);

            try {
               ;
            } catch (InvocationTargetException var27) {
               throw var27.getTargetException();
            }

            var30++;
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         Registry.emptyArgs();
         long var20 = 270389152141252877L;
         Ref.h2(270389152141252877L, var20);
         Object[] var10004 = Registry.emptyArgs();
         long var23 = 612604310671515822L;
         Object[] var22 = var10004;
         Ref.h(612604310671515822L, var22, var23);
         Object[] var10005 = Registry.emptyArgs();
         long var25 = 200561288808923907L;
         Object[] var24 = var10005;
         Ref.h(200561288808923907L, var24, var25);

         try {
            break;
         } catch (InvocationTargetException var26) {
            throw var26.getTargetException();
         }
      }
   }

   public void C(L1 var1) {
      ClearListDialog.i$arrString();
      Object var3 = 620874131776678079L;
      ArrayList var10002 = (ArrayList)Ref.g(620874131776678079L, var3);
      L1 var10004 = (L1)(Registry.packArgs(var1));
      long var6 = 152334479981629602L;
      Object[] var5 = var10004;
      var10004 = Ref.h(152334479981629602L, var5, var6);

      try {
         var10004 = (L1)var10004;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      this.remove(var10004);
      ArrayList var2 = var10002;
      if (var2 == null) {
         Object var7 = 138244215309433315L;
         if ((BH)Ref.g(138244215309433315L, var7) != null) {
            Object var9 = 138244215309433315L;
            Ref.g(138244215309433315L, var9);
            Object[] var10005 = Registry.packArgs(var1);
            long var12 = 485536741057184050L;
            Object[] var11 = var10005;
            Ref.h(485536741057184050L, var11, var12);

            try {
               ;
            } catch (InvocationTargetException var20) {
               throw var20.getTargetException();
            }
         }

         Registry.emptyArgs();
         long var13 = 270389152141252877L;
         Ref.h2(270389152141252877L, var13);
         Object[] var24 = Registry.emptyArgs();
         long var16 = 612604310671515822L;
         Object[] var15 = var24;
         Ref.h(612604310671515822L, var15, var16);
         Object[] var10006 = Registry.emptyArgs();
         long var18 = 200561288808923907L;
         Object[] var17 = var10006;
         Ref.h(200561288808923907L, var17, var18);

         try {
            ;
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
         }
      }
   }

   public ArrayList V() {
      Object var1 = 620874131776678079L;
      return (ArrayList)Ref.g(620874131776678079L, var1);
   }

   public void z(ArrayList var1) {
      long var3 = 620874131776678079L;
      Ref.s(620874131776678079L, var1, var3);
   }

   public BH z() {
      Object var1 = 138244215309433315L;
      return (BH)Ref.g(138244215309433315L, var1);
   }

   public void O(BH var1) {
      long var3 = 138244215309433315L;
      Ref.s(138244215309433315L, var1, var3);
   }
}





