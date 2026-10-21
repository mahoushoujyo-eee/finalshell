import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.Collator;
import java.util.Comparator;
import javax.swing.tree.DefaultMutableTreeNode;

class cp_4 implements Comparator {
   final Collator D;

   cp_4(Collator var1) {
      this.D = var1;
   }

   public int z(DefaultMutableTreeNode var1, DefaultMutableTreeNode var2) {
      tf_4 var3 = (tf_4)var1.getUserObject();
      tf_4 var4 = (tf_4)var2.getUserObject();
      Object[] var10000 = com.c.f();
      Method var17 = com.c.d(270389152141252877L);
      Object[] var48 = var10000;
      Method var31 = null;

      try {
         var10000 = (Object[])var17.invoke(var31, var48);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      var31 = com.c.f();
      Method var10003 = com.c.d(410905379772103887L);
      var48 = (Object[])var31;
      var31 = var10000;
      Method var19 = var10003;

      try {
         var10000 = (Object[])var19.invoke(var31, var48);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      var48 = com.c.f();
      Method var10004 = com.c.d(179612178163941306L);
      Object[] var63 = var48;
      tf_4 var51 = var3;
      var31 = var10004;

      try {
         var31 = (Method)var31.invoke(var51, var63);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      Object[] var36 = com.c.a(var31);
      var10003 = com.c.d(133273064107181210L);
      var48 = var36;
      var31 = var10000;
      Method var21 = var10003;

      try {
         var10000 = (lO_3)var21.invoke(var31, var48);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      lO_3 var5 = var10000;
      var10000 = com.c.f();
      Method var24 = com.c.d(270389152141252877L);
      var48 = var10000;
      var31 = null;

      try {
         var10000 = (Object[])var24.invoke(var31, var48);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      Object[] var40 = com.c.f();
      var10003 = com.c.d(410905379772103887L);
      var48 = var40;
      var31 = var10000;
      Method var26 = var10003;

      try {
         var10000 = (Object[])var26.invoke(var31, var48);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      var48 = com.c.f();
      var10004 = com.c.d(179612178163941306L);
      Object[] var66 = var48;
      tf_4 var57 = var4;
      var31 = var10004;

      try {
         var31 = (Method)var31.invoke(var57, var66);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      Object[] var44 = com.c.a(var31);
      var10003 = com.c.d(133273064107181210L);
      var48 = var44;
      var31 = var10000;
      Method var28 = var10003;

      try {
         var10000 = (lO_3)var28.invoke(var31, var48);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      lO_3 var6 = var10000;
      Collator var30 = (Collator)com.c.c(188947662693861377L).get(this);
      var48 = com.c.f();
      var10004 = com.c.d(286931176286176762L);
      Object[] var68 = var48;
      lO_3 var60 = var5;
      var31 = var10004;

      try {
         var47 = (String)var31.invoke(var60, var68);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Object[] var69 = com.c.f();
      Method var10005 = com.c.d(286931176286176762L);
      Object[] var73 = var69;
      lO_3 var70 = var6;
      Method var61 = var10005;

      try {
         var48 = (String)var61.invoke(var70, var73);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      return var30.compare(var47, var48);
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = com.c.a((DefaultMutableTreeNode)var1, (DefaultMutableTreeNode)var2);
      Method var10003 = com.c.d(503973597807962376L);
      Object[] var10002 = var10001;
      cp_4 var4 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





