import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.tree.DefaultMutableTreeNode;

class dt_4 implements ActionListener {
   final l5_2 U;

   dt_4(l5_2 var1) {
      this.U = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var10000 = aA.z();
      Object[] var10001 = com.c.f();
      Method var37 = com.c.d(270389152141252877L);
      Object[] var89 = var10001;
      Method var65 = null;

      try {
         var10001 = (Object[])var37.invoke(var65, var89);
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      var65 = com.c.f();
      Method var10004 = com.c.d(634817973682994708L);
      var89 = (Object[])var65;
      var65 = var10001;
      Method var39 = var10004;

      try {
         var10001 = (Object[])var39.invoke(var65, var89);
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      var65 = com.c.f();
      var10004 = com.c.d(240567170779145617L);
      var89 = (Object[])var65;
      var65 = var10001;
      Method var41 = var10004;

      try {
         var10001 = (Object[])var41.invoke(var65, var89);
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      var65 = com.c.f();
      var10004 = com.c.d(226341449505323490L);
      var89 = (Object[])var65;
      var65 = var10001;
      Method var43 = var10004;

      try {
         var10001 = (U)var43.invoke(var65, var89);
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      U var3 = var10001;
      var65 = com.c.f();
      var10004 = com.c.d(153346140499032202L);
      var89 = (Object[])var65;
      var65 = var3;
      Method var45 = var10004;

      try {
         var10001 = (Object[])var45.invoke(var65, var89);
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      var65 = com.c.f();
      var10004 = com.c.d(221034384446077256L);
      var89 = (Object[])var65;
      var65 = var10001;
      Method var47 = var10004;

      try {
         var10001 = (mi_2)var47.invoke(var65, var89);
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      mi_2 var4 = var10001;
      String var2 = var10000;
      var10000 = (String)com.c.c(131037384951395357L).get(com.c.c(161577402438259293L).get(this));
      var10001 = com.c.f();
      Method var95 = com.c.d(148691699844242618L);
      var65 = var10001;
      var10001 = var10000;
      Method var24 = var95;

      try {
         var25 = (DefaultMutableTreeNode)var24.invoke(var10001, (Object[])var65);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      DefaultMutableTreeNode var5 = var25;
      var10000 = var5.getUserObject().getClass();
      if (var2 == null) {
         if (!var10000.equals(ck_4.class)) {
            return;
         }

         var10000 = (String)var5.getUserObject();
      }

      ck_4 var6 = (ck_4)var10000;
      Object[] var27 = com.c.f();
      Method var28 = com.c.d(270389152141252877L);
      var65 = var27;
      var10001 = null;

      try {
         var10000 = (String)var28.invoke(var10001, (Object[])var65);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      var10001 = com.c.f();
      Method var96 = com.c.d(410905379772103887L);
      var65 = var10001;
      var10001 = var10000;
      Method var30 = var96;

      try {
         var10000 = (String)var30.invoke(var10001, (Object[])var65);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      var65 = com.c.f();
      var10004 = com.c.d(272998330038223631L);
      var89 = (Object[])var65;
      var65 = var6;
      Method var55 = var10004;

      try {
         var10001 = (File)var55.invoke(var65, var89);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      var10001 = com.c.a(var10001.getAbsolutePath());
      Method var98 = com.c.d(489768706953623433L);
      var65 = var10001;
      var10001 = var10000;
      Method var32 = var98;

      try {
         var33 = (lv_4)var32.invoke(var10001, (Object[])var65);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      lv_4 var7 = var33;
      var65 = com.c.f();
      var10004 = com.c.d(380415140795833934L);
      var89 = (Object[])var65;
      var65 = var7;
      Method var59 = var10004;

      try {
         var10001 = (Object[])var59.invoke(var65, var89);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      var89 = com.c.f();
      Method var10005 = com.c.d(286931176286176762L);
      Object[] var110 = var89;
      lv_4 var101 = var7;
      var65 = var10005;

      try {
         var65 = (Method)var65.invoke(var101, var110);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      var10001 = com.c.a(var10001, var65);
      Method var102 = com.c.d(407547220859876749L);
      Object[] var87 = var10001;
      mi_2 var62 = var4;
      Method var34 = var102;

      try {
         var34.invoke(var62, var87);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      var10000 = (String)com.c.c(270550610354043937L).get(com.c.c(161577402438259293L).get(this));
      var10001 = com.c.a(false);
      Method var103 = com.c.d(634601920284847200L);
      Object[] var88 = var10001;
      var10001 = var10000;
      Method var36 = var103;

      try {
         var36.invoke(var10001, var88);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }
}





