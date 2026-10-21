import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.Collator;
import java.util.Comparator;
import javax.swing.tree.DefaultMutableTreeNode;

class aY implements Comparator {
   final Collator H;

   aY(Collator var1) {
      this.H = var1;
   }

   public int w(DefaultMutableTreeNode var1, DefaultMutableTreeNode var2) {
      com.ky_4[] var10000 = yT_3.c();
      ck_4 var4 = (ck_4)var1.getUserObject();
      com.ky_4[] var3 = var10000;
      ck_4 var5 = (ck_4)var2.getUserObject();
      Object[] var20 = com.c.f();
      Method var21 = com.c.d(270389152141252877L);
      Object[] var60 = var20;
      Method var39 = null;

      try {
         var10000 = (com.ky_4[])var21.invoke(var39, var60);
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      var39 = com.c.f();
      Method var10003 = com.c.d(410905379772103887L);
      var60 = (Object[])var39;
      var39 = var10000;
      Method var23 = var10003;

      try {
         var10000 = (com.ky_4[])var23.invoke(var39, var60);
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      var60 = com.c.f();
      Method var10004 = com.c.d(605430732347023634L);
      Object[] var77 = var60;
      ck_4 var63 = var4;
      var39 = var10004;

      try {
         var39 = (Method)var39.invoke(var63, var77);
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      Object[] var44 = com.c.a(var39);
      var10003 = com.c.d(489768706953623433L);
      var60 = var44;
      var39 = var10000;
      Method var25 = var10003;

      try {
         var26 = (lv_4)var25.invoke(var39, var60);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      lv_4 var6 = var26;
      Object[] var27 = com.c.f();
      Method var28 = com.c.d(270389152141252877L);
      var60 = var27;
      var39 = null;

      try {
         var10000 = (com.ky_4[])var28.invoke(var39, var60);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      Object[] var48 = com.c.f();
      var10003 = com.c.d(410905379772103887L);
      var60 = var48;
      var39 = var10000;
      Method var30 = var10003;

      try {
         var10000 = (com.ky_4[])var30.invoke(var39, var60);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      var60 = com.c.f();
      var10004 = com.c.d(605430732347023634L);
      Object[] var80 = var60;
      ck_4 var69 = var5;
      var39 = var10004;

      try {
         var39 = (Method)var39.invoke(var69, var80);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      Object[] var52 = com.c.a(var39);
      var10003 = com.c.d(489768706953623433L);
      var60 = var52;
      var39 = var10000;
      Method var32 = var10003;

      try {
         var33 = (lv_4)var32.invoke(var39, var60);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      lv_4 var7 = var33;
      lv_4 var34 = var6;
      if (var3 != null) {
         if (var6 == null) {
            return 1;
         }

         var34 = var7;
      }

      if (var3 != null) {
         if (var34 == null) {
            return 1;
         }

         var34 = var6;
      }

      Object[] var54 = com.c.f();
      var10003 = com.c.d(286931176286176762L);
      var60 = var54;
      lv_4 var55 = var34;
      Method var35 = var10003;

      try {
         var36 = (String)var35.invoke(var55, var60);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      if (var3 != null) {
         if (var36 == null) {
            return 1;
         }

         Object[] var56 = com.c.f();
         var10003 = com.c.d(286931176286176762L);
         var60 = var56;
         lv_4 var57 = var7;
         Method var37 = var10003;

         try {
            var36 = (String)var37.invoke(var57, var60);
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }
      }

      if (var36 != null) {
         Collator var38 = (Collator)com.c.c(598941198702022948L).get(this);
         var60 = com.c.f();
         var10004 = com.c.d(286931176286176762L);
         Object[] var84 = var60;
         lv_4 var74 = var6;
         var39 = var10004;

         try {
            var59 = (String)var39.invoke(var74, var84);
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         Object[] var85 = com.c.f();
         Method var10005 = com.c.d(286931176286176762L);
         Object[] var89 = var85;
         lv_4 var86 = var7;
         Method var75 = var10005;

         try {
            var60 = (String)var75.invoke(var86, var89);
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }

         return var38.compare(var59, var60);
      } else {
         return 1;
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = com.c.a((DefaultMutableTreeNode)var1, (DefaultMutableTreeNode)var2);
      Method var10003 = com.c.d(498948069816695566L);
      Object[] var10002 = var10001;
      aY var4 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





