package com.finalshell.ui.model;

import com.finalshell.core.Lv4_2;
import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.Comparator;
import javax.swing.tree.DefaultMutableTreeNode;

public class AY implements Comparator {
   public final Collator H;

   public AY(Collator var1) {
      this.H = var1;
   }

   public int w(DefaultMutableTreeNode var1, DefaultMutableTreeNode var2) {
      Ky4[] var10000 = YT3_2.c();
      Ck4 var4 = (Ck4)var1.getUserObject();
      Ky4[] var3 = var10000;
      Ck4 var5 = (Ck4)var2.getUserObject();
      Registry.emptyArgs();
      long var8 = 270389152141252877L;
      Ref.h2(270389152141252877L, var8);
      Object[] var10002 = Registry.emptyArgs();
      long var11 = 410905379772103887L;
      Object[] var10 = var10002;
      Ref.h(410905379772103887L, var10, var11);
      Lv4_2 var10004 = (Lv4_2)(Registry.emptyArgs());
      long var13 = 605430732347023634L;
      Object var12 = var10004;
      var10004 = Registry.packArgs(Ref.h(605430732347023634L, var12, var13));
      long var15 = 489768706953623433L;
      Object var14 = var10004;
      var10004 = Ref.h(489768706953623433L, var14, var15);

      try {
         var10004 = (Lv4_2)var10004;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }

      Lv4_2 var6 = var10004;
      Registry.emptyArgs();
      long var16 = 270389152141252877L;
      Ref.h2(270389152141252877L, var16);
      Object[] var10006 = Registry.emptyArgs();
      long var19 = 410905379772103887L;
      Object[] var18 = var10006;
      Ref.h(410905379772103887L, var18, var19);
      Lv4_2 var10008 = (Lv4_2)(Registry.emptyArgs());
      long var21 = 605430732347023634L;
      Object var20 = var10008;
      var10008 = Registry.packArgs(Ref.h(605430732347023634L, var20, var21));
      long var23 = 489768706953623433L;
      Object var22 = var10008;
      var10008 = Ref.h(489768706953623433L, var22, var23);

      try {
         var10008 = (Lv4_2)var10008;
      } catch (InvocationTargetException var38) {
         throw var38.getTargetException();
      }

      Lv4_2 var7 = var10008;
      Lv4_2 var46 = var6;
      if (var3 != null) {
         if (var6 == null) {
            return 1;
         }

         var46 = var7;
      }

      if (var3 == null || var46 != null) {
         String var10009 = (String)(Registry.emptyArgs());
         long var25 = 286931176286176762L;
         Object var24 = var10009;
         var10009 = Ref.h(286931176286176762L, var24, var25);

         try {
            var10009 = (String)var10009;
         } catch (InvocationTargetException var37) {
            throw var37.getTargetException();
         }

         if (var3 != null) {
            if (var10009 == null) {
               return 1;
            }

            var10009 = var7;
            Object[] var10010 = Registry.emptyArgs();
            long var27 = 286931176286176762L;
            Object[] var26 = var10010;
            Ref.h(286931176286176762L, var26, var27);

            try {
               ;
            } catch (InvocationTargetException var36) {
               throw var36.getTargetException();
            }
         }

         if (var10009 != null) {
            Object var28 = 598941198702022948L;
            Collator var49 = (Collator)Ref.g(598941198702022948L, var28);
            String var10012 = (String)(Registry.emptyArgs());
            long var31 = 286931176286176762L;
            Object var30 = var10012;
            var10012 = Ref.h(286931176286176762L, var30, var31);

            try {
               var10012 = (String)var10012;
            } catch (InvocationTargetException var35) {
               throw var35.getTargetException();
            }

            String var10014 = (String)(Registry.emptyArgs());
            long var33 = 286931176286176762L;
            Object var32 = var10014;
            var10014 = Ref.h(286931176286176762L, var32, var33);

            try {
               var10014 = (String)var10014;
            } catch (InvocationTargetException var34) {
               throw var34.getTargetException();
            }

            return var10012.compare((String)var7, (String)var10014);
         } else {
            return 1;
         }
      } else {
         return 1;
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object var10001 = Registry.packArgs((DefaultMutableTreeNode)var1, (DefaultMutableTreeNode)var2);
      long var4 = 498948069816695566L;
      Object var3 = var10001;
      var10001 = Ref.h(498948069816695566L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





